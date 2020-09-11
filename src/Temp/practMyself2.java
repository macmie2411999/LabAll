package Temp;

import javax.swing.*;
import java.awt.*;

public class practMyself2 extends JFrame {
    JPanel[] jp = new JPanel[10];
    public practMyself2(){
        setSize(500, 500);
        setLayout(new GridLayout(2,5));
        for(int i=0; i<jp.length; i++){
            //jp[2].setSize(50,50);
            jp[i] = new JPanel();
            jp[i].add(new JButton("Mac " + i));
            // jp[i].setBackground(Color.red);
            add(jp[i]);
        }

        jp[2].setLayout(new BorderLayout());
        jp[2].add(new Button("one"), BorderLayout.EAST);
        jp[2].add(new Button("two"), BorderLayout.CENTER);

    }

    public static void main(String args[]){
        new practMyself2().setVisible(true);
    }
}
