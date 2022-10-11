/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listassimplementeligadasadt;

import ico.fes.adts.ListaSimplementeLigadaADT;
import ico.fes.nodo.Nodo;

/**
 *
 * @author Anahi
 */
public class ListasSimplementeLigadasADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Probando la lista con el constructor sobrecargado
        System.out.println("--------------- Probando el constructor sobrecargado ----------------");
        ListaSimplementeLigadaADT <Integer> lista1 = new ListaSimplementeLigadaADT(5, new Nodo(45,new Nodo(21, null)));
        lista1.transversal();
        System.out.println("");
        
        //probando el agregarFinal
        System.out.println("--------------- Probando el metodo agregarAlFinal ----------------");
        lista1.agregarAlFinal(93);
        lista1.transversal();
        System.out.println("");
        
        //Probando getTamanio
        System.out.println("--------------- Probando el metodo getTamanio ----------------");
        System.out.println("Tamaño de la lista: " + lista1.getTamanio());
        
        //probando estaVacia
        System.out.println("--------------- Probando el metodo estaVacia ----------------");
        System.out.println("La lista1 esta vacia? " + lista1.estaVacia());
        
        //probando agregarAlInicio
        System.out.println("--------------- Probando el metodo agregarAlInicio ----------------");
        lista1.agregarAlInicio(71);
        lista1.agregarAlInicio(52);
        lista1.transversal();
        System.out.println("");
        
        //probando eliminarElFinal
        System.out.println("--------------- Probando el metodo eliminarElFinal ----------------");
        lista1.eliminarElFinal();
        lista1.transversal();
        System.out.println("");

        //probando eliminarElInicio
        System.out.println("--------------- Probando el metodo eliminarElInicio ----------------");
        lista1.eliminarElPrimero();
        lista1.transversal();
        System.out.println("");
        
        //probando eliminar
        System.out.println("--------------- Probando el metodo eliminar ----------------");
        lista1.eliminar(3);
        lista1.transversal();
        System.out.println("");
        
        //probando agregarDespuesDe
        System.out.println("--------------- Probando el metodo agregarDespuesDe ----------------");
        lista1.agregarDespuesDe(45, 38);
        lista1.transversal();
        System.out.println("");
        
        //probando buscar
        System.out.println("--------------- Probando el metodo buscar ----------------");
        System.out.println("Posicion del numero 21: ");
        lista1.buscar(21);
        
        //probando actualizar
        System.out.println("--------------- Probando el metodo actualizar ----------------");
        lista1.actualizar(21, 8);
        lista1.transversal();
        System.out.println("");
        
    }
    
}
