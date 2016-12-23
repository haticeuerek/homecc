package examC;

 public class Q39{
 Integer i ;
 int x ;
 public Q39(int y) {
 x = i+y;
 System.out.println(x);
 }

 public static void main(String[] args) {
 new Q39(new Integer(4));
 }
 }
 // Null pointer exception , weil Integer i nicht initialiesiert ist. 