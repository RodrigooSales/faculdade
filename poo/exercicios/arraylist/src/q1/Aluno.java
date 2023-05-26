package q1;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String nome;
    private int matricula;
    private float media;
    private Map<String, Float> mapaDeNotas = new HashMap<>();

    public Aluno() {
        super();
    }

    public Aluno(String nome, int matricula) {
        super();
        this.nome = nome;
        this.matricula = matricula;
    }

    public Aluno(String nome, int matricula, Map<String, Float> mapaDeNotas, float media) {
        this.nome = nome;
        this.matricula = matricula;
        this.mapaDeNotas = mapaDeNotas;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<String, Float> getMapaDeNotas() {
        return mapaDeNotas;
    }

    public void setMapaDeNotas(String tarefa, Float nota) {
        this.mapaDeNotas.put(tarefa, nota);
    }

    public float calculoMedia(){
        media = ((mapaDeNotas.get("Prova 1") + mapaDeNotas.get("Trabalho 1")) + (mapaDeNotas.get("Prova 2") + mapaDeNotas.get("Trabalho 2")) + mapaDeNotas.get("Prova 3"))/3;
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome = " + nome +
                ", matricula = " + matricula +
                ", media = " + media +
                '}';
    }
}
