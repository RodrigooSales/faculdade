package game.personagens;

import game.Personagem;

public class RaioLaser extends Personagem {
    private static final int GOLPE_FRACO = 10;
    private static final int GOLPE_MEDIANO = 20;
    private static final int GOLPE_FORTE = 40;
    private int danoAdicional;

    public RaioLaser() {
        super("Raio-Laser", 200);
        this.danoAdicional = 0;
    }

    @Override
    public void atacar(Alien rival, int dado) {
        int dano;
        if (dado <= 2) {
            dano = GOLPE_FRACO;
        } else if (dado >= 3 && dado <= 5) {
            dano = GOLPE_MEDIANO;
        } else {
            dano = GOLPE_FORTE;
        }
        dano += danoAdicional;
        rival.receberDano(dano);
        danoAdicional += 3;
    }
}

