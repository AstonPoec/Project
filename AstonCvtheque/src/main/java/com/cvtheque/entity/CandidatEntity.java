package com.cvtheque.entity;

import java.sql.Blob;
import java.sql.Date;

import com.cvtheque.entity.AbstractEntity;


public class CandidatEntity extends AbstractEntity implements ICandidatEntity {
	
	//private static final long serialVersionUID = 1L;

	private int 	noCandidat;
	private String 	nomCandidat;
	private String 	prenCandidat;
	private Date   	datnCandidat;
	private String 	adrCandidat;
	private String 	villeCandidat;
	private String 	codepCandidat;
	private String 	depCandidat;
	private Date	dateInscription;
	private int 	etapeEnreg;
	private Blob    photo;
	private Blob    cvCandidat;
	private int 	vehicule;   
	
	

	public CandidatEntity() {
		super();
	}

	/**
	 * @return the noCandidat
	 */
	public int getNoCandidat() {
		return noCandidat;
	}

	/**
	 * @param noCandidat the noCandidat to set
	 */
	public void setNoCandidat(int noCandidat) {
		this.noCandidat = noCandidat;
	}

	/**
	 * @return the nomCandidat
	 */
	public String getNomCandidat() {
		return nomCandidat;
	}

	/**
	 * @param nomCandidat the nomCandidat to set
	 */
	public void setNomCandidat(String nomCandidat) {
		this.nomCandidat = nomCandidat;
	}

	/**
	 * @return the prenCandidat
	 */
	public String getPrenCandidat() {
		return prenCandidat;
	}

	/**
	 * @param prenCandidat the prenCandidat to set
	 */
	public void setPrenCandidat(String prenCandidat) {
		this.prenCandidat = prenCandidat;
	}

	/**
	 * @return the datnCandidat
	 */
	public Date getDatnCandidat() {
		return datnCandidat;
	}

	/**
	 * @return the dateInscription
	 */
	public Date getDateInscription() {
		return dateInscription;
	}

	/**
	 * @param dateInscription the dateInscription to set
	 */
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	/**
	 * @param datnCandidat the datnCandidat to set
	 */
	public void setDatnCandidat(Date datnCandidat) {
		this.datnCandidat = datnCandidat;
	}

	/**
	 * @return the adrCandidat
	 */
	public String getAdrCandidat() {
		return adrCandidat;
	}

	/**
	 * @param adrCandidat the adrCandidat to set
	 */
	public void setAdrCandidat(String adrCandidat) {
		this.adrCandidat = adrCandidat;
	}

	/**
	 * @return the villeCandidat
	 */
	public String getVilleCandidat() {
		return villeCandidat;
	}

	/**
	 * @param villeCandidat the villeCandidat to set
	 */
	public void setVilleCandidat(String villeCandidat) {
		this.villeCandidat = villeCandidat;
	}

	/**
	 * @return the codepCandidat
	 */
	public String getCodepCandidat() {
		return codepCandidat;
	}

	/**
	 * @param codepCandidat the codepCandidat to set
	 */
	public void setCodepCandidat(String codepCandidat) {
		this.codepCandidat = codepCandidat;
	}

	/**
	 * @return the depCandidat
	 */
	public String getDepCandidat() {
		return depCandidat;
	}

	/**
	 * @param depCandidat the depCandidat to set
	 */
	public void setDepCandidat(String depCandidat) {
		this.depCandidat = depCandidat;
	}

	

	/**
	 * @return the etapeEnreg
	 */
	public int getEtapeEnreg() {
		return etapeEnreg;
	}

	/**
	 * @param etapeEnreg the etapeEnreg to set
	 */
	public void setEtapeEnreg(int etapeEnreg) {
		this.etapeEnreg = etapeEnreg;
	}

	/**
	 * @return the photo
	 */
	public Blob getPhoto() {
		return photo;
	}

	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	/**
	 * @return the cvCandidat
	 */
	public Blob getCvCandidat() {
		return cvCandidat;
	}

	/**
	 * @param cvCandidat the cvCandidat to set
	 */
	public void setCvCandidat(Blob cvCandidat) {
		this.cvCandidat = cvCandidat;
	}

	/**
	 * @return the vehicule
	 */
	public int getVehicule() {
		return vehicule;
	}

	/**
	 * @param vehicule the vehicule to set
	 */
	public void setVehicule(int vehicule) {
		this.vehicule = vehicule;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String parent = super.toString();
		parent = parent.substring(0, parent.length() - 1);
		sb.append(parent);
		sb.append(",No Candidat=");
		sb.append(this.getNoCandidat());
		sb.append(", Nom=");
		sb.append(this.getNomCandidat());
		sb.append(", Prenom=");
		sb.append(this.getPrenCandidat());
		sb.append(", Date naissance=");
		sb.append(this.getDatnCandidat());
		sb.append(", Adresse=");
		sb.append(this.getAdrCandidat());
		sb.append(", Ville=");
		sb.append(this.getVilleCandidat());
		sb.append(", Code Postal=");
		sb.append(this.getCodepCandidat());
		sb.append(", Département=");
		sb.append(this.getDepCandidat());
		sb.append(", Date Inscription=");
		sb.append(this.getDateInscription());
		sb.append(", Etape=");
		sb.append(this.getEtapeEnreg());
		sb.append(", Vehicule=");
		sb.append(this.getVehicule());
		return sb.toString();
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer unId) {
		// TODO Auto-generated method stub
		
	}

}
