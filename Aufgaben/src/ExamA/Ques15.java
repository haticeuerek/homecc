package ExamA;

public class Ques15 {

public static void parse(String str) {
    try {
        float f = Float.parseFloat(str);
   
    } catch (NumberFormatException nfe) {
//        f = 0; //cözumlenemez
    	nfe.printStackTrace();
    } finally {
//        System.out.println(f);
    	
    }
}

public static void main(String[] args) {
    parse("invalid");
}

}
