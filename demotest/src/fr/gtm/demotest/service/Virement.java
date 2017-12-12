package fr.gtm.demotest.service;


public class Virement {
	
	private Compte compteA;
	private Compte compteB;
	double montantOperation;

	
	
	  public Virement(Compte compteA, Compte compteB, double montantOperation) {
		super();
		this.compteA = compteA;
		this.compteB = compteB;
		this.montantOperation = montantOperation;
	}


	public Compte getCompteA() {
		return compteA;
	}



	public void setCompteA(Compte compteA) {
		this.compteA = compteA;
	}



	public Compte getCompteB() {
		return compteB;
	}



	public void setCompteB(Compte compteB) {
		this.compteB = compteB;
	}



	public double getMontantOperation() {
		return montantOperation;
	}



	public void setMontantOperation(double montantOperation) {
		this.montantOperation = montantOperation;
	}



	public void effectuerVirement() {
			// TODO - implement AccountServices.getAccountList
		double soldeCompteA;
		double soldeCompteB;
		double montantOp;
		
		//Instanciation
		soldeCompteA = this.compteA.getSolde();
		soldeCompteB = this.compteB.getSolde();
		montantOp = this.montantOperation;
		
		//Opération
		soldeCompteA = soldeCompteA - montantOperation;
		soldeCompteB = soldeCompteB + montantOperation;
		compteA.setSolde(soldeCompteA);
		compteB.setSolde(soldeCompteB);

	  }	
}
