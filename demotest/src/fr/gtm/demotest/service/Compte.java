package fr.gtm.demotest.service;

public class Compte {
	private String numCompte;
	private double solde;
	
	public Compte(String numCompte, double solde) {
		super();
		this.numCompte = numCompte;
		this.solde = solde;
	}
	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	

}
