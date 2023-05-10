package game.personagens;

import game.Personagem;

public class Relampago extends Personagem {
    private static final int GOLPE_FRACO = 10;
    private static final int GOLPE_MEDIANO = 20;
    private static final int GOLPE_FORTE = 40;



    public Relampago() {
        super("Relâmpago", 200);
    }

    @Override
    public void atacar(Alien rival, int dado) {
        int dano;
        if (dado <= 2) {
            dano = GOLPE_FRACO;
        } else if (dado >= 3 && dado <= 5){
            dano = GOLPE_MEDIANO;
        } else {
            dano = GOLPE_FORTE;
        }
        rival.receberDano(dano);
        rival.receberDanoExtra(3);
        }
    }
