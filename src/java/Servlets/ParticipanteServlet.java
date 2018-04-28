package Servlets;

import Modelos.ListaParticipantes;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Rian Alves
 */
@WebServlet(name = "ParticipanteServlet", urlPatterns = {"/listaParticipantes.html"})
public class ParticipanteServlet extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if("/listaParticipantes.html".equals(request.getServletPath()))
        {  
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/listar-participantes.jsp");
            despachante.forward(request, response);
        }
}
}