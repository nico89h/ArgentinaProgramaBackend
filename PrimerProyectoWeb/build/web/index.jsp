<%-- 
    Document   : index
    Created on : 15 ago. 2022, 15:36:38
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Inicio de la creacion de un formulario</h1>
        <form method="post" action="SvPersonas">
            <label for="nombre">Nombre</label>
            <input type="text" name="nombre" id="nombre">
            <label for="apellido">Nombre</label>
            <input type="text" name="apellido" id="apellido">
            <label for="DNI">DNI</label>
            <input type="text" name="DNI" id="DNI">
            <label for="telefono">telefono</label>
            <input type="text" name="telefono" id="telefono">
            <button type="submit">Enviar</button>
        </form>
        <h2>Ver lista de personas</h2>
        <form method="Get" action="SvPersonas">
            <label>Presione el boton para ver la lista de personas</label>
            <input type="submit" name="ver" value="ver">
        </form>
        <h2>Eliminar a una persona</h2>
        <form method="post" action="ServletEliminar">
            <label for="idEliminar">DNI de la persona a Eliminar</label>
            <input type="text" name="idEliminar" id="idEliminar">
            <input type="submit" name="Eliminar" value="Eliminar">
        </form>
    </body>
</html>
