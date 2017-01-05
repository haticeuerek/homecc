package examC;

public class Q155 {
	 public static void main(String[] args) {
		 try {
		 args = null;
		 args[0] = "test";
		 System.out.println(args[0]);
		 } catch (Exception ex) {
		 System.out.println("Exception");
		 ex.printStackTrace();
		 } 
		 }
}
