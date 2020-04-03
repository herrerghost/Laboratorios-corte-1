<%-- 
    Document   : index
    Created on : 2/04/2020, 09:19:42 AM
    Author     : camila
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Hello World!</h1>
        <form name="Name Input Form" action="response.jsp">
            Nombre:
            <input type="text" name="name" />
            Año actual:
            <input type="text" name="año" />
            Año de ingreso:
            <input type="text" name="semestreIngreso" />
            Semestre ¿1 o 2?:
            <input type="text" name="semestreIng" />
            Año de nacimiento:
            <input type="text" name="añoNacimiento" />
            
            <input type="submit" value="OK" />
            
        </form>
        
        <% String añot;
           añot = request.getParameter("año");
           int año = Integer.parseInt(añot);
           
           String añoNT = request.getParameter("añoNacimiento");
           int añoN = Integer.parseInt(añoNT);
           
           String semIT = request.getParameter("semestreIngreso");
           int semI = Integer.parseInt(semIT);
           
           String semITt = request.getParameter("sementreIng");
           int semA = 0;
           if(semITt.equals("1")){
            semA = (año - semI)*2 + 1 ;}
           if(semITt.equals("2")){
            semA = (año - semI)*2;  }
           
                   
           int edad = año - añoN;
           request.setAttribute("edad", edad);
           request.setAttribute("semA", semA);
           
           
           
        %>
    </body>
</html>
        