package com.cvtheque.entity;

public class TableEntity extends AbstractEntity implements ITableEntity {
	
	private int 		codeTable;
	private int 		codeElement;
	private String 		libelleElement;

	public TableEntity() {
		super();
	}

	/**
	 * @return the codeTable
	 */
	public int getCodeTable() {
		return codeTable;
	}

	/**
	 * @param codeTable the codeTable to set
	 */
	public void setCodeTable(int codeTable) {
		this.codeTable = codeTable;
	}

	/**
	 * @return the codeElement
	 */
	public int getCodeElement() {
		return codeElement;
	}

	/**
	 * @param codeElement the codeElement to set
	 */
	public void setCodeElement(int codeElement) {
		this.codeElement = codeElement;
	}

	/**
	 * @return the libelleElement
	 */
	public String getLibelleElement() {
		return libelleElement;
	}

	/**
	 * @param libelleElement the libelleElement to set
	 */
	public void setLibelleElement(String libelleElement) {
		this.libelleElement = libelleElement;
	}
	
	

}
