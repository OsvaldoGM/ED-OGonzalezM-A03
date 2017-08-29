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
public class Binario extends FetchClass implements Ordenamientos{
    
   
    
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
    
    private void exchange(int i, int j) {
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }

    @Override
    public void seleccion() {
        int menor, auxiliar;
        for(int i=0; i<vector.length; i++){
            menor = i;
            for(int j=i+1; j<vector.length ; j++){
                  if(vector[j]<vector[menor]){
                    menor=j;
            }
            if(i != menor){
                exchange(i,j);
            }
            
        }
    }
   
  }

    @Override
    public void insercion() {
        int j, auxiliar;
        for(int i=1; i<vector.length ; i++){
            auxiliar = vector[i];
            j = i-1;
            while((j>=0) && (vector[j]>auxiliar)){
                vector[j+1] = vector[j];
                j--;
            }
            vector[j+1] = auxiliar;
        }
    }

    @Override
    public void bubble() {
         int i, j, aux;
         for(i=0;i<vector.length-1;i++)
              for(j=0;j<vector.length-i-1;j++)
                   if(vector[j+1]<vector[j]){
                    aux=vector[j+1];
                    vector[j+1]=vector[j];
                    vector[j]=aux;
                   }
    }

    @Override
    public void quickSort(int izquierda, int derecha) {

        int pivote = vector[izquierda]; 
        int i = izquierda; 
        int j = derecha; 
 
            while(i<j){             
            while(vector[i]<=pivote && i<j) 
                i++;
            while(vector[j]>pivote) 
                j--;         
                if (i<j) {                                            
                    exchange(i,j);
                }
            }
                vector[izquierda] = vector[j]; 
                vector[j] = pivote; 
            if(izquierda<j-1)
                quickSort(izquierda,j-1); 
            if(j+1 <derecha)
                quickSort(j+1,derecha); 
    }

    @Override
    public void mergeSort(int izquierda, int derecha) {
        if (izquierda < derecha) {
            int medio = izquierda + (izquierda - derecha) / 2;
            mergeSort(izquierda, medio);
            mergeSort(medio + 1, derecha);
            merge(izquierda, medio, derecha);
        }
    }
    
    public void merge(int izquierda, int medio, int derecha){
        int num = vector.length;
        int[] auxiliar = new int[num];
        
        for (int i = izquierda; i <= derecha; i++) {
            auxiliar[i] = vector[i];
        }

        int i = izquierda;
        int j = medio + 1;
        int k = derecha;
        while (i <= medio && j <= derecha) {
            if (auxiliar[i] <= auxiliar[j]) {
                vector[k] = auxiliar[i];
                i++;
            } else {
                vector[k] = auxiliar[j];
                j++;
            }
            k++;
        }
        while (i <= medio) {
            vector[k] = auxiliar[i];
            k++;
            i++;
        }
    }
    
}
