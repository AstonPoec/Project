package com.cvtheque.entity;

import java.sql.Date;

public class FormationEntity extends AbstractEntity implements IFormationEntity {

	private int 	noCandidatDip;
	private Date 	dateDebutDip;
	private Date 	dateFinDip;
	private String 	ecole;
	private int 	codeDip;
	
	public FormationEntity() {
		super();
	}

	/**
	 * @return the noCandidatDip
	 */
	public int getNoCandidatDip() {
		return noCandidatDip;
	}

	/**
	 * @param noCandidatDip the noCandidatDip to set
	 */
	public void setNoCandidatDip(int noCandidatDip) {
		this.noCandidatDip = noCandidatDip;
	}

	/**
	 * @return the dateDebutDip
	 */
	public Date getDateDebutDip() {
		return dateDebutDip;
	}

	/**
	 * @param dateDebutDip the dateDebutDip to set
	 */
	public void setDateDebutDip(Date dateDebutDip) {
		this.dateDebutDip = dateDebutDip;
	}

	/**
	 * @return the dateFinDip
	 */
	public Date getDateFinDip() {
		return dateFinDip;
	}

	/**
	 * @param dateFinDip the dateFinDip to set
	 */
	public void setDateFinDip(Date dateFinDip) {
		this.dateFinDip = dateFinDip;
	}

	/**
	 * @return the ecole
	 */
	public String getEcole() {
		return ecole;
	}

	/**
	 * @param ecole the ecole to set
	 */
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}

	/**
	 * @return the codeDip
	 */
	public int getCodeDip() {
		return codeDip;
	}

	/**
	 * @param codeDip the codeDip to set
	 */
	public void setCodeDip(int codeDip) {
		this.codeDip = codeDip;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer unId) {
		// TODO Auto-generated method stub
		
	}
		

}
