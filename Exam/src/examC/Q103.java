package examC;

 public class Q103 {
 public enum Dogs {collie, harrier};
 public static void main(String [] args) {
 Dogs myDog = Dogs.collie;
int i = 1;
 switch (i) {
case 1:
	 System.out.print("collie ");
	
case 2:
	 System.out.print("harrier ");
	
default:
	break;
}
// switch (myDog) {
// case collie:
// System.out.print("collie ");
// case harrier:
// System.out.print("harrier ");
//
//	 
// }
 }
 } 
