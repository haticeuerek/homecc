package ExamA;

public class Question3 {

	static void waitForSignal() throws InterruptedException {
	    Object obj = new Object();
	    synchronized (Thread.currentThread()) {
	        obj.wait(); // immer InterruptedException
	        obj.notify();
	    }
	}
	public static void main(String[] args) throws InterruptedException {

	}

}
