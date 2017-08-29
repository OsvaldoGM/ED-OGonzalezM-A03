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
public interface Ordenamientos {
    
    public abstract void seleccion();
    
    public abstract void insercion();
    
    public abstract void bubble();
    
    public abstract void quickSort(int izquierda, int derecha);
    
    public abstract void mergeSort(int izquierda, int derecha);
}
