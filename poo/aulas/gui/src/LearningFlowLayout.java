import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LearningFlowLayout {
    JFrame frame;

    public LearningFlowLayout(){
        frame = new JFrame();
        JTextField tf = new JTextField();
        tf.setBounds(100, 100, 100, 100);
        JButton b1 = new JButton("Clique aqui");

        frame.add(tf);
        frame.add(b1);

        frame.setLayout(new FlowLayout());
        frame.setSize(600, 600);
        frame.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = tf.getText();
                JOptionPane.showMessageDialog(null, "Você digitou: " + texto);
                tf.setText("Valeu");
            }
        });
    }
}
