/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasadt;

/**
 *
 * @author Anahi
 */
public class ColasADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cola<Integer> lista = new Cola<>();
        //probando estaVacia
        System.out.println("La lista esta vacia? " + lista.estaVacia());
        System.out.println("");
        //agregando elementos a la cola
        lista.enqueue(46);
        lista.enqueue(34);
        lista.enqueue(9);
        lista.enqueue(27);
        lista.enqueue(18);
        lista.enqueue(51);
        System.out.println(lista);
        System.out.println("");
        //volviendo a probar estaVacia
        System.out.println("La lista sigue estando vacia? " + lista.estaVacia());
        System.out.println("");
        //probando enqueue
        lista.enqueue(15);
        System.out.println(lista);
        System.out.println("");
        //probando dequeue
        lista.dequeue();
        System.out.println(lista);
        System.out.println("");
        lista.dequeue();
        System.out.println(lista);
        System.out.println("");
        //probando getLongitud
        System.out.println("La longitud de la lista es: " + lista.getLongitud());
        
        
    }
    
}
