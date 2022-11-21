/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasadt;

import java.util.ArrayList;

/**
 *
 * @author Anahi
 */
public class Cola <T>{
    
    ArrayList<T> datos = new ArrayList<>();

    public boolean estaVacia(){
        return datos.size() == 0;
    }
    
    public int getLongitud(){
        return datos.size();
    }
    
    public void enqueue(T dato){
        datos.add(dato);
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
