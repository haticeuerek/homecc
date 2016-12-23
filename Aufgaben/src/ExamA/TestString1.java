package ExamA;

class SuperCalc {
    protected  int multiply(int a, int b) { return a * b;}
}


 class SubCalc extends SuperCalc{
   public int multiply(int a, int b) {
       int c = super.multiply(a, b);
      return c;
   }
 }

public class TestString1  {
	static void test() throws RuntimeException {
	    try {
	        System.out.print("test ");//ausführen dann kommt zeile 8
	        throw new RuntimeException(); //exception wird etnworfen 
	        			//also diese TRY catch block für diese exception,  wenn hier kein try catch wäre,
	        			// würde catch block unten im main ausgeführt.
	     
	    }
	    catch (Exception ex) { System.out.print("exception "); } // exception ist hier abgefangen
	}

	public static void main(String[] args) {
		 try { test(); }
		    catch (RuntimeException ex) { System.out.print("runtime "); }
		    System.out.print("end ");
	
		    SubCalc sc = new SubCalc ();
			 System.out.println(sc.multiply(3,4));
//			 System.out.println(SubCalc.multiply(2,2));
			 
	}

	 
}

  
 
 