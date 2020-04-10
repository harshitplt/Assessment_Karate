package part2;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.time.*;
import java.util.Calendar;

import javax.swing.ButtonGroup;

import javax.swing.JFormattedTextField;
import java.text.DateFormat;
import java.util.Date;


import part1.Karate;
import part3.StudentsList;
import part2.DatePickerForm;

public class RegisterFormPage extends JFrame implements ActionListener {

    private static final long serialVersionUID = 2L;

        JFrame karate = new JFrame("Registeration Form");
        ButtonGroup grp = new ButtonGroup();

        public RegisterFormPage(){

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel headingPanel = new JPanel();
        JLabel headingLabel = new JLabel("Students Registration");
        headingPanel.add(headingLabel);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints cont = new GridBagConstraints();

        cont.insets = new Insets(12, 12, 12, 50);
        cont.anchor = GridBagConstraints.WEST;

        cont.gridx = 0;
        cont.gridy = 0;

        JLabel Name = new JLabel("*Name:");
        JLabel Gender = new JLabel("*Gender:");
        JLabel BoD = new JLabel("*BoD:");
        JLabel age = new JLabel("*Age:");
        JLabel Address = new JLabel("Address:");
        JLabel Ph_no = new JLabel("Phone No:");
        JLabel belt = new JLabel("*Belt:");
        JLabel event = new JLabel("*Event:");

        JTextField nmfield = new JTextField(32);
        JRadioButton rbutton1 = new JRadioButton("Boy");
        JRadioButton rbutton2 = new JRadioButton("Girl");

        JFormattedTextField textField = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));
        textField.setValue(new Date());
        textField.setPreferredSize(new Dimension(130, 30));
        
        DatePickerForm datepicker = new DatePickerForm();
        

        Container container = getContentPane();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

                
        JScrollBar agescroller = new JScrollBar();
        JTextField address = new JTextField(32);
        JTextField phoneno = new JTextField(13);

        String[] beltselector = { "White", "Yellow", "Orange", "Blue", "Purple", "Green", "Brown", "Black" };

        JComboBox selectbelt = new JComboBox(beltselector);
        JCheckBox eventchecker1 = new JCheckBox("Kata");
        JCheckBox eventchecker2 = new JCheckBox("Kumite");

        panel.add(Name, cont);
        cont.gridx = 1;
        panel.add(nmfield, cont);
        cont.gridx = 0;
        cont.gridy = 1;
        cont.gridwidth = 2;

        panel.add(Gender, cont);
        cont.gridx = 1;
        panel.add(rbutton1, cont);
        cont.gridx = 0;
        cont.gridy = 2;

        cont.gridx = 1;
        panel.add(rbutton2, cont);
        cont.gridx = 0;
        cont.gridy = 3;

        panel.add(BoD, cont);
        cont.gridx = 1;
        panel.add(textField, cont);
        cont.gridx = 0;
        cont.gridy = 4;



        panel.add(age, cont);
        cont.gridx = 1;
        panel.add(agescroller, cont);
        cont.gridx = 0;
        cont.gridy = 5;

        panel.add(Address, cont);
        cont.gridx = 1;
        panel.add(address, cont);
        cont.gridx = 0;
        cont.gridy = 6;
        cont.gridwidth = 2;
        
        panel.add(Ph_no, cont);
        cont.gridx = 1;
        panel.add(phoneno, cont);
        cont.gridx = 0;
        cont.gridy = 7;

        panel.add(belt, cont);
        cont.gridx = 1;
        panel.add(selectbelt, cont);
        cont.gridx = 0;
        cont.gridy = 8;

        panel.add(event, cont);
        cont.gridx = 1;
        panel.add(eventchecker1, cont);
        cont.gridx = 0;
        cont.gridy = 9;

        cont.gridx = 1;
        panel.add(eventchecker2, cont);
        cont.gridx = 0;
        cont.gridy = 10;

        JButton btn1 = new JButton("Submit");
        btn1.addActionListener(this);
        grp.add(btn1);
        btn1.setActionCommand("Sub");
        JButton btn2 = new JButton("Reset");
        btn2.addActionListener(this);
        grp.add(btn2);
        btn2.setActionCommand("Rst");
        JButton btn3 = new JButton("Home");
        btn3.addActionListener(this);
        grp.add(btn3);
        btn3.setActionCommand("Hme");

        cont.insets = new Insets(20, 20, 20, 20);
        panel.add(btn1, cont);
        cont.gridx = 0;
        //cont.gridy = 11;
        panel.add(btn2, cont);
        cont.gridx = 2;
        //cont.gridy = 11;
        panel.add(btn3, cont);
        cont.gridx = 2;
        //cont.gridy = 11;

        mainPanel.add(headingPanel);
        mainPanel.add(panel);

        karate.add(mainPanel);
        karate.pack();
        karate.setSize(400, 400);
        karate.setVisible(true);
        karate.setLocationRelativeTo(null);
        karate.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        String btnVal = grp.getSelection().getActionCommand().toString();

        if (btnVal.equalsIgnoreCase("Sub"))
        {
            StudentsList sl = new StudentsList();
        }

        else if (btnVal.equalsIgnoreCase("Rst"))
        {
            RegisterFormPage rr = new RegisterFormPage();
        }

        else if (btnVal.equalsIgnoreCase("Hme"))
        {
            Karate kfp = new Karate();
        }


    }

}