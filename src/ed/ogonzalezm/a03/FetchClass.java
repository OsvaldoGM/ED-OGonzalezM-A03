/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a03;
import java.util.Random;
/**
 *
 * @author HONORIO ZAIBACK
 */
public abstract class FetchClass {
    int[] vector;
    
    abstract int Fetch(int n);
    
    public int[] RandomV(int n){
        int[] vector = new int[n];
        Random rnd = new Random();
        for(int i=0 ; i<vector.length ; i++){
            vector[i] = rnd.nextInt();
        }
        return vector;
    }

    public void setV(int[] v){
        this.vector = v;
    }
    
    public int[] getV(){
        return this.vector;
    }
    
    public void showV(){
        for(int i=0; i<vector.length; i++){
            System.out.print("[" +vector[i] +"]");
        }
    }
    
    public void showF(int n){
        System.out.println("El numero esta en la posicion: " +n);
    }
}
