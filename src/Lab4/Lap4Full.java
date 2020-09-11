package Lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lap4Full extends JFrame {
    // fields
    static int countACMilan = 0;
    static int countRealMadrid = 0;
    JButton buttonACMilan;
    JButton buttonRealMadrid;
    JLabel labelResult;
    JLabel labelLastScores;
    JLabel labelWinner;

    // constructor
    public Lap4Full() {
        // set title and layout
        super("Soccer Gameplay");
        setLayout(new GridLayout(5, 1));

        // set up for button AC Milan
        buttonACMilan = new JButton("AC Milan");
        add(buttonACMilan);
        buttonACMilan.addMouseListener(new ACMilanListner());

        // set up for button Real Marid
        buttonRealMadrid = new JButton("Real Madrid");
        add(buttonRealMadrid);
        buttonRealMadrid.addMouseListener(new RealMadridListner());

        // set up for labelResult
        labelResult = new JLabel("Result: 0 x 0");
        add(labelResult);

        // set up for labelLastScores
        labelLastScores = new JLabel("Last Scores: N/A");
        add(labelLastScores);

        // set up for labelWinner
        labelWinner = new JLabel("Winner: DRAW");
        add(labelWinner);
    }

    // class helps setup when get event on button ACMilan
    public class ACMilanListner extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            countACMilan++;
            labelResult.setText(String.format("Result: %d x %d", countACMilan, countRealMadrid));
            labelLastScores.setText(String.format("Last Scores: AC Milan"));

            // check winner
            if (countACMilan > countRealMadrid) {
                labelWinner.setText(String.format("Winner: AC Milan"));
            } else if (countACMilan < countRealMadrid) {
                labelWinner.setText(String.format("Winner: Real Madrid"));
            } else {
                labelWinner.setText(String.format("Winner: DRAW"));
            }
        }
    }

    // class helps setup when get event on button RealMadridListner
    public class RealMadridListner extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            countRealMadrid++;
            labelResult.setText(String.format("Result: %d x %d", countACMilan, countRealMadrid));
            labelLastScores.setText(String.format("Last Scores: Real Madrid"));

            // check winner
            if (countACMilan > countRealMadrid) {
                labelWinner.setText(String.format("Winner: AC Milan"));
            } else if (countACMilan < countRealMadrid) {
                labelWinner.setText(String.format("Winner: Real Madrid"));
            } else {
                labelWinner.setText(String.format("Winner: DRAW"));
            }
        }
    }

    public static void main(String args[]) {
        Lap4Full obj = new Lap4Full();
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setLocationRelativeTo(null);
        obj.setSize(300, 200);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
