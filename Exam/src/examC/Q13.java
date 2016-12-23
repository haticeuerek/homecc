package examC;

public class Q13 {
	 public static void parse(String str) {
		 try {
		 float f = Float.parseFloat(str);
		 } catch (NumberFormatException nfe) {
		//f ist lokal im try definiert, kennt man hier nicht 
//			 f = 0;
		 } finally {
				//f ist lokal im try definiert, kennt man hier nicht 
//		 System.out.println(f);
		 }
		 }
		 public static void main(String[] args) {
		 parse("invalid");
		 }
}

// Compiler fehler