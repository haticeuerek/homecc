package serialisieren;

import java.io.Serializable;

class Mensch extends Lebewesen {
	public Mensch(int alter){
	super(alter);}
	
	String vorname;
	String nachname;
	
	public Mensch(String vorname, String nachname){

		this.vorname = vorname;
		this.nachname = nachname;
	}


@Override
public String toString() {
	return vorname +" " + nachname;
}		
}