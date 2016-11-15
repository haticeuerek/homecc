package ocpjp_uerek;

public class Einfach {
	public static void main(String[] args) {
		String s = "Java ist Toll";
		System.out.println(new StringBuilder(s).reverse().toString());
		
	int i = s.length();
	while (i>0) {
		System.out.print(s.charAt(i-1));
		i= i-1;
	}
	System.out.println();
	Einfach obj = new Einfach();
	String d = "Hatice.TxT";
	
	obj.isTextfile(d);
	
			}//end main
	
	
	public Boolean isTextfile(String dateiName){
		boolean b; 
		String t = ".txt";
		if (dateiName.toLowerCase().contains(t))
		{
		
			b = true;	
			
		}
		else {
			b = false;
		}
		System.out.println(b);
		return b;
		
	}
}
