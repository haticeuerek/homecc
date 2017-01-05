package examC;

 import java.util.*;
 public class Q214 {

public static void main(String[] args) {
 TreeSet<Integer> s = new TreeSet<Integer>();
 TreeSet<Integer> subs = new TreeSet<Integer>();
 for(int i = 606; i < 613; i++)
 if(i%2 == 0) s.add(i);

 subs = (TreeSet<Integer>) s.subSet(608, true, 611, true);
 System.out.println(s + " " + subs);
subs.add(629);
subs.add(123);
ArrayList<String> strings = new ArrayList<String>();
Collections.sort(strings);
 }
 }