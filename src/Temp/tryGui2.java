package Temp;

import javax.swing.*;
import java.awt.*;

public class tryGui2 extends JFrame {
    // Creates a new empty TextField with the specified number of columns.
    JTextField jta = new JTextField(10);

    // creat font obj
    Font fnt = new Font("Time new roman", Font.BOLD, 20);

    // constructor
    tryGui2(){
        // name title
        super("Example");

        // ?
        setLayout(new FlowLayout());

        // set size for  window
        setSize(550, 100);

        // add obj line to window
        add(jta);

        // set color for words in line
        jta.setForeground(Color.PINK);

        // set font for words in line
        jta.setFont(fnt);

        // show window
        setVisible(true);
    }

    public static void main(String args[]){
        new tryGui2();
    }
}
