package com.cvtheque.servlet;

import java.util.Date;

public class Candidat {

	private static final long serialVersionUID = 1L;

	String nom;
	String prenom;
	Date DateDeN;
	String adresse;
	String codePostal;
	String ville;
	String departement;
	String email;
	String classe;
	String contrat;

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeN() {
		return this.DateDeN;
	}

	public void setDateDeN(Date dateDeN) {
		this.DateDeN = dateDeN;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClasse() {
		return this.classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getContrat() {
		return this.contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}

	public Candidat() {
		// TODO Auto-generated constructor stub
	}

}
