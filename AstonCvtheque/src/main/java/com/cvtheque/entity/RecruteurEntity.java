package com.cvtheque.entity;

import java.sql.Blob;

public class RecruteurEntity extends AbstractEntity implements IRecruteurEntity {
	
	private int 		noRecruteur;
	private String 		nomRecruteur;
	private String 		prenRecruteur;
	private String 		adrRecruteur;
	private String 		villeRecruteur;
	private String 		codepRecruteur;
	private Blob 		presentationRecruteur;

	public RecruteurEntity() {
		super();
	}

	/**
	 * @return the noRecruteur
	 */
	public int getNoRecruteur() {
		return noRecruteur;
	}

	/**
	 * @param noRecruteur the noRecruteur to set
	 */
	public void setNoRecruteur(int noRecruteur) {
		this.noRecruteur = noRecruteur;
	}

	/**
	 * @return the nomRecruteur
	 */
	public String getNomRecruteur() {
		return nomRecruteur;
	}

	/**
	 * @param nomRecruteur the nomRecruteur to set
	 */
	public void setNomRecruteur(String nomRecruteur) {
		this.nomRecruteur = nomRecruteur;
	}

	/**
	 * @return the prenRecruteur
	 */
	public String getPrenRecruteur() {
		return prenRecruteur;
	}

	/**
	 * @param prenRecruteur the prenRecruteur to set
	 */
	public void setPrenRecruteur(String prenRecruteur) {
		this.prenRecruteur = prenRecruteur;
	}

	/**
	 * @return the adrRecruteur
	 */
	public String getAdrRecruteur() {
		return adrRecruteur;
	}

	/**
	 * @param adrRecruteur the adrRecruteur to set
	 */
	public void setAdrRecruteur(String adrRecruteur) {
		this.adrRecruteur = adrRecruteur;
	}

	/**
	 * @return the villeRecruteur
	 */
	public String getVilleRecruteur() {
		return villeRecruteur;
	}

	/**
	 * @param villeRecruteur the villeRecruteur to set
	 */
	public void setVilleRecruteur(String villeRecruteur) {
		this.villeRecruteur = villeRecruteur;
	}

	/**
	 * @return the codepRecruteur
	 */
	public String getCodepRecruteur() {
		return codepRecruteur;
	}

	/**
	 * @param codepRecruteur the codepRecruteur to set
	 */
	public void setCodepRecruteur(String codepRecruteur) {
		this.codepRecruteur = codepRecruteur;
	}

	/**
	 * @return the presentationRecruteur
	 */
	public Blob getPresentationRecruteur() {
		return presentationRecruteur;
	}

	/**
	 * @param presentationRecruteur the presentationRecruteur to set
	 */
	public void setPresentationRecruteur(Blob presentationRecruteur) {
		this.presentationRecruteur = presentationRecruteur;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer unId) {
		// TODO Auto-generated method stub
		
	}	

}
