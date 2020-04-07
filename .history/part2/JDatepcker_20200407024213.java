package part2;

import java.text.DateFormat;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;

public class JDatepcker extends JFrame{
    
    private static final long serialVersionUID = 23L;

    JFormattedTextField textField = new JFormattedTextField(DateFormat.getDateInstance(DateFormat.SHORT));

}