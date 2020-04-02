package part4;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import part1.Karate;

public class Organising {

    private static final long serialVersionUID = 4L;
    
    JFrame Karate = new JFrame();

    public Organising() {

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel headingJPanel = new JPanel();
        JLabel headingLabel = new JLabel("Organise");
        headingJPanel.add(headingLabel);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();
        GridBagConstraints cont2 = new GridBagConstraints();

        cont.insets = new Insets(8, 8, 8, 8);
        cont.anchor = GridBagConstraints.WEST;

        JLabel bowls = new JLabel("Enter Number of Bowls:");
        JTextField enterbowl = new JTextField(16);

        JButton nxtbtn = new JButton();
        JButton hmebtn = new JButton();

        panel.add(bowls, cont);
        cont.gridx = 1;
        panel.add(enterbowl, cont);
        cont.gridy = 0;
        cont.gridx = 1;

        panel.add(nxtbtn, cont2);
        cont2.gridy = 2;
        //cont2.gridx = 1;
        panel.add(hmebtn, cont2);
        cont2.gridy = 2;
        //cont2.gridx = 2;

        mainPanel.add(headingJPanel);
        mainPanel.add(panel);

        Karate.add(mainPanel);
        Karate.pack();
        Karate.setSize(400, 400);
        Karate.setVisible(true);
        Karate.setLocationRelativeTo(null);
        Karate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    
}