package fr.gtm.demotest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import fr.gtm.demotest.service.Compte;
import fr.gtm.demotest.service.Virement;

public class TestVirement {
	
	Compte compteA;
	Compte compteB;
	double montantOperation;
	Virement virement;
	
	
	@Before
	public void initialisation() {
		System.out.println("Donnees Test scenario ");
		compteA = new Compte("ABC", 10000);
		compteB = new Compte("DEF", 20000);
		montantOperation = 500; 
		virement = new Virement(compteA, compteB, montantOperation);
	}
	
	@Test()
	//vérifier que le virement existe
	public void testExistanceVirement() {
		System.out.println("Test testExistanceCompteA");
		assertNotNull(virement);
	}
		
	
	  @Test
	 //vérifier que l'objet compte A de la classe virement correspond à l'attribut donné en paramètre
	  public void testValeurAttributCompteA() {
	    System.out.println("test testValeurAttributCompteA");
	    assertSame("should be same", compteA, virement.getCompteA());
	    
	}
	  
	  @Test
	//vérifier que l'attribut montant de la classe virement correspond à celui donné en paramètre
	  public void testValeurAttributMontantOperation() {
		System.out.println("test testNewSoldeCompteA");
		double montantReal = virement.getMontantOperation();
		System.out.println(montantReal);
		System.out.println(montantOperation);
		assertEquals(montantOperation, montantReal, 0);
	}
	  
	  @Test
	 //vérifier que le nouveau solde du compte A correspond au solde attentu après virement
	  public void testValeurSoldeCompteAApresVirement() {
		System.out.println("test testValeurSoldeCompteAApresVirement");
		virement.effectuerVirement();
		double SoldeDebExpect = 9500;
		double SoldeDebReal = compteA.getSolde();
		System.out.println(SoldeDebExpect);
		System.out.println(SoldeDebReal);
		assertEquals(SoldeDebExpect, SoldeDebReal,0);
	}	 
	  
	  @Test
	 //vérifier que le nouveau solde du compte B correspond au solde attentu après virement
	  public void testValeurSoldeCompteBApresVirement() {
		System.out.println("test testValeurSoldeCompteBApresVirement");
		virement.effectuerVirement();
		double SoldeCreExpect = 20500;
		double SoldeCreReal = compteB.getSolde();
		System.out.println(SoldeCreExpect);
		System.out.println(SoldeCreReal);
		assertEquals(SoldeCreExpect, SoldeCreReal,0);
	}	  
}	
