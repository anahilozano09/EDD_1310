/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasearreglo;

/**
 *
 * @author Anahi
 */
public class ClaseArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Arreglo celulares = new Arreglo(5);
        System.out.println("Tamaño del arreglo: " + celulares.getLenght());
        Celular a1 = new Celular("Xiaomi", "Redmi 9", 6.53f, 64);
        System.out.println(a1);     
    }
    
}
