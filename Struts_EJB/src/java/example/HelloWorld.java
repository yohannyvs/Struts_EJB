/*
 * $Id: HelloWorld.template,v 1.2 2008-03-27 05:47:21 ub3rsold4t Exp $
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package example;


import Bean.Alumno;
import Session.AlumnoFacade;
import com.opensymphony.xwork2.ActionSupport;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * <code>Set welcome message.</code>
 */
public class HelloWorld extends ActionSupport {
    AlumnoFacade alumnoFacade = lookupAlumnoFacadeBean();
    List<Alumno> lista;
    private Alumno alumnito;
    private int id;
    private String Apellido;
    private String Nombre;

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Alumno getAlumnito() {
        return alumnito;
    }

    public void setAlumnito(Alumno alumnito) {
        this.alumnito = alumnito;
    }
  
    public List<Alumno> getLista() {
        return lista;
    }

    public void setLista(List<Alumno> lista) {
        this.lista = lista;
    }
    public String lista()
    {
         setMessage(getText(MESSAGE));
          System.out.println("ENTROOOOOOOOOOO"); 
           lista = new ArrayList<Alumno>();
           lista = alumnoFacade.findAll();
           setLista(lista);
         System.out.println("ENTROOOOOOOOOOO1111");
        return SUCCESS;
    }
     
    public static final String MESSAGE = "HelloWorld.message";

 
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
public String Mostrar()
{    
    print("IDDDD= "+getId());
    Alumno alumno =  alumnoFacade.find(getId());
    setAlumnito(alumno);
    return SUCCESS;
}
public void print(String msj)
{
    System.out.println(msj);
}
public String Insertar()
{    
    try
    {
        if(getNombre().equals(null)||getNombre().equals(""))
        {
           return SUCCESS; 
        }
    }
    catch(Exception e)
    {
        return SUCCESS;
    }
    Alumno a = new Alumno();
    a.setNombre(getNombre());
    a.setApellido(getApellido());
    alumnoFacade.create(a);   
    return "inserto";
}
public String Editar()
{

   Alumno alumno = alumnoFacade.find(getId());
   print("NOMBRE= "+getNombre()+" APELLIDO"+getApellido());
   alumno.setNombre(getNombre());
   alumno.setApellido(getApellido());
   alumnoFacade.edit(alumno);
   List<Alumno> listaa = alumnoFacade.findAll();
   setLista(listaa);
   return SUCCESS;
}
public String Eliminar()
{
   Alumno alumno = alumnoFacade.find(getId());
   alumnoFacade.remove(alumno);
   List<Alumno> listaa =alumnoFacade.findAll();
   setLista(listaa);


   return SUCCESS;
}
    private AlumnoFacade lookupAlumnoFacadeBean() {
        try {
            Context c = new InitialContext();
            return (AlumnoFacade) c.lookup("java:global/StrutsEjb/AlumnoFacade!Session.AlumnoFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
}

