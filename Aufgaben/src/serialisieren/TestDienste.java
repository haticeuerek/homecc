package serialisieren;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDienste {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SpeicherManager sManager = new SpeicherManager(2000, new Defragmentierung (3000, "C:\\Users\\huerek\\Desktop\\haticeCC"));
		File file = new File("sManager.bin");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(sManager);
		oos.close();

		System.out.println("Serialisiert: " + sManager);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Object sManager2 = ois.readObject(); //Exception
		
		ois.close();
		System.out.println("Serialisiert: " + sManager2.toString());
	}

}
