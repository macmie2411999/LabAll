package Temp;

import javax.swing.*;
import java.awt.*;

public class tryGui1 {
    public static void main(String[] arg){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                creatAndShowGui();
            }
        });
    }

    public static void creatAndShowGui(){
        // creat new widow
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add text in window
        Label newLaber = new Label("Hello World");
        frame.getContentPane().add(newLaber);

        // display the window
        frame.pack();
        frame.setVisible(true);
    }
}
