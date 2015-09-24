package com.cvtheque.service;

import java.sql.Date;

import javax.naming.AuthenticationException;

import org.springframework.stereotype.Service;

import com.cvtheque.dao.ICandidatDAO;
import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.entity.CandidatEntity;
import com.cvtheque.entity.ICandidatEntity;
import com.cvtheque.servlet.Candidat;

@Service
public class InscriptionEtatCivil implements IInscriptionEtatCivil {

	private ICandidatDAO utilisateurDAO;

	public InscriptionEtatCivil() {
		// TODO Auto-generated constructor stub
	}

	public ICandidatDAO getUtilisateurDAO() {
		return this.utilisateurDAO;
	}

	public void setUtilisateurDAO(ICandidatDAO utilisateurDAO) {
		this.utilisateurDAO = utilisateurDAO;
	}

	@Override
	public ICandidatEntity inscrireEtatCivil(Candidat c)
			throws AuthenticationException, ExceptionDao {

		if (c == null) {
			throw new NullPointerException(null);
		}

		ICandidatEntity resultat = new CandidatEntity();

		resultat.setNomCandidat(c.getNom());
		resultat.setPrenCandidat(c.getPrenom());
		resultat.setDatnCandidat((Date) c.getDateDeN());
		resultat.setAdrCandidat(c.getAdresse());
		resultat.setCodepCandidat(c.getCodePostal());
		resultat.setVilleCandidat(c.getVille());

		try {

			resultat = this.utilisateurDAO.insert(resultat);
		} catch (ExceptionDao e) {
			throw new ExceptionDao(e);

		}
		return resultat;
	}
}