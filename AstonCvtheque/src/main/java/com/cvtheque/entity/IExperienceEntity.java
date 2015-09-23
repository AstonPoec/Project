/**
 * 
 */
package com.cvtheque.entity;

import java.sql.Date;

/**
 * @author aston
 *
 */
public interface IExperienceEntity extends IEntity {

	/**
	 * @return the noCandidatExp
	 */
	public int getNoCandidatExp();

	/**
	 * @param noCandidatExp the noCandidatExp to set
	 */
	public void setNoCandidatExp(int noCandidatExp);

	/**
	 * @return the dateDebExp
	 */
	public Date getDateDebExp();

	/**
	 * @param dateDebExp the dateDebExp to set
	 */
	public void setDateDebExp(Date dateDebExp);

	/**
	 * @return the dateFinExp
	 */
	public Date getDateFinExp();

	/**
	 * @param dateFinExp the dateFinExp to set
	 */
	public void setDateFinExp(Date dateFinExp);

	/**
	 * @return the posteExp
	 */
	public String getPosteExp();

	/**
	 * @param posteExp the posteExp to set
	 */
	public void setPosteExp(String posteExp);

	/**
	 * @return the societeExp
	 */
	public String getSocieteExp();

	/**
	 * @param societeExp the societeExp to set
	 */
	public void setSocieteExp(String societeExp);
	
}
