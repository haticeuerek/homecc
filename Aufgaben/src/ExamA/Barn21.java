package ExamA;

class Building { }
 public class Barn21 extends Building {
    public static void main(String[] args) {
       
    	Building build1 = new Building(); //building objekt
       
       Barn21 barn1 = new Barn21(); //barn objekt 
       
       
      Barn21 barn2 =  (Barn21) build1; // barn referenz = building Objekt geht nur mit barn casten
      
      Object obj1 = (Object) build1;
      
//     String str1 = (String) build1; // String casten geht nicht
     Building build2 = (Building) barn1; // building referenz = barn objekt geht nur mit building casten
   }
 }
