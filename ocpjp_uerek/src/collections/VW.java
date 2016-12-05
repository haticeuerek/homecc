package collections;



public class VW extends Auto{

				public VW(String modell, int baujahr) {
					super(modell, baujahr);
					}
			 @Override
			public String toString() {
				
				return "VW. Modell: " + modell + ", " + "Baujahr " + baujahr;
			}
			
}	


class BMW extends Auto{

	public BMW(String modell, int baujahr) {
		super(modell, baujahr);
		
	}

	@Override
	public String toString() {
		
		return "BMW. Modell: " + modell + ", " + "Baujahr " + baujahr;
	}
	
	public void setBaujahr(int baujahr){
		this.baujahr=baujahr;
	}

}	
	


	

