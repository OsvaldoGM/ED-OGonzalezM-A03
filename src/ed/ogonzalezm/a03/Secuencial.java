/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ogonzalezm.a03;

/**
 *
 * @author HONORIO ZAIBACK
 */
public class Secuencial extends FetchClass{

    @Override
    int Fetch(int n) {
        for(int i=0; i<vector.length; i++){
            if(vector[i] == n)//Compara el valor del vector con el valor del numnero que se busca
                return i;
        }
        return -1;//Se regresa esto solo si el numero no se encuentra dentro del arreglo
    }
    
}
