package polymorphie;

public class Rechteck extends Figur {
	private int breite;
	private int hoehe;
	
	public Rechteck(int breite, int hoehe) {

		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public double getFlaeche() {
		// TODO Auto-generated method stub
		return breite*hoehe;
	}
	@Override
	public String toString() {
		return "Rechteck [" + breite + " X " + hoehe + "]";
	}


}
