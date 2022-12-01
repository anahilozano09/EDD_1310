/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.adts;

import ico.fes.nodo.Nodo;

/**
 *
 * @author Anahi
 */
public class ListaSimplementeLigadaADT <T>{
    
    Nodo<T> head;
    int tamanio = 0;

    public ListaSimplementeLigadaADT() {
        this.head = null;
    }
    
    public ListaSimplementeLigadaADT(T valor){
        head = new Nodo(valor);
    }
    
    public ListaSimplementeLigadaADT(T valor, Nodo<T> siguiente){
        head = new Nodo(valor, siguiente);
    }
    
    public boolean estaVacia(){
        return head == null;
    } 
    
    public int getTamanio(){
        Nodo<T> aux = head;
        
        while(aux != null){
            aux = aux.getSiguiente();
            tamanio++;
        }
        
        return tamanio;
    }
    
    public void agregarAlFinal(T valor){
        
        if(head == null){           
            head = new Nodo<>(valor);           
        }
        else {
            Nodo <T> nuevo = new Nodo<>(valor);
            Nodo <T> aux = head;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        
    }
    
    public void agregarAlInicio(T valor){
        
        if(head == null){
            head = new Nodo<>(valor);
        }
        else {
            Nodo<T> nuevo = new Nodo<>(valor);
            nuevo.setSiguiente(head);
            head = nuevo;
        }
        
    }
    
    public void agregarDespuesDe(T referencia, T valor){
        
        if(head == null){
            head = new Nodo<>(valor);
        }
        else{
            Nodo <T> aux = head;
            while(aux.getSiguiente() != null && aux.getDato() != referencia){
                aux = aux.getSiguiente();
            }
            
            Nodo <T> nuevo = new Nodo<>(valor, aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
        
    }
    
    public void eliminar(int posicion){
        
       if(head == null){
           System.out.println("No se puede eliminar algo que no existe");
       }
       
       else{
           Nodo <T> aux = head;
           Nodo <T> eliminar = null;
           int contador = 1;
           
           while(aux.getSiguiente() !=null && contador < posicion){
               eliminar = aux;
               aux = aux.getSiguiente();
               contador++;
           }
           
           eliminar.setSiguiente(aux.getSiguiente());
           
       }
        
    }
    
    public void eliminarElPrimero(){
        
        if(head == null){
            System.out.println("No se puede eliminar algo que no existe");
        }
        else{
            head = head.getSiguiente();
        }
        
    }
    
    public void eliminarElFinal(){
        
       if(head == null){
            System.out.println("No se puede eliminar algo que no existe");
        }
       else{
           Nodo <T> aux = head;
           Nodo <T> eliminar = null;
           
           while(aux.getSiguiente() !=null){
               eliminar = aux;
               aux = aux.getSiguiente();
           }
           
           eliminar.setSiguiente(null);
       }
        
    }
    
    public void buscar(T valor){
        
        Nodo <T> aux = head;
        int contador = 1;
        
        while(aux != null){
            if(aux.getDato() == valor){
                break;
            }
            else{
                aux = aux.getSiguiente();
                contador++;
            }
        }
        
        System.out.println(contador);
        
    }
    
    public void actualizar(T a_buscar, T valor){
      
        if(head == null){
            System.out.println("No se puede actualizar algo que no existe");
        }       
        else{
            Nodo <T> aux = head;
            while(aux != null && aux.getDato() != a_buscar){
                aux = aux.getSiguiente();
            }
            
            aux.setDato(valor);
        }
        
    }

    public void transversal() {
        Nodo<T> aux = head;
        while(aux != null){
            System.out.print(aux);
            aux = aux.getSiguiente();
        }
        
    }
    
    
}
