package junit.monprojet.test;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junit.monprojet.SommeArgent;
import junit.monprojet.UniteDistincteException;

public class JUnitSommeArgent {
	
	private SommeArgent m12CHF;
	private SommeArgent m14CHF;
	private SommeArgent m14USD ;
	private static int numberOfTests =0;
	
	@Before
	public void initialisation() {
		 numberOfTests=numberOfTests+1;
		 System.out.println(numberOfTests+"ime passage avant exécution d'une méthode de test");
		 m12CHF = new SommeArgent(12, "CHF");
         m14CHF = new SommeArgent(14, "CHF");
         m14USD =new SommeArgent(14, "USD");
         
	}

	 @Test
	    public void testAdditionSommeArgent() throws UniteDistincteException {
		 SommeArgent expected = new SommeArgent(26, "CHF");
		 SommeArgent result = m12CHF.add(m14CHF);
	     Assert.assertTrue(expected.equals(result));
	    }
	 @Test
	 	public void testEqualsSommeArgent() {
		 Assert.assertTrue(!m12CHF.equals(null));
		 Assert.assertEquals(m12CHF, m12CHF);
		 Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
		 Assert.assertTrue(!m12CHF.equals(m14CHF));
		 Assert.assertTrue(!m14USD.equals(m14CHF));
	 }
	 @Test(expected = UniteDistincteException.class)
	    public void testDistincteException() throws UniteDistincteException {
	        SommeArgent m20EUR= new SommeArgent(20, "EUR");
	        SommeArgent m20TND= new SommeArgent(20, "TND");
	        m20EUR.add(m20TND);
	    }
	@After
	public void afterTest() {
		System.out.println(numberOfTests+"ime passage APRES exécution d'une méthode de test");
	}
}
