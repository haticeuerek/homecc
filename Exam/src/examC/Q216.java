package examC;

class A216 {
 void foo() throws Exception { throw new Exception(); }
 }
 class SubB216 extends A216 {
 void foo() { System.out.println("B "); }
 }
public class Q216 {
 public static void main(String[] args)  {
 SubB216 a = new SubB216();
 a.foo(); 
 String str = "null";
 if (str == null) {
System.out.println("null");
 }else  {
	 System.out.println("zero");
 }
 }
}