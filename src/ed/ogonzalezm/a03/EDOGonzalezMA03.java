/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a03;
import java.util.*;
/**
 *
 * @author HONORIO ZAIBACK
 */
public class EDOGonzalezMA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Secuencial os = new Secuencial();
        os.setV(os.RandomV(10));
        os.showF(os.Fetch(20));
        os.showV();
    }
    
}
