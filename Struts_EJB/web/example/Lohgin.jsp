<%-- 
    Document   : Lohgin
    Created on : 12/05/2013, 09:55:14 PM
    Author     : Bryan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello World!</h1>
                <s:actionerror/>
        <s:form method="post" action="login">
            <s:textfield name="username" label="USUARIO"/>
            <s:password name="password" label="PASSWORD"/>
            <s:submit value="Login"/>                       
        </s:form>
    </body>
</html>
