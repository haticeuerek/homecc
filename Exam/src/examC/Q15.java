package examC;

class Super {
 public int a;
 protected Super(int a) { this.a = a; }
 }
class Sub extends Super {
 public Sub(int a) { super(a); }
 public Sub() { this(5); }
 }

public class Q15 {

}
