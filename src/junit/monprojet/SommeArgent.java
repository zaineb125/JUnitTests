package junit.monprojet;

public class SommeArgent {
	
	private int quantite;
	private String unite;
	
	public SommeArgent(int amount, String currency) {
	quantite = amount;
	unite = currency;
	}
	
	public int getQuantite() {
	return quantite;
	}
	
	public String getUnite() {
	return unite;
	}
	
	public SommeArgent add(SommeArgent m) throws UniteDistincteException {
		if (!m.getUnite().equals(this.getUnite())) {
			throw new UniteDistincteException(this, m);
			}
		else return new SommeArgent(getQuantite()+m.getQuantite(), getUnite());
	}
	
	public boolean equals(Object anObject) {
		SommeArgent sa = (SommeArgent) anObject;
		return (anObject!=null && sa.getQuantite() == this.getQuantite() && sa.getUnite() == this.getUnite()) ;
	}
	
	public String toString() {
		return "Quantite = "+getQuantite()+" Unite= "+getUnite();
	}
}
