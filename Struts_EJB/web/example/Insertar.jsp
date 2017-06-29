<%-- 
    Document   : Insertar
    Created on : 13/05/2013, 02:32:32 PM
    Author     : Bryan
--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Insertar Usuario!</h1>
        <s:form method="post" action="Insertar">                       
            <s:textfield name="Nombre" label="Nombre Usuario"/> 
            <s:textfield name="Apellido" label="Apellido Usuario"/>           
            <s:submit value="Insertar"/>                       
        </s:form>
    </body>
</html>
