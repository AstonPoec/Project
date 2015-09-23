package com.cvtheque.entity;

import java.sql.Blob;
import java.sql.Date;


public interface ICandidatEntity extends IEntity {
	
	public int getNoCandidat();

	/**
	 * @param noCandidat the noCandidat to set
	 */
	public void setNoCandidat(int noCandidat);

	/**
	 * @return the nomCandidat
	 */
	public String getNomCandidat();

	/**
	 * @param nomCandidat the nomCandidat to set
	 */
	public void setNomCandidat(String nomCandidat);

	/**
	 * @return the prenCandidat
	 */
	public String getPrenCandidat();

	/**
	 * @param prenCandidat the prenCandidat to set
	 */
	public void setPrenCandidat(String prenCandidat);
	

	/**
	 * @return the datnCandidat
	 */
	public Date getDatnCandidat();

	/**
	 * @param datnCandidat the datnCandidat to set
	 */
	public void setDatnCandidat(Date datnCandidat);

	/**
	 * @return the adrCandidat
	 */
	public String getAdrCandidat();

	/**
	 * @param adrCandidat the adrCandidat to set
	 */
	public void setAdrCandidat(String adrCandidat);

	/**
	 * @return the villeCandidat
	 */
	public String getVilleCandidat();

	/**
	 * @param villeCandidat the villeCandidat to set
	 */
	public void setVilleCandidat(String villeCandidat);

	/**
	 * @return the codepCandidat
	 */
	public String getCodepCandidat();

	/**
	 * @param codepCandidat the codepCandidat to set
	 */
	public void setCodepCandidat(String codepCandidat);

	/**
	 * @return the depCandidat
	 */
	public String getDepCandidat();

	/**
	 * @param depCandidat the depCandidat to set
	 */
	public void setDepCandidat(String depCandidat);

	/**
	 * @return the dateInscription
	 */
	public Date getDateInscription();

	/**
	 * @param dateInscription the dateInscription to set
	 */
	public void setDateInscription(Date dateInscription);

	/**
	 * @return the etapeEnreg
	 */
	public int getEtapeEnreg();

	/**
	 * @param etapeEnreg the etapeEnreg to set
	 */
	public void setEtapeEnreg(int etapeEnreg);

	/**
	 * @return the photo
	 */
	public Blob getPhoto();

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Blob photo);

	/**
	 * @return the cvCandidat
	 */
	public Blob getCvCandidat();

	/**
	 * @param cvCandidat the cvCandidat to set
	 */
	public void setCvCandidat(Blob cvCandidat);

	/**
	 * @return the vehicule
	 */
	public int getVehicule();

	/**
	 * @param vehicule the vehicule to set
	 */
	public void setVehicule(int vehicule);

}
