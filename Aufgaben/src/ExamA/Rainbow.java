package ExamA;

 public class Rainbow {
  public enum MyColor {
        RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
       private final int rgb;
        MyColor(int rgb) { this.rgb = rgb; }
        public int getRGB() { return rgb; }
   };
    public static void main(String[] args) {
//    	MyColor skyColor = BLUE; //referenz erstellen mit Blue geht nicht , weil enum ist innere Klasse
    							//und deshalb muss angepsrochen werden.
    	MyColor treeColor = MyColor.GREEN; // das geht
    										//durch die Angabe von der Enum klasse
    	System.out.println(treeColor);
    	//if(RED.getRGB() < BLUE.getRGB()) { } innere Klasse Angabe fehlen!!!
    	
    	
   }
 }

