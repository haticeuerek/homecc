import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Aufgabe {
	
	
	
	public static void suchen(String text, String regex){
		System.out.println("------------------------------");
		System.out.println("Gesucht wird im String " + text + " mit dem Regex " + regex);
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
	
		while(m.find()){
			String group = m. group();
			int start = m.start();
			int end = m.end();
			System.out.println("Treffer: " + group + ". Position " + start + " bis " + end);
		}
	}
	public static void main(String[] args) {
		String text = "abc10";
		String regex = "[+-]?\\d+";
		suchen(text, regex);
	

	
	}
}
