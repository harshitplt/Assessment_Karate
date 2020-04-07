package part2;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;



public class JDatepcker extends JFrame{

    private static final long serialVersionUID = 23L;

    JFormattedTextField textField = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));

	public int calculatedage;
    

    public JDatepcker(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(368, 362);
        setTitle("BirthDatePicker");

        Container cont = getContentPane();
        FlowLayout fl = new FlowLayout();

        cont.setLayout(fl);
        cont.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        textField.setValue(new Date());
        textField.setPreferredSize(new Dimension(130, 30));

        cont.add(textField);

        JButton calbtn = new JButton("Pick");
        cont.add(calbtn);
    }
    
}