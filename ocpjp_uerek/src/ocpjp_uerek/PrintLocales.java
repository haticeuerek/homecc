package ocpjp_uerek;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;



public class PrintLocales {


	public static void main(String[] args) {
		PrintLocales obj = new PrintLocales();
		obj.printTable();

	}
	
	class MyComparator implements Comparator<Locale> {
	
		@Override
		public int compare(Locale o1, Locale o2) {
			// TODO Auto-generated method stub
			
			int erg = o1.getDisplayLanguage().compareTo(o2.getDisplayLanguage());		
			if(erg!=0) {
				return erg;
			}
			
			
			return o1.getDisplayCountry().compareTo(o2.getDisplayCountry());
		}
	
	}
	
	
	public  void printTable() {

		  
		   Locale[] locales = Locale.getAvailableLocales();
				  
		
		   Comparator<Locale> cmp1 = new MyComparator();
		
		   Arrays.sort(locales, cmp1);

	  System.out.println("---------------------------");
			int j =1;
		   System.out.format( "%s %5s %38s %15s %n", "|", "Nr.|", "Land|", "Sprache|");
		for (Locale locale : locales) {
			 System.out.format("%5s %40s %15s %n" ,j,locale.getDisplayCountry(), locale.getDisplayLanguage());
			 j++;
		}
		   
		   }
}