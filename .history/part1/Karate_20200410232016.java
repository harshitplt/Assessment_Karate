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
import part4.Organizer;


public class Karate extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

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
        choicefirst.setActionCommand("bt1");
    }

    private void addChoiceSecond() {
        JRadioButton choicesecond = new JRadioButton("StudentList");
        ChoiceSelectionPanel.add(choicesecond);
        grp.add(choicesecond);
        choicesecond.setActionCommand("bt2");
    }

    private void addChoiceThird() {
        JRadioButton choicethird = new JRadioButton("Organize");
        ChoiceSelectionPanel.add(choicethird);
        grp.add(choicethird);
        choicethird.setActionCommand("bt3");

    }

    private void addSelectButton() {
        JButton selectbutton = new JButton("Ok.");
        ChoiceSelectionPanel.add(selectbutton);
        selectbutton.addActionListener(this);
        selectbutton.setActionCommand("okbtm");
    }    

    @Override
public void actionPerformed(ActionEvent e) {
    this.dispose();
    //RegisterFormPage re = new RegisterFormPage();

    String btnVal = grp.getSelection().getActionCommand().toString();

   if (btnVal.equalsIgnoreCase("bt1")) 
    {
        RegisterFormPage rre = new RegisterFormPage();
    }
        
    else if (btnVal.equalsIgnoreCase("bt2")) 
    {
        StudentsList pl = new StudentsList();
    }
        
    else if (btnVal.equalsIgnoreCase("bt3"))
    {
        Organizer or = new Organizer();
    }

};

public static void main(String[] args) {
    Karate karate = new Karate();
    karate.setVisible(true);
    karate.toFront();
}
}