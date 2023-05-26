import q1.Aluno;
import q2.Pedido;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Aluno> listaAlunos= new ArrayList<Aluno>();
//
//        Aluno aluno1 = new Aluno("João", 12345);
//        Aluno aluno2 = new Aluno("Maria", 12346);
//        Aluno aluno3 = new Aluno("Pedro", 12347);
//
//        aluno1.setMapaDeNotas("Prova 1", 7.0F);
//        aluno1.setMapaDeNotas("Prova 2", 5.5F);
//        aluno1.setMapaDeNotas("Prova 3", 8.0F);
//        aluno1.setMapaDeNotas("Trabalho 1", 3.0F);
//        aluno1.setMapaDeNotas("Trabalho 2", 3.0F);
//
//        aluno2.setMapaDeNotas("Prova 1", 3.0F);
//        aluno2.setMapaDeNotas("Prova 2", 6.5F);
//        aluno2.setMapaDeNotas("Prova 3", 8.0F);
//        aluno2.setMapaDeNotas("Trabalho 1", 2.5F);
//        aluno2.setMapaDeNotas("Trabalho 2", 2.5F);
//
//        aluno3.setMapaDeNotas("Prova 1", 4.0F);
//        aluno3.setMapaDeNotas("Prova 2", 5.5F);
//        aluno3.setMapaDeNotas("Prova 3", 6.0F);
//        aluno3.setMapaDeNotas("Trabalho 1", 1.5F);
//        aluno3.setMapaDeNotas("Trabalho 2", 1.5F);
//
//        aluno1.calculoMedia();
//        aluno2.calculoMedia();
//        aluno3.calculoMedia();
//
//        listaAlunos.add(aluno1);
//        listaAlunos.add(aluno2);
//        listaAlunos.add(aluno3);
//
//        for(int i=0 ; i<3 ; i++){
//            System.out.println(listaAlunos.get(i));
//        }

        String option = "sim";
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        do {
            System.out.println("Pedido #" + (i+1));
            Pedido pedido = new Pedido(rnd.nextInt(10000)+1);
        } while (option == "sim");

        for (int i = 0; i < 5; i++) {
            System.out.println("Pedido #" + (i+1));
            Pedido pedido = new Pedido(rnd.nextInt(10000)+1);
            for (int j = 0; j < 3; j++) {
                System.out.println("Item #" + (j+1));
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
                System.out.print("Valor unitário: ");
                double valor = sc.nextDouble();
                sc.nextLine();
                pedido.addItem(nome, quantidade, valor);
            }
            pedidos.add(pedido);
        }

        int numPedidoMaisCaro = -1;
        int numPedidoMaisBarato = -1;
        double valorMaisCaro = Double.NEGATIVE_INFINITY;
        double valorMaisBarato = Double.POSITIVE_INFINITY;
        for (Pedido pedido : pedidos) {
            if (pedido.getValorTotal() > valorMaisCaro) {
                numPedidoMaisCaro = pedido.getNumPedido();
                valorMaisCaro = pedido.getValorTotal();
            }
            if (pedido.getValorTotal() < valorMaisBarato) {
                numPedidoMaisBarato = pedido.getNumPedido();
                valorMaisBarato = pedido.getValorTotal();
            }
        }

        System.out.println("Número do pedido mais caro: #" + numPedidoMaisCaro);
        System.out.println("Número do pedido mais barato: #" + numPedidoMaisBarato);

    }
}