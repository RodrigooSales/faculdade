package application;

import game.Personagem;
import game.personagens.Alien;

import static application.GameController.escolherPersonagem;

public class Main {
    public static void main(String[] args) {
        Personagem jogador = escolherPersonagem();
        Alien rival = new Alien();
        GameController gc = new GameController();

        int rodada = 1;
        while (rodada <= 6 && jogador.estaVivo() && rival.estaVivo()) {
            System.out.println("Rodada " + rodada);
            System.out.println("Jogador: " + jogador.getNome() + " | Vida: " + jogador.getPontosVida());
            System.out.println("Rival: " + rival.getNome() + " | Vida: " + rival.getPontosVida());

            int dadoJogador = gc.jogarDado();
            int dadoRival = gc.jogarDado();
            System.out.println("Resultado dado jogador:" + dadoJogador);
            System.out.println("Resultado dado rival alienigena: " + dadoRival);

            jogador.atacar(rival, dadoJogador);
            rival.atacar(jogador, dadoRival);

            rodada++;
        }

        System.out.println("Fim do jogo!");

        if (!jogador.estaVivo() && !rival.estaVivo()) {
            System.out.println("Empate! Ambos perderam toda a vida.");
        } else if (!jogador.estaVivo()) {
            System.out.println("O Rival " + rival.getNome() + " venceu!");
        } else if (!rival.estaVivo()) {
            System.out.println("O jogador " + jogador.getNome() + " venceu!");
        } else {
            int pontosVidaJogador = jogador.getPontosVida();
            int pontosVidaRival = rival.getPontosVida();
            if (pontosVidaJogador > pontosVidaRival) {
                System.out.println("O jogador " + jogador.getNome() + " venceu!");
            } else if (pontosVidaRival > pontosVidaJogador) {
                System.out.println("O Rival " + rival.getNome() + " venceu!");
            } else {
                System.out.println("Empate! Ambos têm a mesma quantidade de vida.");
            }
        }
    }
}