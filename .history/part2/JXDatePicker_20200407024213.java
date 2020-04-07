package part2;

import java.awt.event.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JXDatePicker {

	private static final long serialVersionUID = 22L;

	int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
	int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

	JLabel dt = new JLabel("", JLabel.CENTER);
	
	String day = "";
	JDialog jd;
	JButton[] btn = new JButton[49];
	
	public  JXDatePicker(){
		jd = new JDialog();
		jd.setModal(true);

		String[] header = { "Sun", "Mon", "Tue", "Wed", "Thur", "Fri", "Sat"};
		JPanel p1 = new JPanel(new GridLayout(7, 7));
		p1.setPreferredSize(new Dimension(430, 120));

		for (int x = 0; x <btn> 6)
			btn[x].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					day = btn[selection].getActionCommand();
					jd.dispose();
				}
		});

		if (x < 7) {
			btn[x].setText(header[x]);
			btn[x].setForeground(Color.blue);
		}
		p1.add(btn[x]);
	}

	JPanel p2 = new JPanel(new GridLayout(1, 3));
	JButton prv = new JButton("<>");

	next.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            month++;
			displayDate();
		}
	});

	p2.add(next);
        dj.add(p1, BorderLayout.CENTER);
        dj.add(p2, BorderLayout.SOUTH);
        dj.pack();
        dj.setLocationRelativeTo(parent);
        displayDate();
        dj.setVisible(true);
    }
	
	private void displayDate() {
		for (int x = 7; x < btn.length; x++)
            btn[x].setText("");
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "MMMM yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, 1);
        int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++)
            btn[x].setText("" + day);
        dt.setText(sdf.format(cal.getTime()));
        jd.setTitle("Date Picker");
	}

	private final String datepattern = "dd-mm-yyyy";
	private final SimpleDateFormat dateformat = new SimpleDateFormat(datepattern);
	
	public int calculatedage;
}
