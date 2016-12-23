package ExamA;

class Super {
   private int a;
   protected Super(int a) { this.a = a; }
 }

 class Sub extends Super {
	
    public Sub(int a) { super(a); }
   
    
//    public Sub() { this.a = 5; } // 1) a ist nicht sichtbar wegen private deklration
    								// 2) Sub() ist mit fehler , weil super konst. nicht aufgerufen wird. 
//    public Sub() { super(a); }//a ist nicht sichtbar
//  public Sub() { super(5); }//--ok

    public Sub() { this(5);  } // OK--das ruft den Konstruktor Sub(int a)
 
 }

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
