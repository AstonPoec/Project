package com.cvtheque.service;

import javax.naming.AuthenticationException;

import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.entity.ICandidatEntity;
import com.cvtheque.servlet.Candidat;

public interface IInscriptionEtatCivil {

	public abstract ICandidatEntity inscrireEtatCivil(Candidat c)
			throws AuthenticationException, ExceptionDao;

}