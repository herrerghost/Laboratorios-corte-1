<%-- 
    Document   : response
    Created on : 2/04/2020, 09:30:34 AM
    Author     : camila
--%>




<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
         <jsp:setProperty name = "mybean" property = "name" />      
         <jsp:setProperty name = "mybean" property = "año" /> 
         <jsp:setProperty name = "mybean" property = "añoNacimiento" /> 
         <h3> Hola, <jsp:getProperty name = "mybean" property = "name" />! </h3> 
        
            
         <%
             out.println("");
             out.println("Tu edad es: " + request.getAttribute("edad"));
             out.println("Estas en: " + request.getAttribute("semA"));
             
         %>
</html>
