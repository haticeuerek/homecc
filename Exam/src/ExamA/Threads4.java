package ExamA;



public class Threads4 {
    public static void main (String[] args) {
        new Threads4().go();
    }

    public void go() {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("foo");
               
            }
        };
        Thread t = new Thread(r); // ein Thread kann nur ein mal gestartet werden. 
        							//2. start fuhrt zu einer Fehler IllegalThreadStateException
        t.start();
        t.start();
    }

}
