/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilaadt;

import java.util.ArrayList;

/**
 *
 * @author Anahi
 */
public class Pila <T>{
    
    ArrayList<T> datos = new ArrayList<>();
    int tope;
    
    public boolean estaVacia(){
        return datos.size() == 0;
    }
    
    public int getLongitud(){
        return datos.size();
    }
    
    public T pop(){
        T sacado = datos.remove(tope);
        tope--;
        return sacado;
    }
    
    public T peek(){
        T ultimo = datos.get(this.tope);
        return ultimo;
    }
    
    public void push(T dato){
        datos.add(dato);
        tope = datos.size()-1;
    }
    
    @Override
    public String toString(){
        String estado = "";
        
        for (T dato : datos) {
            estado += dato + "\n";            
        }
        return estado;
        
    }
    
}
