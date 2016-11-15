package aufgabe01;

import java.util.Scanner;
///hahahaha
public class Aufgabe01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Nachname ein!");
		String nachname = s.nextLine();
		System.out.println("Bitte geben Sie Ihre Vorname ein!");
		String vorname = s.nextLine();
		System.out.println("Bitte geben Sie Ihre Adresse ein!");
		String adresse = s.nextLine();
		char c = '|';
		String u1 = "Nachname" ;
		String u2 = "Vorname";
		String u3 = "Adresse";
	
		if (nachname.length()>u1.length()) {
			
			for (int i = u1.length(); i < nachname.length(); i++) {
				u1= u1 + " ";	
			}			
		}
		
			
		
		if (vorname.length()>u2.length()) {
			
			for (int i = u2.length(); i < vorname.length(); i++) {
				u2= u2 + " ";	
			}			
			
		}
		
	if (adresse.length()>u3.length()) {
		
		for (int i = u3.length(); i < adresse.length(); i++) {
			u3= u3 + " ";	
		}			
		
	}
		
		String ueberschrift;
		ueberschrift= c + u1 + c + u2 + c + u3 + c;  
		
		for (int i = 0; i < ueberschrift.length(); i++) {
			
			System.out.print("-");
			
		}
		System.out.println();
		System.out.println(ueberschrift);
		
		for (int i = 0; i < ueberschrift.length(); i++) {	
					System.out.print("-");			
		}
		System.out.println();
		
		System.out.println(c + nachname + c + vorname + c + adresse + c);
	
	}

}
