/**
 * 
 */
package com.cvtheque.entity;

import java.sql.Date;

/**
 * @author aston
 *
 */
public interface IFormationEntity extends IEntity {

	/**
	 * @return the noCandidatDip
	 */
	public int getNoCandidatDip();

	/**
	 * @param noCandidatDip the noCandidatDip to set
	 */
	public void setNoCandidatDip(int noCandidatDip);

	/**
	 * @return the dateDebutDip
	 */
	public Date getDateDebutDip();

	/**
	 * @param dateDebutDip the dateDebutDip to set
	 */
	public void setDateDebutDip(Date dateDebutDip);

	/**
	 * @return the dateFinDip
	 */
	public Date getDateFinDip();

	/**
	 * @param dateFinDip the dateFinDip to set
	 */
	public void setDateFinDip(Date dateFinDip);

	/**
	 * @return the ecole
	 */
	public String getEcole();

	/**
	 * @param ecole the ecole to set
	 */
	public void setEcole(String ecole);

	/**
	 * @return the codeDip
	 */
	public int getCodeDip();

	/**
	 * @param codeDip the codeDip to set
	 */
	public void setCodeDip(int codeDip);
	
}
