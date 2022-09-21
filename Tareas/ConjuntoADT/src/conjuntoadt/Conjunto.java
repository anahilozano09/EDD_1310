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
    
    ArrayList<T> datos;
    
    public int getLongitud(){
        return datos.size();
    }
    
    public void contiene(T elemento){
        T elm = elemento;
        if(this.datos.contains(elm)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
    public void agregar(T dato){
        T agr = dato;
        if(this.datos.contains(agr)){
            System.out.println("No se puede agregar un elemento que ya existe");
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
        else{
            System.out.println("El elemento a eliminar no existe");
        }
    }
    
    public void equals(Conjunto<T> otroConjunto){
        
        
    }
    
    public void esSubConjunto(Conjunto<T> otroConjunto){
        
    }
    
    public void union(Conjunto<T> otroConjunto){
        
    }
    
    public void interseccion(Conjunto<T> otroConjunto){
        
    }
    
    public void diferencia(Conjunto<T> otroConjunto){
        
    }

    @Override
    public String toString() {
        return "Conjunto{" + "datos=" + datos + '}';
    }
    
    
    
}
