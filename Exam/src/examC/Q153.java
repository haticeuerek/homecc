package examC;

import java.awt.Label;

public class Q153 {
 static String o = "";
 public static void main(String[] args) {

 o = o + 2;
 z:
 for(int x = 3; x < 8; x++) {
	 if(x==6) break z;
 if(x==4) break;

 o = o + x;
 }
 System.out.println(o);
 }
 }