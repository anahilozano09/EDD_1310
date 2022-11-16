/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilaadt;

/**
 *
 * @author Anahi
 */
public class PilaADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila <String>  pila = new Pila<>();
        pila.push("Angela");
        pila.push("Diego");
        pila.push("Juan");
        System.out.println(pila);
        pila.push("Diana");
        System.out.println(pila);
        String sacado = pila.pop();
        System.out.println(pila);
        System.out.println("Sacamos: " + sacado);
        System.out.println("Tope: " + pila.peek());
    }
    
}
