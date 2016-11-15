package polymorphie;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Geometrie {

public static void flaeche(){
	Random r = new Random();

	Figur[] figuren = new Figur[100];
	for (int i = 0; i < figuren.length; i++) {
				if (r.nextInt(10) > 5) {
					figuren[i]= new Kreis(r.nextInt(10)+1);
				} else {
					figuren[i] = new Rechteck(r.nextInt(10)+1,r.nextInt(10)+1);
				}			
			}
	for (Figur figur : figuren) {
		System.out.println("Figur: "+figur+ ". Fläche: " + figur.getFlaeche());
	}
	
}	
	
public static void main(String[] args) {
	
flaeche();

}
}
	
	
	

	
