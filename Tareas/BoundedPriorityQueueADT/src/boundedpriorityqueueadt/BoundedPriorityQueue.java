/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boundedpriorityqueueadt;

import java.util.ArrayList;

/**
 *
 * @author Anahi
 */
public class BoundedPriorityQueue <T>{
    ArrayList<T> datos;
    int priorityLevels;

    public BoundedPriorityQueue(int niveles) {
        this.priorityLevels = niveles;
        datos = new ArrayList();
        for (int i = 0; i <= this.priorityLevels; i++) {
            datos.add(null);
        }
    }
    
    public boolean estaVacia(){
        return datos.size() == 0;
    }
    
    public int getLongitud(){
        return datos.size();
    }
    
    public void enqueue(int prioridad, T dato){
        
        if(datos.get(prioridad) != null){
            datos.add(prioridad+1, dato);
        }
        else{
            datos.add(prioridad, dato);
        }

    }
    
    public T dequeue(){
        T sacado = datos.remove(0);
        return sacado;
    }
    
     @Override
    public String toString(){
        String estado = "";
        
        for (T dato : datos) {
            estado += dato + "<--";            
        }
        return estado;
        
    }
    
}
