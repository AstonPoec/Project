package com.cvtheque.entity;

import java.sql.Date;

public class ExperienceEntity extends AbstractEntity implements IExperienceEntity {
	
	private int 		noCandidatExp;
	private Date 		dateDebExp;
	private Date 		dateFinExp;
	private String		posteExp;
	private String		societeExp;

	public ExperienceEntity() {
		super();
	}

	/**
	 * @return the noCandidatExp
	 */
	public int getNoCandidatExp() {
		return noCandidatExp;
	}

	/**
	 * @param noCandidatExp the noCandidatExp to set
	 */
	public void setNoCandidatExp(int noCandidatExp) {
		this.noCandidatExp = noCandidatExp;
	}

	/**
	 * @return the dateDebExp
	 */
	public Date getDateDebExp() {
		return dateDebExp;
	}

	/**
	 * @param dateDebExp the dateDebExp to set
	 */
	public void setDateDebExp(Date dateDebExp) {
		this.dateDebExp = dateDebExp;
	}

	/**
	 * @return the dateFinExp
	 */
	public Date getDateFinExp() {
		return dateFinExp;
	}

	/**
	 * @param dateFinExp the dateFinExp to set
	 */
	public void setDateFinExp(Date dateFinExp) {
		this.dateFinExp = dateFinExp;
	}

	/**
	 * @return the posteExp
	 */
	public String getPosteExp() {
		return posteExp;
	}

	/**
	 * @param posteExp the posteExp to set
	 */
	public void setPosteExp(String posteExp) {
		this.posteExp = posteExp;
	}

	/**
	 * @return the societeExp
	 */
	public String getSocieteExp() {
		return societeExp;
	}

	/**
	 * @param societeExp the societeExp to set
	 */
	public void setSocieteExp(String societeExp) {
		this.societeExp = societeExp;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer unId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
