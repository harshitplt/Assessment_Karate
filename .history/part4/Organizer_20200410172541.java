package part4;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import part1.Karate;

public class Organizer extends JFrame implements ActionListener {

    private static final long serialVersionUID = 4L;

    JFrame Karate = new JFrame();
    ButtonGroup grp = new ButtonGroup();

    public Organizer() {

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel headingJPanel = new JPanel();
        JLabel headingLabel = new JLabel("Organise");
        headingJPanel.add(headingLabel);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cont1 = new GridBagConstraints();
        GridBagConstraints cont2 = new GridBagConstraints();

        cont1.insets = new Insets(10, 10, 10, 10);
        cont1.anchor = GridBagConstraints.WEST;

        cont2.insets = new Insets(6, 6, 6, 6);
        cont2.anchor = GridBagConstraints.SOUTH;

        cont2.gridx = 2;
        cont2.gridy = 2;
        cont2.gridheight = 4;
        cont2.gridwidth = 4;

        cont1.gridx = 0;
        cont1.gridy = 0;

        JLabel bowls = new JLabel("Enter Number of Bowls:");
        JTextField enterbowl = new JTextField(16);

        JButton nxtbtn = new JButton();
        nxtbtn.addActionListener(this);
        grp.add(nxtbtn);

        JButton hmebtn = new JButton();
        hmebtn.addActionListener(this);
        grp.add(hmebtn);

        panel.add(bowls, cont1);
        cont1.gridx = 1;
        panel.add(enterbowl, cont1);
        cont1.gridy = 0;
        cont1.gridx = 1;

        panel.add(nxtbtn, cont2);
        cont2.gridy = 2;
        // cont.gridx = 1;
        panel.add(hmebtn, cont2);
        cont2.gridy = 1;
        // cont.gridx = 2;

        mainPanel.add(headingJPanel);
        mainPanel.add(panel);

        Karate.add(mainPanel);
        Karate.pack();
        Karate.setSize(400, 400);
        Karate.setVisible(true);
        Karate.setLocationRelativeTo(null);
        Karate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }


    
}