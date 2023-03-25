package junit.monprojet;

import java.util.HashMap;

public class PorteMonnaie {

	private HashMap<String, Integer> contenu;

	public HashMap<String, Integer> getContenu() {

		return contenu;

	}

	public PorteMonnaie() {

		contenu = new HashMap<String, Integer>();

	}

	public void ajouteSomme(SommeArgent sa) {
		 String unite = sa.getUnite();
		 int quantite = sa.getQuantite();

		 if (contenu.containsKey(unite)) {
			 int sommeExistante = contenu.get(unite);
		     contenu.put(unite, sommeExistante + quantite);
		 } else {
		     contenu.put(unite, quantite);
		 }

	}
	
	 public String toString() {
		    String contenuMonnaie ="Contenu du porte-monnaie :\n";
		    for (HashMap.Entry<String, Integer> entry : getContenu().entrySet()) {
		    	SommeArgent sa=(SommeArgent)entry ;
		    	contenuMonnaie+= sa.toString()+'\n';
	        }
		    return contenuMonnaie ;
		}
	 
	 public boolean equals(Object o) {
		    if (o == this) {
		        return true;
		    }
		    if (!(o instanceof PorteMonnaie)) {
		        return false;
		    }
		    PorteMonnaie pm = (PorteMonnaie) o;
		    if (pm.getContenu().size() != this.getContenu().size()) {
		        return false;
		    }
		    for (HashMap.Entry<String, Integer> entry : this.getContenu().entrySet()) {
		        String currency = entry.getKey();
		        Integer amount = entry.getValue();
		        if (!pm.getContenu().containsKey(currency) || !pm.getContenu().get(currency).equals(amount)) {
		            return false;
		        }
		    }
		    return true;
		}

}
