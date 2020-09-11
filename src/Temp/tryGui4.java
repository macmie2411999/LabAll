package Temp;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class tryGui4 {
    javax.swing.JButton button1;
    public tryGui4(){
        JFrame frame = new JFrame("Mac Mie");
        button1 = new JButton("click Here");
        frame.add(button1);
        frame.setSize(100, 200);
        frame.setVisible(true);
    }

    public void clickHereActionPerformed(ActionEvent e){
        button1.setText("Hi Mac Mie");
    }

    public static void main(String args[]){
        tryGui4 newGui = new tryGui4();
//        newGui.button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                newGui.button1.setText("Hi Mac Mie");
//            }
//        });
        //newGui.clickHereActionPerformed();
    }
}
