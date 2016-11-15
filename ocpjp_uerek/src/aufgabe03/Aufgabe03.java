package aufgabe03;

public class Aufgabe03 {
	public static void main(String[] args) {
		String s = javax.swing.JOptionPane.showInputDialog( "Bitte Zahl eingeben" );
	//	System.exit( 0 );
		System.out.println(s + " "+ s);
		int x = Integer.parseInt( s );
		System.out.println("Quadrat von "+s+" beträgt: " + x*x);
}
}
