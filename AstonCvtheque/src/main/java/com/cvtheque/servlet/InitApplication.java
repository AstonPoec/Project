package com.cvtheque.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitApplication
 */
public class InitApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitApplication() {
        super();
      
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
		
		
		Map<Integer, String> region = new HashMap<Integer, String>();
		region.put(1, "Ile de France");
		region.put(2, "Alsace");
		region.put(3, "Poitou-Charentes");
		region.put(4, "Nord-Pas-de-Calais");
		region.put(5, "Picardie");
		config.getServletContext().setAttribute("region",region);
		
		
		
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
