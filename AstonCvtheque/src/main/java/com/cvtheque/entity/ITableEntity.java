package com.cvtheque.entity;

public interface ITableEntity extends IEntity {
	
	/**
	 * @return the codeTable
	 */
	public int getCodeTable();

	/**
	 * @param codeTable the codeTable to set
	 */
	public void setCodeTable(int codeTable);

	/**
	 * @return the codeElement
	 */
	public int getCodeElement();

	/**
	 * @param codeElement the codeElement to set
	 */
	public void setCodeElement(int codeElement);

	/**
	 * @return the libelleElement
	 */
	public String getLibelleElement();

	/**
	 * @param libelleElement the libelleElement to set
	 */
	public void setLibelleElement(String libelleElement);

}
