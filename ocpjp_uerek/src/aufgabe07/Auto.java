package aufgabe07;

enum Farbe {schwarz, weiss, rot, blau, silber}
enum Antrieb {Allrad, Vorne, Hinten}
enum Getriebe {Automatic, Gangschaltung}
enum Kraftstoff {Benzin, Diesel}

public class Auto {
	private Farbe farbe;
	private Getriebe getriebe;
	private Antrieb antrieb;
	private Kraftstoff kraftstoff;
	private int zylinder;
	private int hubraum;
	public Auto(Farbe farbe, Getriebe getriebe, Antrieb antrieb, Kraftstoff kraftstoff, int zylinder, int hubraum) {
		this.farbe = farbe;
		this.getriebe = getriebe;
		this.antrieb = antrieb;
		this.kraftstoff = kraftstoff;
		this.zylinder = zylinder;
		this.hubraum = hubraum;
	}
	

	public static void main(String[] args) {
		Auto a1 = new Auto(Farbe.blau, Getriebe.Automatic, Antrieb.Allrad, Kraftstoff.Diesel, 3, 2000);
		System.out.println("Auto 1 " + a1.farbe);
		
	}
}
