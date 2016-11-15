package ocpjp_uerek;
import java.util.Scanner; 

public class BmiRechner {
	//BMI = Körpergewicht (kg) / Körpergröße (m)²
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihr Körpergewicht:");
		double koerperGewicht = s.nextDouble();
		System.out.println("Bitte geben Sie Ihre Körpergröße in m");
		double koerperGroesse = s.nextDouble();
		double ergebnis = koerperGewicht/(koerperGroesse*koerperGroesse);
		
		System.out.println("Ihr BMI-Wert lautet: " + Math.round(ergebnis));
		
		
	}
	
	}
