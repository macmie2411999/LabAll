package Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class pract5 extends JFrame {
    JLabel lbl = new JLabel("");

    public pract5() {
        super("Dude! Where's my mouse ?");
        setSize(400, 400);
        setLayout(new BorderLayout());
        add(lbl, BorderLayout.SOUTH);
        addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a) {
            }

            public void mouseClicked(MouseEvent a) {
                lbl.setText("X=" + a.getX() + " Y=" + a.getY());
            }

            public void mouseEntered(MouseEvent a) {
            }

            public void mouseReleased(MouseEvent a) {
            }

            public void mousePressed(MouseEvent a) {
            }
        });
    }

    public static void main(String[] args) {
        new pract5().setVisible(true);
    }
}
