package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Literal {
	static boolean isDecimalLiteral(String input){
//		boolean wert = false;
//		String regex = "[+-]?\\d+"; 
//		Pattern p = Pattern.compile(regex);		
//		Matcher m = p.matcher(input);
//
//		if(m.find())
//			wert = true;
//		return wert;
//	}
	String regex = "[+-]?\\d+";
		
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(input);
		
		if( m.find() ) {
			String d = m.group() ;
			System.out.println(d);
			return input.equals(d);
		}
		
		return false;
	}
	
	

	public static void main(String[] args) {
				boolean wert ;
				wert = isDecimalLiteral("10"); // - Sollwert: true
				System.out.println(wert);
				wert = isDecimalLiteral("-10"); // - Sollwert: true
				System.out.println(wert);
				wert = isDecimalLiteral("+10");// - Sollwert: true
				System.out.println(wert);
				wert = isDecimalLiteral("a10"); // - Sollwert: false
				System.out.println(wert);
				wert = isDecimalLiteral("10abc"); // - Sollwert: false
				System.out.println(wert);
	}

}
