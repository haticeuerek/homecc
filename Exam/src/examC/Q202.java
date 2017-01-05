package examC;

  class Target {
 int i = 0;
 public int addOne(){
 return ++i;
 }
 }
public class Q202 {
	public static void main(String[] args){
		Target t = new Target();
		 System.out.println(t.addOne());
		 System.out.println(t.i);
		 
		 }
}
