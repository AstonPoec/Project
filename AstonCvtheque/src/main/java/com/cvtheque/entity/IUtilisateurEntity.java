package com.cvtheque.entity;

import java.sql.Date;

import com.cvtheque.entity.IEntity;

public interface IUtilisateurEntity extends IEntity {

	
	/**
	 * @return the noUser
	 */
	public abstract int getNoUser();

	/**
	 * @param noUser the noUser to set
	 */
	public abstract void setNoUser(int noUser);

	/**
	 * @return the login
	 */
	public abstract String getLogin();

	/**
	 * @param login the login to set
	 */
	public abstract void setLogin(String login);

	/**
	 * @return the paswd
	 */
	public abstract String getPaswd();

	/**
	 * @param paswd the paswd to set
	 */
	public abstract void setPaswd(String paswd);
	
	/**
	 * @return the typeUser
	 */
	public abstract int getTypeUser();

	/**
	 * @param typeUser the typeUser to set
	 */
	public abstract void setTypeUser(int typeUser);

	/**
	 * @return the dateCreation
	 */
	public abstract Date getDateCreation();

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public abstract void setDateCreation(Date dateCreation);
	

	/**
	 * @return the idUtilisateur
	 */
	public abstract int getIdUtilisateur();
	

	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public abstract void setIdUtilisateur(int idUtilisateur);
	
}
