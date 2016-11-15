package ocpjp_uerek;

class Plaetzchen
{

  // Instanzvariablen
  String sorte;
  String groesse;
  String form;
  Boolean verzierungJaNein;
  
  // Instanzmethode
  public void ausgeben(String sorte, String groesse, String form)
  {
	  String wert = null;
	  if (verzierungJaNein == true){
		wert= "Ja";  
	  }
	  else{
		  wert= "nein";
	  }
	  System.out.println("Sorte " + sorte + ", " + "Groesse " + groesse + ", " + "Form " + form + ", Verzierung " + wert);
	  
  }


  public static void main(String[] args)
  {
  
	  Plaetzchen pl1 = new Plaetzchen();
	  System.out.println("+++ Plaetzchenliste +++");
	 pl1.verzierungJaNein = false;
	  pl1.ausgeben("Kokos", "mittel", "rund");
  }
}