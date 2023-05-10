import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        String firstNumber = JOptionPane.showInputDialog("Entre com o primeiro numero");
//        String secondNumber = JOptionPane.showInputDialog("Entre com o segundo numero");
//
//        int number1 = Integer.parseInt(firstNumber);
//        int number2 = Integer.parseInt(secondNumber);
//        int sum = number1 + number2;
//
//        JOptionPane.showMessageDialog(null, "A soma é " + sum, "Soma total de 2 inteiros", JOptionPane.PLAIN_MESSAGE);

        JFrame jFrame= new JFrame("Unifor - POO");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 400);
        jFrame.setVisible(true);
    }
}