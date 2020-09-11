package Temp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class thanTrieu4 extends JFrame implements ActionListener {
    // fields
    public JButton okayButton, exitButton, editButton;

    public thanTrieu4() {
        creatFrame();
    }

    private void creatFrame() {
        okayButton = new JButton("OK");
        exitButton = new JButton("Exit");
        editButton = new JButton("Edit");

        setSize(300, 100);

        // built structure
        this.setLayout(new FlowLayout());

        // add button
        this.add(okayButton);
        // Sets the command name for the action event fired by this button. By default this action command is set to match the label of the button.
        // like id of okayButton
        okayButton.setActionCommand("ok");

        // Register an instance of the event handler class as a listener on one or more components
        // catch event in okayButton
        okayButton.addActionListener(this);

        // use key to enter, key: alt + key
        okayButton.setMnemonic(KeyEvent.VK_O);

        // show tip when scan over button
        okayButton.setToolTipText("Okay okay");

        // and edit
        this.add(editButton);
        editButton.setActionCommand("edit");
        editButton.addActionListener(this);

        // and exit
        this.add(exitButton);
        exitButton.setActionCommand("exit");
        exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // if "ok" contains any actions, like click in
        if ("ok".equals(e.getActionCommand())){
            // JOptionPane makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something
            JOptionPane.showMessageDialog(rootPane, "You click ok");
        }

        if ("edit".equals(e.getActionCommand())){
            JOptionPane.showConfirmDialog(rootPane, "You click edit");
        }

        if ("exit".equals(e.getActionCommand())){
            //exit
            System.exit(0);
        }
    }

    public static void main(String args[]) {
        thanTrieu4 obj = new thanTrieu4();

        // statements can put anywhere
        obj.setVisible(true);
        // set window in the center
        obj.setLocationRelativeTo(null);
        // programe stop when window closes
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
