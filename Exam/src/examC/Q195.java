package examC;

import java.sql.Date;
import java.text.DateFormat;
import java.io.Console;
public class Q195 {

public static void go(Long n) {System.out.print("Long ");}
 public static void go(Short n) {System.out.print("Short ");}
 public static void go(int n) {System.out.print("int ");}
 public static void main(String [] args) {
 short y = 6;
 long z = 7;
 go(y);
 go(z);
 String test = "This is a test";
 String[] tokens = test.split("\\s");
 System.out.println(tokens.length);
 for (String string : tokens) {
	System.out.println(string);
}
 }
 }