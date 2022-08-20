<%@page import="java.util.List"%>
<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Los datos son: </h1>
        <%
            List<Persona> clientes= (List) request.getSession().getAttribute("listaPersonas");
            
            for (Persona aux : clientes){
        %>
                <p>Nombre: <%=aux.getNombre()%></p>
                <p>Apellido: <%=aux.getApellido()%></p>
                <p>DNI: <%=aux.getDni()%></p>
                <p>Telefono: <%=aux.getTelefono()%></p>
                <p>----------------</p>
            <%}%>
            
    </body>
</html>
