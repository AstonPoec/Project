package com.cvtheque.entity;

public class CompetencesEntity extends AbstractEntity implements ICompetencesEntity {
	
	private int noCandidatComp;
	private int codeComp;
	private int niveauComp;

	public CompetencesEntity() {
		super();
	}

	/**
	 * @return the noCandidatComp
	 */
	public int getNoCandidatComp() {
		return noCandidatComp;
	}

	/**
	 * @param noCandidatComp the noCandidatComp to set
	 */
	public void setNoCandidatComp(int noCandidatComp) {
		this.noCandidatComp = noCandidatComp;
	}

	/**
	 * @return the codeComp
	 */
	public int getCodeComp() {
		return codeComp;
	}

	/**
	 * @param codeComp the codeComp to set
	 */
	public void setCodeComp(int codeComp) {
		this.codeComp = codeComp;
	}

	/**
	 * @return the niveauComp
	 */
	public int getNiveauComp() {
		return niveauComp;
	}

	/**
	 * @param niveauComp the niveauComp to set
	 */
	public void setNiveauComp(int niveauComp) {
		this.niveauComp = niveauComp;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer unId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
