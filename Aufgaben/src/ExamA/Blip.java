package ExamA;

 public class Blip {
    protected int blipvert(int x) { return 0; }
}
 class Vert extends Blip {
//	 public int blipvert(int x) { return 0; } //OK--overriding -ok
//	 private int blipvert(int x) { return 0; } // von protected ->private geht nicht, 
//	 private int blipvert(long x) { return 0; }	// OK--overriding , parameter kann geändert werden. 
	 											//reduzierung von access modifier geht nicht 
//	 protected long blipvert(int x) { return 0; }//bei overriding, muss returntype übereinstimmen von oberklasse
//	 protected int blipvert(long x) { return 0; } //OK-overriding
	 protected long blipvert(long x) { return 0; }// oberloading 
	 protected long blipvert(int x, int y) { return 0; }//overloading
 
 }
 
