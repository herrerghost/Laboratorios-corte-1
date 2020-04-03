 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.beans.Transient;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author camila
 */
public class NameHandler {
    
String name;

String año;
String semestreIngreso;
String añoNacimiento;


    public NameHandler() {
        
        name = null;
        año = null;
        semestreIngreso = null;
        añoNacimiento = null;
        
        
        
    }

  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getSemestreIngreso() {
        return semestreIngreso;
    }

    public void setSemestreIngreso(String semestreIngreso) {
        this.semestreIngreso = semestreIngreso;
    }
   public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
  

   
       
        
     public String getAñoNacimiento() {
        return añoNacimiento;
    }

    
    



}
