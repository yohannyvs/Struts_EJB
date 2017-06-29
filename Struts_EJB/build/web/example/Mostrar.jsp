<%-- 
    Document   : Mostrar
    Created on : 13/05/2013, 01:10:09 AM
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola Alumno! </h1>
        <s:form method="post" action="Editar">
           
            <s:textfield name="id" label="Id Usuario" readonly="true" value="%{alumnito.Id}"/> 
            <s:textfield name="Nombre" label="Nombre Usuario" value="%{alumnito.Nombre}"/> 
            <s:textfield name="Apellido" label="Apellido Usuario" value="%{alumnito.Apellido}"/>
           
            <s:submit value="Editar"/>                       
        </s:form>
    </body>
</html>
