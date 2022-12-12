/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.LinkedHashMap;

/**
 *
 * @author Anahi
 */
public class PruebaLinkedHashMap {
    public static void main(String[] args) {
        //Declaramos un nuevo LinkedHashMap
        LinkedHashMap <Integer, String> supermercado = new LinkedHashMap<>();
        //Agregamos elementos a LinkedHashMap con el metodo put
        supermercado.put(2, "Pan Integral");
        supermercado.put(8, "Queso");
        supermercado.put(4, "Azucar");
        supermercado.put(1, "Jamon");
        supermercado.put(3, "Catsup");
        System.out.println(supermercado);
        //Probando el metodo get para acceder a los elementos del LinkedHashMap
        System.out.println("Cual es el valor de la llave 8? " + supermercado.get(8));
        //Remplazamos el valor de una llave con el metodo replace
        supermercado.replace(3, "Mayonesa");
        System.out.println(supermercado);
        //Eliminamos un elemento de LinkedHashMap con el metodo remove
        supermercado.remove(4);
        System.out.println(supermercado);
        //Revisamos si ya existe una llave con el metodo containsKey
        System.out.println("Existe la llave 10? " + supermercado.containsKey(10));
        System.out.println("Existe la llave 8? " + supermercado.containsKey(8));
        //Revisamos si ya existe un valor con el metodo containsValue
        System.out.println("Existe el elemento Arroz? " + supermercado.containsValue("Arroz"));
        System.out.println("Existe el elemento Jamon? " + supermercado.containsValue("Jamon"));
        //Revisamos si LinkedHashMap esta vacia con el metodo isEmpty
        System.out.println("La lista de supermercado esta vacia? " + supermercado.isEmpty());
        //Obtenemos la cantidad de elementos con el metodo size
        System.out.println("Cuantos elementos tiene la lista de supermercado? " + supermercado.size());
        //Vaciamos el LinkedHashMap con el metodo clear
        supermercado.clear();
        System.out.println(supermercado);
    }
}
