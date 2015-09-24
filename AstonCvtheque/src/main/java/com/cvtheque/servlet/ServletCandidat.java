package com.cvtheque.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cvtheque.dao.ex.ExceptionDao;
import com.cvtheque.entity.IUtilisateurEntity;
import com.cvtheque.entity.UtilisateurEntity;
import com.cvtheque.service.IInscriptionEtatCivil;

@WebServlet
public class ServletCandidat<IServiceCandidat> extends HttpServlet {

	/**
	 *
	 */
	private static final long serialVersionUID = 5193913835681734479L;

	public ServletCandidat() {
		// TODO Auto-generated constructor stub

	}

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// recuperer le service candidat
		IServiceCandidat cdt = null;
		WebApplicationContext context = WebApplicationContextUtils
				.getWebApplicationContext(request.getServletContext());

		IInscriptionEtatCivil inscription = context
				.getBean(IInscriptionEtatCivil.class);
		try {
			inscription.inscrireEtatCivil((Candidat) cdt);
		} catch (AuthenticationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExceptionDao e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		IUtilisateurEntity user = new UtilisateurEntity();

		// recuperer toutes les valeurs des champs du formulare web
		String nom = request.getParameter("cvt-name");
		String prenom = request.getParameter("cvt-prenom");

		String DateDeN = request.getParameter("cvt-datedenaissance");
		Date date = null;
		try {
			date = new SimpleDateFormat("yyyy-MM-dd").parse(DateDeN);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String adresse = request.getParameter("cvt-adresse");
		String codePostal = request.getParameter("cvt-codepostal");
		String ville = request.getParameter("cvt-ville");
		String departement = request.getParameter("cvt-departement");
		String email = request.getParameter("cvt-email");
		String classe = request.getParameter("cvt-classe");
		String contrat = request.getParameter("cvt-contrat");
		String login = (String) request.getSession().getAttribute(
				user.getLogin());

		Candidat c = new Candidat();

		c.setNom(nom);
		c.setPrenom(prenom);
		c.setDateDeN(date);
		c.setAdresse(adresse);
		c.setCodePostal(codePostal);
		c.setVille(ville);
		c.setDepartement(departement);
		c.setEmail(email);
		c.setClasse(classe);
		c.setContrat(contrat);
		// et les mettre dans le bean de steeve
		// passe le bean au service recupere les infos
		// gerer tout est ok = partir vers une autre page
		// gerer pblm =

		// objJ bd = null;
		// try {
		// // Recuperation des clients
		// bd = new AccesBD(ServletClient.DB_DRIVER);
		// bd.seConnecter(ServletClient.DB_URL, ServletClient.DB_LOGIN,
		// ServletClient.DB_PWD);
		// List<Client> lClients = bd.selectUtilisateur();
		// // on place le resultat dans le scope request
		// // car on va s'en servir uniquement dans l'ecran qui suit
		// request.setAttribute("listeClients", lClients);
		// } catch (SQLException e) {
		// // NE JAMAIS FAIRE EN WEB
		// // e.printStackTrace();
		// request.setAttribute("erreur",
		// "Erreur dans la servlet (" + e.getMessage() + ")");
		// } finally {
		// if (bd != null) {
		// bd.seDeconnecter();
		// }
		// }
		// // On part vers la jsp, on fait suivre
		// request.getRequestDispatcher("/menu.jsp").forward(request, response);
		// }
	}
}
