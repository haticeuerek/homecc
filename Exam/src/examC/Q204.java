package examC;

 abstract class A204 {
 abstract void a1();
 void a2() { }
 }
 class B extends A204 {
 void a1() {System.out.println("aa"); }
 void a2() { }
 }

public class Q204 extends B {
	 void c1() { }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A204 x = new B(); Q204 y = new Q204(); A204 z = new Q204();
	//	z.c1(); dennA204 kennt C nicht. 
		z.a1();
		y.c1();
		  
	}

}
