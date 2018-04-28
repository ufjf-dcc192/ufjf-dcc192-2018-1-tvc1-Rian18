<%-- 
    Document   : listar-participantes
    Created on : 27/04/2018, 21:45:45
    Author     : Rian Alves
--%>

<%@page import="Modelos.Participante"%>
<%@page import="Modelos.ListaParticipantes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Contatos para Hospedagem</title>
    </head>
    <body>
        <h2>Consulte aqui possíveis contatos para hospedagem</h2>
        <h2>Check here for possible hosting contacts</h2>
        <h2>Consulte aquí posibles contactos para alojamiento</h2>
        <table class="table table-hover">
            <thead>

                <tr class="table-primary">
                    <th>Nome</th>
                    <th>Categoria</th>
                    <th>Bairro</th>
                    <th>E-mail</th>
                    <th>Celular</th>
                    <th>Data Início Disponível</th>
                    <th>Data Fim Disponível</th>
                </tr>
            </thead>
            <tbody>
                <%for (int i=0; i<ListaParticipantes.inicializarLista().size();i++) {
                Participante participante = ListaParticipantes.inicializarLista().get(i);
                %>
                <tr>
                                      
                    <td><%=participante.getNome()%></td>
                    <td><%=participante.getCategoria()%></td>
                    <td><%=participante.getBairro()%></td>
                    <td><%=participante.getEmail()%></td>
                    <td><%=participante.getCelular()%></td>
                    <td><%=participante.getDataInicio()%></td>
                    <td><%=participante.getDataFim()%></td>
                    
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </body>
</html>
