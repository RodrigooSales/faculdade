package application;

import game.Personagem;
import game.personagens.MuqueMan;
import game.personagens.RaioLaser;
import game.personagens.Relampago;

import java.util.Random;
import java.util.Scanner;

public class GameController {

    public GameController() {
    }

    public static Personagem escolherPersonagem() {
        System.out.println("Escolha um personagem:");
        System.out.println("1. Muque-Man");
        System.out.println("2. Raio-Laser");
        System.out.println("3. Relâmpago");

        int escolha;
        do {
            escolha = obterInteiroInput("Digite o número correspondente ao personagem escolhido: ");
        } while (escolha < 1 || escolha > 3);

        switch (escolha) {
            case 1:
                return new MuqueMan();
            case 2:
                return new RaioLaser();
            case 3:
                return new Relampago();
            default:
                return null; // Nunca deveria ocorrer
        }
    }

    public static int jogarDado() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    public static int obterInteiroInput(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Entrada inválida. " + mensagem);
        }
        return scanner.nextInt();
    }
}