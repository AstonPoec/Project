package com.cvtheque.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cvtheque.dao.IUtilisateurDAO;
import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.entity.IUtilisateurEntity;
import com.cvtheque.service.ex.AuthentificationException;
import com.cvtheque.service.ex.ErreurTechniqueException;
import com.cvtheque.service.ex.MauvaisMotdepasseException;
import com.cvtheque.service.ex.UtilisateurInconnuException;

/**
 * Gestion de l'authentification.
 */


public class AuthentificationService extends AbstractService implements
		IAuthentificationService {

	 
	private IUtilisateurDAO utilisateurDAO;

	/**
	 * Constructeur de l'objet.
	 */
	public AuthentificationService() {
		super();		
	}

	/**
	 * Recupere la propriete <i>utilisateurDAO</i>.
	 *
	 * @return the utilisateurDAO la valeur de la propriete.
	 */
	public IUtilisateurDAO getUtilisateurDAO() {
		return this.utilisateurDAO;
	}

	/**
	 * Fixe la propriete <i>utilisateurDAO</i>.
	 *
	 * @param pUtilisateurDAO
	 *            la nouvelle valeur pour la propriete utilisateurDAO.
	 */
	public void setUtilisateurDAO(IUtilisateurDAO pUtilisateurDAO) {
		this.utilisateurDAO = pUtilisateurDAO;
	}

	
	@Transactional(propagation=Propagation.REQUIRES_NEW, rollbackFor=ErreurTechniqueException.class, readOnly = true)
	public IUtilisateurEntity authentifier(String pLogin, String pPassword)
			throws AuthentificationException, ErreurTechniqueException {
		if ((pLogin == null) || (pLogin.trim().length() == 0)) {
			throw new NullPointerException("login");
		}
		if ((pPassword == null) || (pPassword.trim().length() == 0)) {
			throw new NullPointerException("password");
		}
		IUtilisateurEntity resultat = null;
		try {
			resultat = this.utilisateurDAO.selectLogin(pLogin);
		} catch (ExceptionDao e) {
			throw new ErreurTechniqueException(e);
		}
		if (resultat == null) {
			throw new UtilisateurInconnuException();
		}
		if (!pPassword.equals(resultat.getPaswd())) {
			throw new MauvaisMotdepasseException();
		}

		return resultat;
	}
}
