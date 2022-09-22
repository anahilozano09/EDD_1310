/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conjuntoadt;

import java.util.ArrayList;

/**
 *
 * @author Anahi
 */
public class Conjunto <T>{
    
    private ArrayList<T> datos = new ArrayList<>();
    
     public ArrayList<T> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<T> datos) {
        this.datos = datos;
    }
    
    public int getLongitud(){
        return datos.size();
    }
    
    public boolean contiene(T elemento){
        return this.datos.indexOf(elemento) != -1;
    }
    
    public void agregar(T dato){
        T agr = dato;
        if(this.datos.contains(agr)){
            
        }
        else{
            datos.add(agr);
        }
    }
    
    public void eliminar(T valor){
        T tmp = valor;
        if(this.datos.contains(tmp)){
            this.datos.remove(tmp);
        }
    }

    @Override
    public boolean equals(Object obj) {
        Conjunto<T> otroConjunto = (Conjunto)obj;
        return this.getDatos().equals(otroConjunto.getDatos());
    }
    
    
    
    public boolean esSubConjunto(Conjunto<T> otroConjunto){
        
        if(this.datos.size() > otroConjunto.getLongitud()){
            return false;
        }
        
        for (T dato : this.datos) {
            if(!otroConjunto.contiene(dato)){
                return false;
            }
        }
        
        return true;
        
    }
    
    public void union(Conjunto<T> otroConjunto){
        
        for (T elm : otroConjunto.datos) {
            this.agregar(elm);
        }
        
    }
    
    public Conjunto<T> interseccion(Conjunto<T> otroConjunto){
        Conjunto<T> almacenarConjunto = new Conjunto();
        for (T dato : this.datos) {
            if(otroConjunto.contiene(dato)){
                almacenarConjunto.agregar(dato);
            }
        }
        return almacenarConjunto;
    }
    
    public Conjunto<T> diferencia(Conjunto<T> otroConjunto){
        Conjunto<T> almacenarConjunto = new Conjunto();
        for (T dato : this.datos) {
            if(!otroConjunto.contiene(dato)){
                almacenarConjunto.agregar(dato);
            }
        }
        
        for (T dato : otroConjunto.datos) {
            if(!this.datos.contains(dato)){
                almacenarConjunto.agregar(dato);
            }
        }
        
        return almacenarConjunto;
    }

    @Override
    public String toString() {
        return datos.toString();
    }
      
}
