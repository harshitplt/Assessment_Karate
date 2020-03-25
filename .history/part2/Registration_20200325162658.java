package part2;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JFrame {

    JFrame form = new JFrame();
    form.setTitle("Registration Form");

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

    JPanel headingPanel = new JPanel();
    JLabel headingLabel = new JLabel("Students Registration");
    headingPanel.add(headingLabel);

    JPanel panel = new JPanel(new GridBagLayout());
    GridBagConstraints cont = new GridBagConstraints();

    cont.insets = new Insets(5, 5, 5, 5);
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

    JXDatePicker picker = new JXDatePicker();
    picker.setDate(Calendar.getInstance().getTime());
    picker.setFormats(new SimpleDateFormat("dd.MM.yyyy"));

    public static void main(String[] args) {
        Registration regist = new Registration();
        resgist.setVisible(true);
    }
}