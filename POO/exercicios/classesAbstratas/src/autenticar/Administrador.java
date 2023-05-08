package autenticar;

public class Administrador extends Usuario implements Autenticavel{
    public Administrador(String login, String senha, String role) {
        super(login, senha, role);
    }

    @Override
    public String autenticar(String senha) {
        if (super.autenticar(senha) == "400"){
            return "HTTP:400 - O login e/ou senha estão incorretos tente novamente";
        } else {
            if(this.role == "admin"){
                return "O usuario entrou e possui permissão de admin";
            } else {
                return "O usuario entrou e não possui permissão de admin";
            }
        }

    }
}
