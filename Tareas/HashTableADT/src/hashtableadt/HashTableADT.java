/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashtableadt;
import ico.fes.adts.HashTable;

/**
 *
 * @author Anahi
 */
public class HashTableADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Probando el constructor");
        HashTable<String> lista = new HashTable(7);
        System.out.println(lista);
        
        System.out.println("Probando el metodo add");
        lista.add(10, "Jose");
        lista.add(3, "Maria");
        lista.add(35, "Matt");
        lista.add(54, "Fernanda");
        lista.add(89, "Luis");
        lista.add(27, "Marco");
        lista.add(71, "Cristian");
        lista.add(142, "Uriel");
        lista.add(46, "Angel");
        lista.add(214, "Isaac");
        lista.add(378, "Dom");
        lista.add(62, "Gerardo");
        lista.add(93, "Mario");
        lista.add(414, "Tom");
        System.out.println(lista);
        
        System.out.println("Probando el metodo valueOf");
        System.out.println("El valor de la llave 10 es: " + lista.valueOf(10));
        
        System.out.println("Probando el metodo remove");
        lista.remove(72);
        System.out.println(lista);
        
    }
    
}
