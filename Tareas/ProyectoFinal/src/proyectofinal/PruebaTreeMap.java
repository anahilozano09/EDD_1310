/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.util.TreeMap;

/**
 *
 * @author Anahi
 */
public class PruebaTreeMap {

    public static void main(String[] args) {
        //Declaramos un nuevo TreeMap
        TreeMap<Integer, String> videojuegos = new TreeMap<>();
        //Agregamos elementos a TreeMap con el metodo put
        videojuegos.put(1,"Super Mario World");
        videojuegos.put(5, "Pokemon Diamante");
        videojuegos.put(2, "Wii Sports");
        videojuegos.put(7, "Sonic Frontiers");
        videojuegos.put(4, "Splatoon 3");
        System.out.println(videojuegos);
        //Probamos el metodo get para acceder a los elementos de TreeMap
        System.out.println("Cual es el valor de la llave 4? " + videojuegos.get(4));
        //Reemplazamos el valor de una llave usando el metodo replace
        videojuegos.replace(5, "Luigi's Mansion");
        System.out.println(videojuegos);
        //Borramos un elemento de TreeMap
        videojuegos.remove(4);
        System.out.println(videojuegos);
        //Revisamos si ya existe una llave con el metodo containsKey
        System.out.println("Existe la llave 9? " + videojuegos.containsKey(9));
        System.out.println("Existe la llave 1? " + videojuegos.containsKey(1));
        //Revisamos si ya existe un valor con el metodo containsValue
        System.out.println("Existe el elemento Mario Kart? " + videojuegos.containsValue("Mario Kart"));
        System.out.println("Existe el elemento Wii Sports? " + videojuegos.containsValue("Wii Sports"));
        //Revisamos la cantidad de elementos de TreeMap con el metodo size
        System.out.println("Cuantos videojuegos hay en la lista? " + videojuegos.size());
        //Revisamos si TreeMap se encuentra vacio con el metodo isEmpty
        System.out.println("La lista de videojuegos esta vacia? " + videojuegos.isEmpty());
        //Vaciamos TreeMap con el metodo clear
        videojuegos.clear();
        System.out.println(videojuegos);
    }
}
