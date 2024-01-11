package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidades.Persona;
import utils.Autenticar;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/usuario")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		String nombreUsuario = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		if (nombreUsuario == "" || password == "") {
			request.setAttribute("mensaje", "Inserte Username y Password!");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} else {
			Persona persona = null;
			persona = Autenticar.iniciarSesion(nombreUsuario, password);
			System.out.println(persona);
		
			if (persona.getRut() == null) {
				request.setAttribute("mensaje", "Usuario o Password invalidos!");
				request.getRequestDispatcher("index.jsp").forward(request, 
						response);
			} else {
				HttpSession sesion = request.getSession();
				sesion.setAttribute("persona", persona);
				request.getRequestDispatcher("dashboard.jsp").forward(request,
						response);
			}
		}
	}
}
