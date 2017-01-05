package examC;

 public class Q14 {
 protected int blipvert(int x) { return 0; }
}
 class Vert extends Q14 {
	 public int blipvert(int x) { return 0; }
	 
	 // overriding, access modifier kann nicht private sein, 
	 //also protected->private geht nicht beo overriding 
//	 private int blipvert(int x) { return 0; }
	 private int blipvert(long x) { return 0; }
 }