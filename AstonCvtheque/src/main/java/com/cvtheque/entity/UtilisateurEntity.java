package com.cvtheque.entity;

import java.sql.Date;

import com.cvtheque.entity.AbstractEntity;
import com.cvtheque.entity.IUtilisateurEntity;

public class UtilisateurEntity extends AbstractEntity implements
IUtilisateurEntity {
	
	private int 		noUser;
	private String 		login;
	private String 		paswd;
	private int 		typeUser;
	private Date 		dateCreation;
	private int			idUtilisateur;

	public UtilisateurEntity() {
		super();
	}

	/**
	 * @return the noUser
	 */
	public int getNoUser() {
		return noUser;
	}

	/**
	 * @param noUser the noUser to set
	 */
	public void setNoUser(int noUser) {
		this.noUser = noUser;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the paswd
	 */
	public String getPaswd() {
		return paswd;
	}

	/**
	 * @param paswd the paswd to set
	 */
	public void setPaswd(String paswd) {
		this.paswd = paswd;
	}

	/**
	 * @return the typeUser
	 */
	public int getTypeUser() {
		return typeUser;
	}

	/**
	 * @param typeUser the typeUser to set
	 */
	public void setTypeUser(int typeUser) {
		this.typeUser = typeUser;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the idUtilisateur
	 */
	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(Integer unId) {
		// TODO Auto-generated method stub
		
	}	
	

}
