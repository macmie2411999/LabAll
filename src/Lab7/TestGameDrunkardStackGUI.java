package Lab7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.stream.Stream;

public class TestGameDrunkardStackGUI extends JFrame {
    JButton firstPlayerButton;
    JButton secondPlayerButton;
    JButton startGame;
    JButton exitGame;
    JLabel nameFirstPlayer;
    JLabel nameSecondPlayer;
    JLabel cardsFirstPlayer;
    JLabel cardsSecondPlayer;
    JPanel optionGamePanel;
    JPanel firstPlayerPanel;
    JPanel secondPlayerPanel;
    JPanel showDetail;
    PlayerStack firstPlayer;
    PlayerStack secondPlayer;
    static int count = 0;

    public TestGameDrunkardStackGUI() {
        super("Game Drunkard Stack GUI");

        // build panel for first player
        firstPlayerPanel = new JPanel();
        firstPlayerButton = new JButton("Setup for First Player");
        nameFirstPlayer = new JLabel("Name: NULL");
        cardsFirstPlayer = new JLabel("Cards: NULL ");
        firstPlayerPanel.setLayout(new GridLayout(3, 1));
        firstPlayerPanel.add(firstPlayerButton);
        firstPlayerPanel.add(nameFirstPlayer);
        firstPlayerPanel.add(cardsFirstPlayer);
        firstPlayerButton.addMouseListener(new FirstPlayerSetup());

        // build panel for second player
        secondPlayerPanel = new JPanel();
        secondPlayerButton = new JButton("Setup for Second Player");
        nameSecondPlayer = new JLabel("Name: NULL");
        cardsSecondPlayer = new JLabel("Cards: NULL ");
        secondPlayerPanel.setLayout(new GridLayout(3, 1));
        secondPlayerPanel.add(secondPlayerButton);
        secondPlayerPanel.add(nameSecondPlayer);
        secondPlayerPanel.add(cardsSecondPlayer);
        secondPlayerButton.addMouseListener(new SecondPlayerSetup());

        // build panel for option
        optionGamePanel = new JPanel();
        startGame = new JButton("Start");
        exitGame = new JButton("Exit");
        optionGamePanel.setLayout(new FlowLayout());
        optionGamePanel.add(startGame);
        optionGamePanel.add(exitGame);
        startGame.addMouseListener(new StartGameSetup());
        exitGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // main window
        setLayout(new FlowLayout());
        add(firstPlayerPanel);
        add(secondPlayerPanel);
        add(optionGamePanel);
    }

    private class FirstPlayerSetup extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            firstPlayer = new PlayerStack();
            JFrame frame = new JFrame("Data First Player");
            frame.setLayout(new FlowLayout());
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setSize(300, 200);
            frame.setVisible(true);

            JPanel nameGetname = new JPanel();
            nameGetname.setLayout(new GridLayout(1, 2));
            JLabel labelNameTemp = new JLabel("Name: ");
            nameGetname.add(labelNameTemp);
            JTextField textFieldNameTemp = new JTextField(10);
            nameGetname.add(textFieldNameTemp);

            JPanel cardsGetCards = new JPanel();
            cardsGetCards.setLayout(new GridLayout(5, 2));

            // add 5 cards
            JLabel labelCards1Temp = new JLabel("Card 1:");
            cardsGetCards.add(labelCards1Temp);
            JTextField textFieldCards1Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards1Temp);

            JLabel labelCards2Temp = new JLabel("Card 2:");
            cardsGetCards.add(labelCards2Temp);
            JTextField textFieldCards2Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards2Temp);

            JLabel labelCards3Temp = new JLabel("Card 3:");
            cardsGetCards.add(labelCards3Temp);
            JTextField textFieldCards3Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards3Temp);

            JLabel labelCards4Temp = new JLabel("Card 4:");
            cardsGetCards.add(labelCards4Temp);
            JTextField textFieldCards4Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards4Temp);

            JLabel labelCards5Temp = new JLabel("Card 5:");
            cardsGetCards.add(labelCards5Temp);
            JTextField textFieldCards5Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards5Temp);

            JButton button = new JButton("Okay");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!textFieldNameTemp.getText().isEmpty() && !textFieldCards1Temp.getText().isEmpty() && !textFieldCards2Temp.getText().isEmpty() && !textFieldCards3Temp.getText().isEmpty() && !textFieldCards4Temp.getText().isEmpty() && !textFieldCards5Temp.getText().isEmpty()) {
                        firstPlayer.setName(textFieldNameTemp.getText());
                        nameFirstPlayer.setText("Name: " + firstPlayer.getName());

                        if (Integer.parseInt(textFieldCards1Temp.getText()) != 0) {
                            firstPlayer.postTray.push(Integer.parseInt(textFieldCards1Temp.getText()));
                        } else {
                            firstPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards2Temp.getText()) != 0) {
                            firstPlayer.postTray.push(Integer.parseInt(textFieldCards2Temp.getText()));
                        } else {
                            firstPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards3Temp.getText()) != 0) {
                            firstPlayer.postTray.push(Integer.parseInt(textFieldCards3Temp.getText()));
                        } else {
                            firstPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards4Temp.getText()) != 0) {
                            firstPlayer.postTray.push(Integer.parseInt(textFieldCards4Temp.getText()));
                        } else {
                            firstPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards5Temp.getText()) != 0) {
                            firstPlayer.postTray.push(Integer.parseInt(textFieldCards5Temp.getText()));
                        } else {
                            firstPlayer.postTray.push(10);
                        }
                        cardsFirstPlayer.setText("Cards: " + textFieldCards1Temp.getText() + " " + textFieldCards2Temp.getText() + " " + textFieldCards3Temp.getText() + " " + textFieldCards4Temp.getText() + " " + textFieldCards5Temp.getText());
                        frame.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "You need to fill all!", "Miss Something ", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            frame.add(nameGetname);
            frame.add(cardsGetCards);
            frame.add(button);
        }
    }

    private class SecondPlayerSetup extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            secondPlayer = new PlayerStack();
            JFrame frame = new JFrame("Data Second Player");
            frame.setVisible(true);
            frame.setLayout(new FlowLayout());
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setSize(300, 200);


            JPanel nameGetname = new JPanel();
            nameGetname.setLayout(new GridLayout(1, 2));
            JLabel labelNameTemp = new JLabel("Name: ");
            nameGetname.add(labelNameTemp);
            JTextField textFieldNameTemp = new JTextField(10);
            nameGetname.add(textFieldNameTemp);

            JPanel cardsGetCards = new JPanel();
            cardsGetCards.setLayout(new GridLayout(5, 2));

            // add 5 cards
            JLabel labelCards1Temp = new JLabel("Card 1:");
            cardsGetCards.add(labelCards1Temp);
            JTextField textFieldCards1Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards1Temp);

            JLabel labelCards2Temp = new JLabel("Card 2:");
            cardsGetCards.add(labelCards2Temp);
            JTextField textFieldCards2Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards2Temp);

            JLabel labelCards3Temp = new JLabel("Card 3:");
            cardsGetCards.add(labelCards3Temp);
            JTextField textFieldCards3Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards3Temp);

            JLabel labelCards4Temp = new JLabel("Card 4:");
            cardsGetCards.add(labelCards4Temp);
            JTextField textFieldCards4Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards4Temp);

            JLabel labelCards5Temp = new JLabel("Card 5:");
            cardsGetCards.add(labelCards5Temp);
            JTextField textFieldCards5Temp = new JTextField(10);
            cardsGetCards.add(textFieldCards5Temp);

            JButton button = new JButton("Okay");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!textFieldNameTemp.getText().isEmpty() && !textFieldCards1Temp.getText().isEmpty() && !textFieldCards2Temp.getText().isEmpty() && !textFieldCards3Temp.getText().isEmpty() && !textFieldCards4Temp.getText().isEmpty() && !textFieldCards5Temp.getText().isEmpty()) {
                        secondPlayer.setName(textFieldNameTemp.getText());
                        nameSecondPlayer.setText("Name: " + secondPlayer.getName());

                        if (Integer.parseInt(textFieldCards1Temp.getText()) != 0) {
                            secondPlayer.postTray.push(Integer.parseInt(textFieldCards1Temp.getText()));
                        } else {
                            secondPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards2Temp.getText()) != 0) {
                            secondPlayer.postTray.push(Integer.parseInt(textFieldCards2Temp.getText()));
                        } else {
                            secondPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards3Temp.getText()) != 0) {
                            secondPlayer.postTray.push(Integer.parseInt(textFieldCards3Temp.getText()));
                        } else {
                            secondPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards4Temp.getText()) != 0) {
                            secondPlayer.postTray.push(Integer.parseInt(textFieldCards4Temp.getText()));
                        } else {
                            secondPlayer.postTray.push(10);
                        }
                        if (Integer.parseInt(textFieldCards5Temp.getText()) != 0) {
                            secondPlayer.postTray.push(Integer.parseInt(textFieldCards5Temp.getText()));
                        } else {
                            secondPlayer.postTray.push(10);
                        }

                        cardsSecondPlayer.setText("Cards: " + textFieldCards1Temp.getText() + " " + textFieldCards2Temp.getText() + " " + textFieldCards3Temp.getText() + " " + textFieldCards4Temp.getText() + " " + textFieldCards5Temp.getText());
                        frame.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "You need to fill all!", "Miss Something ", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });

            frame.add(nameGetname);
            frame.add(cardsGetCards);
            frame.add(button);
        }
    }

    public class StartGameSetup extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            JFrame frame = new JFrame("Detail Steps");
            JButton button = new JButton("Done");
            button.setBounds(100, 30, 200, 50);
            JTextArea area = new JTextArea(10, 40);
            JScrollPane JScroll = new JScrollPane(area, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            button.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    frame.setVisible(false);
                }
            });
            firstPlayerButton.setVisible(false);
            secondPlayerButton.setVisible(false);
            startGame.setVisible(false);

            frame.setVisible(true);
            frame.setLayout(new FlowLayout());
            frame.add(JScroll);
            frame.add(button);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setSize(500, 260);

            area.append("Game Started");
            while (!firstPlayer.postTray.isEmpty() && !secondPlayer.postTray.isEmpty()) {
                //check cards
                Integer card1 = firstPlayer.postTray.pop();
                Integer card2 = secondPlayer.postTray.pop();
                if (card1 > card2) {
                    firstPlayer.rebuildPostTray(card1, card2);
                } else if (card1 < card2) {
                    secondPlayer.rebuildPostTray(card2, card1);
                } else {
                    JOptionPane.showMessageDialog(null, "Something wrong!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                area.append("\n------------Turn " + ++count + "-----------");
                // show results after check
                if (!firstPlayer.postTray.isEmpty()) {
                    Stream<Integer> streamFirstPlayer = firstPlayer.postTray.stream();
                    String stringFirstPlayerTemp = "\nCards of player " + firstPlayer.getName() + " (bottom to top): ";
                    StringBuilder stringFirstPlayer = new StringBuilder(stringFirstPlayerTemp);
                    streamFirstPlayer.forEach((element) -> {
                        if (element != 10) {
                            stringFirstPlayer.append("  " + element);
                        } else {
                            stringFirstPlayer.append("  " + 0);
                        }
                    });
                    area.append(stringFirstPlayer.toString());
                } else {
                    area.append("\nCards of player " + firstPlayer.getName() + ": Empty");
                }

                if (!secondPlayer.postTray.isEmpty()) {
                    Stream<Integer> streamSecondPlayer = secondPlayer.postTray.stream();
                    String stringSecondPlayerTemp = "\nCards of player " + secondPlayer.getName() + " (bottom to top): ";
                    StringBuilder stringSecondPlayer = new StringBuilder(stringSecondPlayerTemp);
                    streamSecondPlayer.forEach((element) -> {
                        if (element != 10) {
                            stringSecondPlayer.append("  " + element);
                        } else {
                            stringSecondPlayer.append("  " + 0);
                        }
                    });
                    area.append(stringSecondPlayer.toString());
                } else {
                    area.append("\nCards of player " + firstPlayer.getName() + ": Empty");
                }
            }

            // check winner
            area.append("\n------------RESULT-----------");
            if (count > 106) {
                area.append("\nBOTBA");
            }

            if (secondPlayer.postTray.isEmpty()) {
                area.append("\nFirst player " + firstPlayer.getName() + " win!");
            }

            if (firstPlayer.postTray.isEmpty()) {
                area.append("\nSecond player " + secondPlayer.getName() + " win!");
            }
        }
    }

    public static void main(String args[]) {
        TestGameDrunkardStackGUI obj = new TestGameDrunkardStackGUI();
        obj.setVisible(true);
        obj.setResizable(false);
        obj.setLocationRelativeTo(null);
        obj.setSize(400, 160);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
