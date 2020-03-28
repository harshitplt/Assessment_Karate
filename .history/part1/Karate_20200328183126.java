package part1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Karate extends JFrame implements ActionListener {

    JPanel ChoicePanel;
    JPanel ChoiceSelectionPanel;

    public Karate() {
        this.setSize(new Dimension(500, 500));
        this.setLayout(new BorderLayout());
        this.setTitle("Home");

        addChoiceFirstPanel();
        addChoiceLabel();
        addChoiceSelectionPanel();
        addChoiceFirst();
        addChoiceSecond();
        addChoiceThird();
        addSelectButton();

    }

    private void addChoiceFirstPanel() {
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
    }

    private void addChoiceSecond() {
        JRadioButton choicesecond = new JRadioButton("Organize");
        ChoiceSelectionPanel.add(choicesecond);
    }

    private void addChoiceThird() {
        JRadioButton choicethird = new JRadioButton("StudentList");
        ChoiceSelectionPanel.add(choicethird);
    }

    private void addSelectButton() {
        JButton selectbutton = new JButton("Ok.");
        ChoiceSelectionPanel.add(selectbutton);
    }

public static void main(String[] args) {
    Karate karate = new Karate();
    karate.setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

    part2.RegisterFormPage re = new part2.RegisterFormPage();
    re.setVisible(true);
};
}