package Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mactry extends JFrame {
    JButton button1 = new JButton("Okay1");
    JButton button2 = new JButton("Okay2");
    public mactry(){
        setLayout(new GridLayout(1,2));
        add(button1);
        add(button2);
        setVisible(true);
        setSize(300,200);
        button1.addMouseListener(new button1Setup());
        button2.addMouseListener(new button2Setup());
    }

    public class button1Setup extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            JFrame frame = new JFrame("button1");
            JLabel label = new JLabel("Mac Mie 1");
            frame.add(label);
            frame.setVisible(true);
            frame.setSize(100, 100);
        }
    }

    public class button2Setup extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            JFrame frame = new JFrame("button2");
            JLabel label = new JLabel("Mac Mie 2");
            frame.add(label);
            frame.setVisible(true);
            frame.setSize(100, 100);
        }
    }

    public static void main(String args[]){
        new mactry();
    }

}
