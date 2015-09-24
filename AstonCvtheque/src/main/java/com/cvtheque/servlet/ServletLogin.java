package com.cvtheque.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.cvtheque.entity.IUtilisateurEntity;
import com.cvtheque.service.IAuthentificationService;
import com.cvtheque.service.ex.AuthentificationException;
import com.cvtheque.service.ex.ErreurTechniqueException;



/**
 * Servlet implementation class ServletLogin
 */

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogin() {
        super();        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = null;
		String pwd = null;
		login = request.getParameter("login");
		pwd = request.getParameter("password");
	
		final Log LOG = LogFactory.getLog(ServletLogin.class);
		
		if (login!=null && pwd !=null){		
			
			try {
				WebApplicationContext appContext =	WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());				
				IAuthentificationService serviceAuth = appContext.getBean("authentifierservice", IAuthentificationService.class);
				IUtilisateurEntity utilisateur = serviceAuth.authentifier(login, pwd);				
				
				if (LOG.isInfoEnabled()) {
					LOG.info("Bonjour votre ID est le  " + utilisateur.getNoUser());							
				}
				
				if(Integer.valueOf(utilisateur.getNoUser()) != null && Integer.valueOf(utilisateur.getNoUser()) != 0){							
					request.getSession().setAttribute("Authentification-user", utilisateur.getNoUser());
					request.getSession().setAttribute("Authentification-login", utilisateur.getLogin());
					request.getRequestDispatcher("menu.jsp").forward(request,response);
				}
				else {					
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				
			} catch (AuthentificationException | ErreurTechniqueException e) {
				e.printStackTrace();
			}
		}
	}	

}
