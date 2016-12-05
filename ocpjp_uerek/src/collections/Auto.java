package collections;

import java.util.Comparator;

public abstract class Auto implements Comparable<Auto> {
	protected int baujahr;
	protected String modell;
	public Auto(String modell, int baujahr) {
		this.modell = modell;
		this.baujahr = baujahr;
	
	}

	@Override
	public int compareTo(Auto o) {
		int erg = modell.compareTo(o.modell);
		if(erg == 0){
//			int erg2 = baujahr.compareTo(o.baujahr);
			
			int erg2;
			erg2 = Integer.toString(baujahr).compareTo(Integer.toString(o.baujahr));
			return erg2;
		}
		return erg;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Auto)){
			return false;
		}
		Auto a2 = (Auto) obj;
	return modell.equals(a2.modell) && baujahr == a2.baujahr;
	}

	@Override
	public int hashCode() {
	
			
		return modell.hashCode() ^ baujahr;
	
	} 

}

	


