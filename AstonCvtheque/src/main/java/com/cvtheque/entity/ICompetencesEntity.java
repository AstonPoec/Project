/**
 * 
 */
package com.cvtheque.entity;

/**
 * @author aston
 *
 */
public interface ICompetencesEntity extends IEntity {

	public int getNoCandidatComp();

	/**
	 * @param noCandidatComp the noCandidatComp to set
	 */
	public void setNoCandidatComp(int noCandidatComp);

	/**
	 * @return the codeComp
	 */
	public int getCodeComp();

	/**
	 * @param codeComp the codeComp to set
	 */
	public void setCodeComp(int codeComp);

	/**
	 * @return the niveauComp
	 */
	public int getNiveauComp();

	/**
	 * @param niveauComp the niveauComp to set
	 */
	public void setNiveauComp(int niveauComp);
	
}
