package ocpjp_uerek;
import java.util.Scanner; 

public class BmiRechner {
	//BMI = K�rpergewicht (kg) / K�rpergr��e (m)�
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr K�rpergewicht:");
		double koerperGewicht = s.nextDouble();
		System.out.println("Bitte geben Sie Ihre K�rpergr��e in m");
		double koerperGroesse = s.nextDouble();
		double ergebnis = koerperGewicht/(koerperGroesse*koerperGroesse);
		
		System.out.println("Ihr BMI-Wert lautet: " + Math.round(ergebnis));
		
		
	}
	
	}
