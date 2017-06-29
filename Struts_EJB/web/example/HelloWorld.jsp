<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title><s:text name="HelloWorld.message"/></title>
    </head>

    <body>
        <h2><s:property value="message"/></h2>

        <h3>Alumnos</h3>
        <ul>
            <li>                
                <table >
                <s:iterator value="lista" >
                    <tr>
                        <td>
                            <s:property value="Id"/> 
                            &nbsp
                            <s:property value="Nombre"/> 
                            &nbsp;
                            <s:property value="Apellido"/>
                            &nbsp;
                            <s:url id="url" action="Mostrar">
                                <s:param name="id"><s:property value="Id"/></s:param>
                            </s:url>
                            <s:a href="%{url}">Editar</s:a>
                            &nbsp;
                            <s:url id="url" action="Eliminar">
                                <s:param name="id"><s:property value="Id"/></s:param>
                            </s:url>
                            <s:a href="%{url}">Eliminar</s:a>
                        </td>                       
                    </tr>
                </s:iterator>
            </table>   
            </li>  
            <li>
                <s:url id="url" action="Insertar"/>
                    
                <s:a href="%{url}">Insertar</s:a>
            </li>
        </ul>
    </body>
</html>

