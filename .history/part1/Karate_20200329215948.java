package part1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import part2.RegisterFormPage;
import part3.StudentsList;
import part4.Organising;

public class Karate extends JFrame implements ActionListener {

    JPanel ChoicePanel;
    JPanel ChoiceSelectionPanel;
    ButtonGroup grp = new ButtonGroup();

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
        grp.add(choicefirst);
    }

    private void addChoiceSecond() {
        JRadioButton choicesecond = new JRadioButton("Organize");
        ChoiceSelectionPanel.add(choicesecond);
        grp.add(choicesecond);
    }

    private void addChoiceThird() {
        JRadioButton choicethird = new JRadioButton("StudentList");
        ChoiceSelectionPanel.add(choicethird);
        grp.add(choicethird);
    }

    private void addSelectButton() {
        JButton selectbutton = new JButton("Ok.");
        ChoiceSelectionPanel.add(selectbutton);
        selectbutton.addActionListener(this);
    }    

    @Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub

    if (e.getActionCommand().equals("Registration")){
        RegisterFormPage re = new RegisterFormPage();
    }

    else if (e.getActionCommand().equals("StudentList")){
        StudentsList pl = new StudentsList();
    }

    else if (e.getActionCommand().equals("Organize")){
        Organising or = new Organising();
    }

};

public static void main(String[] args) {
    Karate karate = new Karate();
    karate.setVisible(true);
}
}