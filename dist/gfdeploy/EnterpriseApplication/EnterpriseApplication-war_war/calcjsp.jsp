<%-- 
    Document   : calcjsp
    Created on : mar 19, 2020, 5:52:22 p.m.
    Author     : CORE-I7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="calcservlet" method="POST">
            <h1>Segundo laboratorio, Calculadora </h1> 
         <input type="text" name="dato" value="" >
         <h1></h1>
         <br>
        
        
           <input type="button" value="1" OnClick="dato.value += '1'">
           <input type="button" value="2" OnClick="dato.value += '2'">
           <input type="button" value="3" OnClick="dato.value += '3'">
           <input type="button" value="+" OnClick="dato.value += '+'">
           <br>
           <h1></h1>
               
           <input type="button" value="4" OnClick="dato.value += '4'">
           <input type="button" value="5" OnClick="dato.value += '5'">
           <input type="button" value="6" OnClick="dato.value += '6'">
           <input type="button" value="-" OnClick="dato.value += '-'">
           <br>
            <h1></h1>
               
           <input type="button" value="7" OnClick="dato.value += '7'">
           <input type="button" value="8" OnClick="dato.value += '8'">
           <input type="button" value="9" OnClick="dato.value += '9'">
           <input type="button" value="/" OnClick="dato.value += '/'">
           <br>
            <h1></h1>
               
           <input type="button" value="0" OnClick="dato.value += '0'">
           <input type="button" value="." OnClick="dato.value += '.'">
           <input type="button" value="=" OnClick="dato.value = eval(dato.value)">
           <input type="button" value="*" OnClick="dato.value += '*' ">
           
        </form>
    </body>
</html>
