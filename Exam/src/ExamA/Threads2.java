package ExamA;

//question 1

public class Threads2 implements Runnable { //mit runnable interface wird ein Thread erzeugt.  
    public void run() {
        System.out.println("run.");	//2. oder 3. Ausgabe
        throw new RuntimeException("Problem"); //2. oder 3. Ausgabe
    }

    public static void main(String[] args) {
        Thread t = new Thread(new Threads2()); // dieser thread wird instanziert und startet. 
        t.start();
        System.out.println("End of method."); // definitiv 1. Ausgabe
    }
}

