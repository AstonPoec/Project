/**
 * 
 */
package com.cvtheque.dao;

import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.entity.IUtilisateurEntity;

/**
 * @author aston
 *
 */
public interface IUtilisateurDAO extends IDAO<IUtilisateurEntity> {
	
	/**
	 * Selectionne le premier utilisateur ayant le login indique.
	 *
	 * @param pLogin
	 *            un login.
	 * @param connexion
	 *            une connection (peut etre null)
	 * @return l'utilisateur
	 * @throws ExceptionDao
	 *             si une erreur survient
	 */

	public abstract IUtilisateurEntity selectLogin(String pLogin) throws ExceptionDao;
	
}
