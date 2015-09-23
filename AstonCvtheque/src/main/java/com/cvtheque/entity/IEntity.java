/**
 * 
 */
package com.cvtheque.entity;

/**
 * @author aston
 *
 */
public interface IEntity {

	/**
	 * Recupere l'id du Candidat ou recruteur.
	 * 
	 * @return l'id du candidat ou du recruteur.
	 */
	public abstract Integer getId();

	/**
	 * Fixe l'id Candidat ou recruteur.
	 * 
	 * @param unId
	 *            du candidat ou recruteur.
	 */
	public abstract void setId(Integer unId);
	
}
