package com.cvtheque.bean;

public class RecruteurInscription {

	
	private String login;
	private String password;
	private String confirmPassword;
	private String nomContact;
	private String raisonSociale;
	private String adresse;
	private String ville;
	private String codePostal;
	private String secteurActivites;
	private String presentation;
	
	public RecruteurInscription(){
		this(null, null, null, null, null, null, null, null, null, null);
	}
	public RecruteurInscription(String login, String motDePasse, String confirmMdp, String nomContact,
			String raisonSociale, String adresse, String ville, String codePostal, String secteurActivite,
			String presentation) {
	
		this.setLogin(login);
		this.setPassword(motDePasse);
		this.setConfirmPassword(confirmMdp);
		this.setNomContact(nomContact);
		this.setRaisonSociale(raisonSociale);
		this.setAdresse(adresse);
		this.setVille(ville);
		this.setCodePostal(codePostal);
		this.setSecteurActivites(secteurActivite);
		this.setPresentation(presentation);
	}

	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getNomContact() {
		return nomContact;
	}
	public void setNomContact(String nomContact) {
		this.nomContact = nomContact;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getSecteurActivites() {
		return secteurActivites;
	}
	public void setSecteurActivites(String secteurActivites) {
		this.secteurActivites = secteurActivites;
	}
	public String getPresentation() {
		return presentation;
	}
	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}
	@Override
	public String toString() {

		StringBuffer buff = new StringBuffer();
		buff.append(this.getClass().getSimpleName());
		buff.append("[");
		buff.append(this.getLogin());
		buff.append(",");
		buff.append(this.getPassword());
		buff.append(",");
		buff.append(this.getConfirmPassword());
		buff.append(",");
		buff.append(this.getNomContact());
		buff.append(",");
		buff.append(this.getRaisonSociale());
		buff.append(",");
		buff.append(this.getAdresse());
		buff.append(",");
		buff.append(this.getVille());
		buff.append(",");
		buff.append(this.getCodePostal());
		buff.append(",");
		buff.append(this.getSecteurActivites());
		buff.append(",");
		buff.append(this.getPresentation());
		buff.append("]");
		return buff.toString();
	}
	
}
