
package Servlets;

import Modelos.ListaParticipantes;
import Modelos.Participante;
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
@WebServlet(name = "Comunidade", urlPatterns = {"/participante.html"})
public class Comunidade extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/inserir-cadastro.jsp");
        despachante.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String nome = request.getParameter("nome");
            String endereco = request.getParameter("endereco");
            String bairro = request.getParameter("bairro");
            String email = request.getParameter("email");
            String celular = request.getParameter("celular");
            String dataInicio = request.getParameter("datainicio");
            String dataFim = request.getParameter("datafim");
            String categoria = request.getParameter("categoria");
            Participante novoParticipante = new Participante(nome, endereco, bairro, email,celular,dataInicio,dataFim, categoria);
            ListaParticipantes.inicializarLista().add(novoParticipante);
            response.sendRedirect("mensagem.html");
    }
 
}
