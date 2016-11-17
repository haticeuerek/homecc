package serialisieren;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Hund h = new Hund(2, "Max", new Mensch("Otto", "Meyer"));

//		System.out.println(h);
		File file = new File("hund.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		
		oos.writeObject(h);
		oos.close();
		System.out.println("Serialisiert: h" + h);
	
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Object h2 = ois.readObject(); 
				
		ois.close();
		System.out.println("Deserialisiert: h2" + h2);
		
		
		
		
		
		
	}

}
