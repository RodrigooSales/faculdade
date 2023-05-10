package game.personagens;

import game.Personagem;

public class Alien {
    private String nome;
    private int pontosVida;

    public Alien() {
        this.nome = "Rival Alienígena";
        this.pontosVida = 200;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public boolean estaVivo() {
        return pontosVida > 0;
    }

    public void receberDano(int dano) {
        pontosVida -= dano;
        if (pontosVida < 0) {
            pontosVida = 0;
        }
    }

    public void receberDanoExtra(int danoExtra) {
        pontosVida -= danoExtra;
        if (pontosVida < 0) {
            pontosVida = 0;
        }
    }

    public void atacar(Personagem personagem, int dado) {
        int dano;
        if (dado <= 2) {
            dano = 10;
        } else if (dado >= 3 && dado <= 5) {
            dano = 20;
        } else {
            dano = 40;
        }
        personagem.receberDano(dano);
    }
}
