package part4;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

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

        JLabel bowls = new JLabel("Enter Number of Bowls:");
        JTextField enterbowl = new JTextField(8);

        JButton nxtbtn = new JButton();
        JButton hmebtn = new JButton();

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