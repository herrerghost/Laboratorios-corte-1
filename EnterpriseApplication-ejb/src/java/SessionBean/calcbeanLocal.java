/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author CORE-I7
 */
@Local
public interface calcbeanLocal {

    Integer addition(int a, int b);
    Integer sustration(int c, int d);
    Integer multiplication(int e, int f);
    Integer divition(int g, int h);
}
