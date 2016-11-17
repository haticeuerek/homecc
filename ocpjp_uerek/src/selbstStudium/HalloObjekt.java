package selbstStudium;

public class HalloObjekt {
		
		String s;

	  public HalloObjekt(String s) {
			this.s = s;
		}

	// Methodendefinition
	  void sprich()
	  {
		int anzahl = s.length(); 
		while(anzahl >= 1){  
	    System.out.println(s);
	    anzahl = anzahl -1;
	  }
	  }
	}


