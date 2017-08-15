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
public class Binario extends FetchClass{
    
    @Override
    public int Fetch(int num){ 
    int n = vector.length;
  
    int centro, inicio=0, fin=n-1; //Quise poner final pero ya es una funcion de JAVA 
   
    
    while(inicio <= fin){ 
        
     centro=(inicio + fin) / 2; 
     
     if(vector[centro] == num) //En cuanto el numero se encuentre en el centro se saldra del programa
        return centro; 
     
     if(num < vector [centro] ){ 
        fin = centro - 1;   //Si se encuentra de ese lado el final se pondra lado del centro
     }else{
       inicio = centro + 1; //Igualmente para el inicio
     }
     
   }
   return -1;
 
 }
 
    
}
