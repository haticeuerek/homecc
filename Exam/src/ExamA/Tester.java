package ExamA;


class PingPong2 {
    synchronized void hit(long n) { //syncronized methode definiert in einer Klasse
        for(int i = 1; i < 3; i++)
            System.out.print(n + "-" + i + " ");
    }
}

public class Tester implements Runnable { //durch interface Runnable ein trhread m�chte man erzeugen
    static PingPong2 pp2 = new PingPong2(); // pp2 obje�kt f�r die klasse pongpong2 erzeugt

    public static void main(String[] args) {
        new Thread(new Tester()).start(); //thread erzeugt f�r Objekt der Klasse tester und startet
        new Thread(new Tester()).start(); //2. thread erzeugt f�r Objekt der Klasse tester
        
    }

    public void run() {
    	pp2.hit(Thread.currentThread().getId()); // run methode f�r das interface Runnable
    												// wird aufgerfuen.
    					//in der Methode wird hit methode aus der Klasse pingpong2 aufgerufen. 
    }
}