package junit.monprojet.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

public class JUnitPorteMonnaie {

	@Test
    public void testAjouteSomme() {
        PorteMonnaie porteMonnaie1 = new PorteMonnaie();
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));
        
        PorteMonnaie porteMonnaie2 = new PorteMonnaie();
        porteMonnaie2.ajouteSomme(new SommeArgent(10, "EUR"));
        
        Assert.assertEquals(porteMonnaie2, porteMonnaie1);
    }

}
