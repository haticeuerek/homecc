package Inner;

//Klasse A 
 class A { void m() { System.out.println("outer"); } }

	public class TestInners {
		public static void main(String[] args) {
			new TestInners().go();
		} //end main
		//im Class Testinners
		void go() {
			new A().m();
			//lokale klassen in methode go()
			
			class A { void m() { System.out.println("inner"); } }
			
					}
		//innere klasse in Testinners 
		class A { void m() { System.out.println("middle"); } }
 }