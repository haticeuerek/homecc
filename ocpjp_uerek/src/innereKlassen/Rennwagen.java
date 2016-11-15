package innereKlassen;

import innereKlassen.Rennwagen.Fahrer;
import innereKlassen.Rennwagen.Motor;

public class Rennwagen {
	
	
	public Rennwagen(String autoTyp) {
		this.autoTyp = autoTyp;
		this.motor= new Motor();
	}
				class Motor{
					@Override
					public String toString() {
						
						return "Motor Type1 aus dem Rennwagen " + autoTyp;
					}
				}
				public static class Fahrer{
					public String nachname;
					public String vorname;
					public Fahrer(String vorname, String nachname) {
						this.nachname = nachname;
						this.vorname = vorname;
					}
					@Override
					public String toString() {
						
						return vorname + " " + nachname;
					}
				}
				//----klasse Rennwagen
				public String autoTyp;
	public Fahrer f;
	public Motor motor;
	public void setFahrer(Fahrer f) {
		this.f = f;
		
	}
	public Motor getMotor() {
		
		return motor;
	}
	@Override
	public String toString() {
		return "Rennwagen " + autoTyp + ". Fahrer: " + f;
	}
}
