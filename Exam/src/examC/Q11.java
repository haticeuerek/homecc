package examC;

 class Atom {
 Atom() { System.out.print("atom "); }
 }
 class Rock extends Atom {
 Rock(String type) {  System.out.print(type); }
 }
 public class Q11 extends Rock {
 Q11() {
 super("granite ");
 new Rock("granite ");
 }
 public static void main(String[] a) { new Q11(); }
 }