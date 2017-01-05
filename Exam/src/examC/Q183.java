package examC;
 class W{}
 public class Q183 {
 private String name;
 
 //default konstruktor explzit definieren
 public Q183(){};
 
 public Q183(String name) { this.name = name; }
 public String getName() { return name; }
 }
 // Konstruktor mit parameter muss explizit in der klasse Tree als super definiert werden 
 //oder im _Basis klasse default konstruktor definieren
 class Tree extends Q183{

public void growFruit() { }
 public void dropLeaves() { }
 }
 
