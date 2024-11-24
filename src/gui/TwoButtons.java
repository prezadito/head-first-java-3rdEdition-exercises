package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {
    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("Change Label");
//        labelButton.addActionListener(new LabelListener());
        labelButton.addActionListener(event -> label.setText("Ouch!"));

        JButton colorButton = new JButton("Change Circle");
//        colorButton.addActionListener(new ColorListener());
        colorButton.addActionListener(event -> frame.repaint());

        label = new JLabel("I’m a label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(640, 474);
        frame.setVisible(true);
    }

    /*
    public class LabelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }

    public class ColorListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
     */
}
