package examC;

 public class Q5{
	 public static void main (String[] args) {
		 new Q5().go();
 }
	 public void go() {
		 Runnable r = new Runnable() {
			 public void run() {
				 System.out.print("foo");
			 }
		 };
 Thread t = new Thread(r);
 // Ein Objekt kann nur ein mal gestartet werden. 
 t.start();
 t.start();
 }
 }