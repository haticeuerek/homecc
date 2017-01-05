package examC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



class Animal implements Serializable{
	int alter;
	 Animal() { System.out.print("a" ); }
	 public String toString() {
			return "alter: " + alter;
		}
	 }
	 class Dog extends Animal implements Serializable {
		 int gehalt;
		 Dog() {  System.out.print("d"); }
		 @Override
			public String toString() {
				return super.toString() + ", gehalt: " + gehalt;
			}
	 }
class Beagle extends Dog { Beagle (){System.out.print("b");}}
public class Q200 {
public static void main(String[] args) throws Exception{
	Beagle b1 = new Beagle();
	b1.alter = 70;
	b1.gehalt = 10;
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("q200"));
	oos.writeObject(b1);
	oos.close();
	
	System.out.println("Serialisiert: " + b1);
	
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("q200"));
	Beagle b2 = (Beagle) ois.readObject(); //Exception
	ois.close();
	
	System.out.println("Deserialisiert: " + b2);
	
}
}
