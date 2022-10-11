/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.nodo;

/**
 *
 * @author Anahi
 */
public class Nodo <T>{
    
    T dato;
    Nodo<T> siguiente;

    public Nodo() {
    }
    
    public Nodo(T valor){
        this.dato = valor;
    }
    
    public Nodo(T dato, Nodo<T> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
    
    public T getDato(){
        return dato;
    }
    
    public void setDato(T dato){
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "|"+dato+"|-->";
    }
    
}
