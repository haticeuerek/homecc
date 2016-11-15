package ocpjp_uerek;

import java.util.Scanner;

public class Kapitel29 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Geben Sie einen String ein:");
	    String eingabe= 	s.nextLine();
	    for (int i = 0; i < eingabe.length(); i++) {
	    	System.out.println(eingabe.charAt(i));
			
		}
	}
}
