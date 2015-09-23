/**
 * 
 */
package com.cvtheque.entity;

import java.sql.Blob;

import com.cvtheque.entity.IEntity;

/**
 * @author aston
 *
 */
public interface IRecruteurEntity extends IEntity {

	public abstract int getNoRecruteur();
		

	/**
	 * @param noRecruteur the noRecruteur to set
	 */
	public abstract void setNoRecruteur(int noRecruteur);
	

	/**
	 * @return the nomRecruteur
	 */
	public abstract String getNomRecruteur();

	/**
	 * @param nomRecruteur the nomRecruteur to set
	 */
	public abstract void setNomRecruteur(String nomRecruteur);

	/**
	 * @return the prenRecruteur
	 */
	public abstract String getPrenRecruteur();

	/**
	 * @param prenRecruteur the prenRecruteur to set
	 */
	public abstract void setPrenRecruteur(String prenRecruteur);

	/**
	 * @return the adrRecruteur
	 */
	public abstract String getAdrRecruteur();

	/**
	 * @param adrRecruteur the adrRecruteur to set
	 */
	public abstract void setAdrRecruteur(String adrRecruteur);

	/**
	 * @return the villeRecruteur
	 */
	public abstract String getVilleRecruteur();

	/**
	 * @param villeRecruteur the villeRecruteur to set
	 */
	public abstract void setVilleRecruteur(String villeRecruteur);

	/**
	 * @return the codepRecruteur
	 */
	public abstract String getCodepRecruteur();

	/**
	 * @param codepRecruteur the codepRecruteur to set
	 */
	public abstract void setCodepRecruteur(String codepRecruteur);

	/**
	 * @return the presentationRecruteur
	 */
	public abstract Blob getPresentationRecruteur();

	/**
	 * @param presentationRecruteur the presentationRecruteur to set
	 */
	public abstract void setPresentationRecruteur(Blob presentationRecruteur);

}
