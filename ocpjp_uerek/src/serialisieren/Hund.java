package serialisieren;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Hund extends Lebewesen implements Serializable {
	private String name;
	transient private Mensch besitzer;
	
	public Hund(int alter, String name, Mensch besitzer) {
		super(alter);
		this.name = name;
		this.besitzer=besitzer;
	}
	@Override
	public String toString() {
	
		return "Hund: " + name + ", Alter: " + alter + ". Besitzer: " + besitzer;
	}
}