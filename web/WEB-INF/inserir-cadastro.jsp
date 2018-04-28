<%-- 
    Document   : inserir-cadastro
    Created on : 27/04/2018, 21:11:49
    Author     : Rian Alves
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="/WEB-INF/jspf/bootstrap.jspf" %>
        <title>Comunidade Global - Projeto Buddy</title>
    </head>
    <body>
        <h1>Projeto Buddy</h1>
        <h3>Insira seus dados e os dados do local de sua moradia :  </h3>
        
        <form method="post">
            
            <label>Nome: <input name="nome"/></label>
            <label>E-mail: <input name="email"/></label>
            <label>Celular: <input name="celular"/></label><br/><br/>
            <label>Endereço: <input name="endereco"/></label> 
            <label>Bairro: <input name="bairro"/></label><br/>
                  
            <label>Categoria na UFJF: <input name="categoria"/></label>
            <label>Disponibilidade de Tempo: <input name="datainicio"/> <input name="datafim"/></label><br/><br/>
           
            <input type="submit"/>
            <input type="reset"/>
            
        </form>
        <center><div><a href="index.html">Voltar a Página Inicial </a></div></center>
    
        
    </body>
</html>
