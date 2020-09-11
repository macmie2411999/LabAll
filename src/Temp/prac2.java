package Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prac2 extends JFrame {
    JTextArea jta1 = new JTextArea(10, 25);
    JButton button = new JButton("Add some Text");

    public prac2() {
        super("Example");
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String txt = JOptionPane.showInputDialog(null, "Insertsome text");
                jta1.append(txt);
            }
        });
    }

    public static void main(String[] args) {
        new prac2().setVisible(true);
    }
}
