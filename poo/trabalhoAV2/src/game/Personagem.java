package game;

import game.personagens.Alien;

public abstract class Personagem {
    protected String nome;
    protected int pontosVida;

    public Personagem(String nome, int pontosVida) {
        this.nome = nome;
        this.pontosVida = pontosVida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public boolean estaVivo(){
        return pontosVida > 0;
    }

    public void receberDano(int dano){
        pontosVida -= dano;
        if (pontosVida < 0) {
            pontosVida = 0;
        }
    }

    public abstract void atacar(Alien rival, int dado);
}
