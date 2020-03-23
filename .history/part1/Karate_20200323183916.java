package part1;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Karate extends JFrame {

    JPanel ChoicePanel;
    JPanel ChoiceSelectionPanel;

    public Karate() {
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());

        addChoicePanel();
        addChoiceLabel();
        addChoiceSelectionPanel();
        addChoiceFirst();

    }

    
    private void addChoicePanel() {
        ChoicePanel = new JPanel();
        this.add(ChoicePanel, BorderLayout.NORTH);
    }
    
    private void addChoiceLabel() {
        final JLabel choicelabel = new JLabel("KARATE");
        ChoicePanel.add(choicelabel);
    }

    private void addChoiceSelectionPanel() {
        ChoiceSelectionPanel = new JPanel();
        this.add(ChoiceSelectionPanel, BorderLayout.CENTER);
    }

    private void addChoiceFirst() {
        final JRadioButton choicefirst = new JRadioButton("Registration");
        ChoiceSelectionPanel.add(choicefirst);
    }


public static void main(final String[] args) {
    final Karate karate = new Karate();
    karate.setVisible(true);
}
}