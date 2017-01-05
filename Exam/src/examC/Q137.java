package examC;

class TestAA {
 public void start() { System.out.println("TestA"); }
}
public class Q137 extends TestAA {
 public void start() { System.out.println("TestB"); }
 public static void main(String[] args) {
	TestAA a = new TestAA();
	a.start();
	Q137 b = new Q137();
	b.start();
	TestAA ab = new Q137();
	 ab.start();
// ((TestAA)new Q137()).start();
}
}