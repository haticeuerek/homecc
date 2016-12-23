package ExamA;


public abstract class Shape {
    private int x;
    private int y;

    public abstract void draw();

    public void setAnchor(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

abstract class Circle extends Shape { // wenn Klasse Circle nicht abstract ist, muss die abstrakte Methode
								// von de rKlasse Shape implementiert werden. 
								//Wenn die klasse Shape doch abstrakt ist,
								//muss die Methode draw() nicht implementiert werden.
    private int radius;

//	@Override
//	public void draw() {
//		// TODO Auto-generated method stub
//		
//	}
}