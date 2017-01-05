package examC;

class Aa {
 void foo() throws Exception { throw new Exception(); }
 }
 class SubB22 extends Aa {
 void foo() { System.out.println("B "); }
 }
 class Q151 {
 public static void main(String[] args) throws Exception{
	  Aa a = new SubB22();
	  
 a.foo();
 }
 }