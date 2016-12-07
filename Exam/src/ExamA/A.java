package ExamA;


public interface A {
   public void doSomething(String thing);
 }

class AImpl implements A {
   public void doSomething(String msg) {}
}

 class B {
  public A doit(){
	return null;
        //more code here
   }
   public String execute(){ // execute hat return type String
	return null;
       //more code here
  }
}

 class C extends B {
  public AImpl doit(){
	return null;
        //more code here
    }
   
//   public Object execute() { // c ist unterklasse von B deshalb muss die Mehode gleiche Return type haben
//        //more code here
//   }
 }