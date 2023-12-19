package com.rodrigo.trabalhoarquitetura.Service;

import com.rodrigo.trabalhoarquitetura.Model.Usuario;
import com.rodrigo.trabalhoarquitetura.exeception.ExternalApiUnavailableException;
import com.rodrigo.trabalhoarquitetura.exeception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class UsuarioService {

    private RestTemplate restTemplate = new RestTemplate();

    private final String BASE_URL = "http://localhost:3000/usuarios/";

    public Usuario buscarUsuarioPorId(String id) {
    	String url = BASE_URL + id;
        try {
            return restTemplate.getForObject(url, Usuario.class);
        } catch (RestClientException e){
            if (e instanceof HttpClientErrorException) {
                HttpClientErrorException ex = (HttpClientErrorException) e;
                if (ex.getStatusCode() == HttpStatus.NOT_FOUND) {
                    throw new UserNotFoundException("Usuário não encontrado com id " + id);
                }
            }
            throw new ExternalApiUnavailableException("API externa indisponível");
        }

    }

}