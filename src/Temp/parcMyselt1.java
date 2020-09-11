package Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class parcMyselt1 extends JFrame {
    JTextArea area = new JTextArea(5, 25);
    JScrollPane JScroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

    JButton button1 = new JButton("Add text 1");
    JButton button2 = new JButton("Add text 2");

    public parcMyselt1() {
        super("New Windows");
        setSize(300, 300);
        setLayout(new FlowLayout());
        this.add(JScroll);
        this.add(button1);
        this.add(button2);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog(null, "Input Text Here");
                area.append(text);
            }
        });

        button2.setActionCommand("Add text 2");
        ActionListener acLis = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog(null, "Input Text Here");
                area.append(text);
            }
        };
        button2.addActionListener(acLis);

    }

    public static void main(String args[]) {
        new parcMyselt1().setVisible(true);
    }
}
