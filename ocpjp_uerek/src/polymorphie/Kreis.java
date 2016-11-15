package polymorphie;

public class Kreis extends Figur {
	private int radius;
	public Kreis(int radius) {
		this.radius = radius;
	}
	
	@Override
	public double getFlaeche() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Kreis (R=" + radius + ")";
}



}
