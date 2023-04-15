import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rect {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton printButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("rect");
        frame.setContentPane(new rect().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JPanel main;

    public rect() {
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
