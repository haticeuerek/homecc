package polymorphie;

public abstract class Figur {
	public int x;
	public int y;
	public int flaeche;
	public void bewegen(int x, int y) {
		this.x=x;
		this.y=y;
	}		
	public abstract double getFlaeche();
}
