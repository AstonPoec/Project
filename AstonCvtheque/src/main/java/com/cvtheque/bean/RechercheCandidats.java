package com.cvtheque.bean;

import java.util.List;


import com.cvtheque.entity.ICandidatEntity;

public class RechercheCandidats {

	private String poste;
	private String motsCles;
	private String region;
	private String departement;
	private String classe;
	private String diplome;
	private String ecole;
	private String competence;
	private String niveau;
	private List <ICandidatEntity>resultats;
	
	public RechercheCandidats(){
		this(null, null, null, null, null, null, null, null, null, null);
	}
	public RechercheCandidats(String poste, String motsCles, String region, String departement, String classe,
			String diplome, String ecole, String competence, String niveau, List<ICandidatEntity> resultats) {
		
		this.setPoste(poste);
		this.setMotsCles(motsCles);
		this.setRegion(region);
		this.setDepartement(departement);
		this.setClasse(classe); 
		this.setDiplome(diplome);
		this.setEcole(ecole);
		this.setCompetence(competence);
		this.setNiveau(niveau);
		this.setResultats(resultats);
	}


	
		
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	public String getMotsCles() {
		return motsCles;
	}
	public void setMotsCles(String motsCles) {
		this.motsCles = motsCles;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getEcole() {
		return ecole;
	}
	public void setEcole(String ecole) {
		this.ecole = ecole;
	}
	public String getCompetence() {
		return competence;
	}
	public void setCompetence(String competence) {
		this.competence = competence;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public List<ICandidatEntity> getResultats() {
		return resultats;
	}
	public void setResultats(List <ICandidatEntity>resultats) {
		this.resultats = resultats;
	}
	@Override
	public String toString() {

		StringBuffer buff = new StringBuffer();
		buff.append(this.getClass().getSimpleName());
		buff.append("[");
		buff.append(this.getPoste());
		buff.append(",");
		buff.append(this.getMotsCles());
		buff.append(",");
		buff.append(this.getRegion());
		buff.append(",");
		buff.append(this.getDepartement());
		buff.append(",");
		buff.append(this.getClasse());
		buff.append(",");
		buff.append(this.getDiplome());
		buff.append(",");
		buff.append(this.getEcole());
		buff.append(",");
		buff.append(this.getCompetence());
		buff.append(",");
		buff.append(this.getNiveau());
		buff.append(",");
		buff.append(this.getResultats());
		buff.append("]");
		return buff.toString();
	}	
}
