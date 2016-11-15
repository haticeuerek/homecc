package ocpjp_uerek;

import java.util.Scanner;

public class LiteralTester {
	public static void main(String[] args) {
//		String str1, str2, str3, str4;
//		
//		String str = "Bo, die Katze";
//		int anzahl = 0;
//		str1 = str;
//		str2 = str;
//		
//		str3 = new String( "Fred, der Hund" );
//		str4 = new String( "Fred, der Hund" );
//		
//		if (str1 == str2) {
//			System.out.println("die beide Referenzvariablen str1 und str 2 zeigen auf derselben Objekt");
//			anzahl = anzahl +1;
//			
//		} else {
//			System.out.println("die beide Referenzvariablen zeigen auf verschiedenen Objekte");
//			anzahl = anzahl +2;
//		}
//		
//		if (str3 == str4) {
//			System.out.println("die beide Referenzvariablen str3 und str4 zeigen auf derselben Objekt");
//			anzahl = anzahl +1;
//		}
//		else{
//			System.out.println("die beide Referenzvariablen zeigen auf verschiedenen Objekte");
//			anzahl = anzahl +2;
//		}
//		System.out.println("Es wurden " + anzahl + " Objekte erzeugt.");
		int i1 ;//i2,i3,i4,i5;
		int summe = 0;
		Scanner s = new Scanner(System.in);
//		System.out.println("Geben Sie 1. Zahl ein");
//		i1 = s.nextInt();
//		System.out.println("Geben Sie 2. Zahl ein");
//		i2 = s.nextInt();
//		System.out.println("Geben Sie 3. Zahl ein");
//		i3 = s.nextInt();
//		System.out.println("Geben Sie 4. Zahl ein");
//		i4 = s.nextInt();
//		System.out.println("Geben Sie 5. Zahl ein");
//		i5 = s.nextInt();
//		System.out.println("Gesamsumme: " + (i1+i2+i3+i4+i5));
//		
		String str; 
		System.out.println("Eingabeauforderung <ja> oder <nein> ?");
		str = s.next();
		if(str.equals("ja")){
			for (int i = 1; i <= 5; i++) {
				System.out.println("Geben Sie " + i + ". Zahl ein");
				i1 = s.nextInt();
				summe = summe + i1;
			
			}}else{
				for (int i = 1; i <= 5; i++) {
				i1 = s.nextInt();
				summe = summe + i1;
			}	}
			System.out.println("Gesamsumme: " + summe);
		}
		
		
	}
	

