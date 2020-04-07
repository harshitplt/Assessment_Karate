

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JFormattedTextField.AbstractFormatter;

public class JXDatePicker extends AbstractFormatter{

	private static final long serialVersionUID = 22L;

	private final String datepattern = "dd-mm-yyyy";
	private final SimpleDateFormat dateformat = new SimpleDateFormat(datepattern);

	
	
	public int calculatedage;
	
}
