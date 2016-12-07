package ExamA;

//Prüfung A Frage 13

class Atom {
    Atom() { System.out.print("atom "); }
}

class Rock extends Atom {
    Rock(String type) { System.out.print(type); }
}


public class Mountain extends Rock {
    Mountain() {
        super("granite "); // Das muss aufgerufen werden, 
        					//da Mountain muss konstruktor von Rock nehmen, 
        					//da Mountain ist die unterklasse von rock. 
        new Rock("granite "); // Mountain konstruktor hat eigene Aufgabe : Für Rock eine Object erstllen. 

    }
    public static void main(String[] a) { 
    	new Mountain(); 
    	
    	
    	}
}
