package AufgabeExeptions;

import java.util.Scanner;
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class ParseDate {
	
	
	

	public static void main(String[] args) throws ParseException {
		String dateAsstring;
		Scanner s =  new Scanner(System.in);
		dateAsstring = s.nextLine();
	     DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.GERMAN);
		  Date result = null;
		try {
			result = df.parse(dateAsstring);
		} catch (ParseException e) {
			System.out.println("falsche Format");
			//e.printStackTrace();
		}  
	     System.out.println(result);
		
		

	}

}
