package serialisieren;

public class Defragmentierung extends Dienst{
	private int zeitabstand;
	private String laufwerk;
	public Defragmentierung(int zeitabstand, String laufwerk) {
		this.zeitabstand = zeitabstand;
		this.laufwerk = laufwerk;
		}

	@Override
	public String toString() {
		
		return "Zeitabstand("+zeitabstand+"), " + "LW(" + laufwerk + ")"; 
	}
}
