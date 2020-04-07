package part2;


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

	@Override
	public Object stringToValue(String text) throws ParseException {
		// TODO Auto-generated method stub
		return dateformat.parseObject(text);
	}

	@Override
	public String valueToString(Object value) throws ParseException {
		// TODO Auto-generated method stub

		if (value != null)
		{
			Calendar cal = (Calendar) value;
			return dateformat.format(cal.getTime());
	    }
		   
		return "";
	}
	
}
