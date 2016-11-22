package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Abfahrzeit {

	public static void main(String[] args) {
		TreeSet<String> zeiten = zeitenGenerieren();
		

		System.out.println("Erste Abfahrzeit nach 12:03: " + zeiten.higher("12:03"));
		System.out.println("Erste Abfahrzeit vor 12:03: " + zeiten.floor("12:03"));
		System.out.println("Erste Abfahrzeit nach 17:12 inklusive: " + zeiten.ceiling("17:12"));
		System.out.println("Erste Abfahrzeit nach 17:12 exklusive: " + zeiten.higher("17:12"));
		System.out.println("Abfahrtzeiten zwischen 12:00 bis 13:00: " + zeiten.subSet("12:00", "13:00"));
		
		System.out.println("Abfahrtzeiten zwischen 11:52 exklusive bis 13:12 inklusive: " + zeiten.subSet("11:52", false, "13:12", true));
		System.out.println("der erstmöglichen Abfahrtzeit: " + zeiten.first());
		System.out.println("der letztmöglichen Abfahrtzeit: " + zeiten.last());
		

	}
	static TreeSet<String> zeitenGenerieren(){
		
		TreeSet<String> zeiten = new TreeSet<>();
		int z1 = 06;
		String z2 = ":";
		int z3 = 12;
		
		String z = null;  
		while (z1<24) {
			
			z = String.format("%02d:%02d", z1,z3);
//			System.out.println(z);
			zeiten.add(z);
			z3 =  z3 + 20;			
			if (z3 == 52){
				z = String.format("%02d:%02d", z1,z3);;
//				System.out.println(z);
				zeiten.add(z);
				z1++;
				z3 = 12;	
				
			}
			
//			System.out.println(zeiten);
		}
		return zeiten;}
	
	
	
}
