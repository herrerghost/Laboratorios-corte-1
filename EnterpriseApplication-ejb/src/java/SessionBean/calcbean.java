/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author CORE-I7
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a+b);
    }
     public Integer sustration(int c, int d) {
        return (c-d);
    }
      public Integer multiplication(int e, int f) {
        return (e*f);
    }
       public Integer divition(int g, int h) {
        return (g/h);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
