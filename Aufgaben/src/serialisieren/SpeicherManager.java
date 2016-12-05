package serialisieren;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SpeicherManager extends Dienst implements Serializable {

	private int size;
	transient private Defragmentierung defrag;
	
	public SpeicherManager(int size, Defragmentierung defrag) {
		
		this.size = size;
		this.defrag = defrag;
	}

	
	@Override
	public String toString() {
		return "Manager. Size: " + size+ ". Defrag-Dienst: " + defrag;
	}
}
