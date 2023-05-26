import javax.swing.*;
import java.awt.*;

public class LearningBorderLayout {
    JFrame frame;

    public LearningBorderLayout(){
        frame = new JFrame();
        JButton botaoNorte = new JButton("Norte");
        JButton botaoSul = new JButton("Sul");
        JButton botaoLeste = new JButton("Leste");
        JButton botaoOeste = new JButton("Oeste");
        JButton botaoCentralizado = new JButton("Centralizado");

        frame.setLayout(new BorderLayout());
        frame.add(botaoNorte, BorderLayout.NORTH);
        frame.add(botaoSul, BorderLayout.SOUTH);
        frame.add(botaoLeste, BorderLayout.EAST);
        frame.add(botaoOeste, BorderLayout.WEST);
        frame.add(botaoCentralizado, BorderLayout.CENTER);

        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
