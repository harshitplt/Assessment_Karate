package part1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Karate extends JFrame {

    JPanel ChoicePanel;
    JPanel ChoiceSelectionPanel;
    private GridBagConstraints constraints;

    public Karate() {
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());

        addChoicePanel();
        addChoiceLabel();
        addChoiceSelectionPanel();
        addChoiceFirst();
        addChoiceSecond();
        addChoiceThird();
    }

    private void addChoicePanel() {
        ChoicePanel = new JPanel();
        this.add(ChoicePanel, BorderLayout.NORTH);
    }
    
    private void addChoiceLabel() {
        JLabel choicelabel = new JLabel("KARATE");
        ChoicePanel.add(choicelabel);
    }

    private void addChoiceSelectionPanel() {
        ChoiceSelectionPanel = new JPanel();
        this.add(ChoiceSelectionPanel, BorderLayout.CENTER);
    }

    private void addChoiceFirst() {
        JRadioButton choicefirst = new JRadioButton("Registration");
        ChoiceSelectionPanel.add(choicefirst);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
    }

    private void addChoiceSecond() {
        JRadioButton choicesecond = new JRadioButton("Organize");
        ChoiceSelectionPanel.add(choicesecond);
    }

    private void addChoiceThird() {
        JRadioButton choicethird = new JRadioButton("StudentList");
        ChoiceSelectionPanel.add(choicethird);
    }

public static void main(final String[] args) {
    final Karate karate = new Karate();
    karate.setVisible(true);
}
}