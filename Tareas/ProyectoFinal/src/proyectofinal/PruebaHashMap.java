/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.HashMap;

/**
 *
 * @author Anahi
 */
public class PruebaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos un nuevo HashMap
        HashMap<Integer, String> equipo = new HashMap<>();
        //Agregamos elementos al HashMap con put
        equipo.put(12, "Mariscal de campo");
        equipo.put(28, "Liniero ofensivo");
        equipo.put(35, "Corredor");
        equipo.put(49, "Ala cerrada");
        equipo.put(51, "Receptor abierto");
        System.out.println(equipo);
        //Probando el metodo get para acceder a los elementos del HashMap
        System.out.println("El valor de la llave 35 es: " + equipo.get(35));
        //Remplazamos el valor de una llave con el metodo replace
        equipo.replace(35, "Corredor de poder");
        System.out.println(equipo);
        //Eliminamos un elemento de HashMap usando el metodo remove
        equipo.remove(49);
        System.out.println(equipo);
        //Revisamos si ya existe una llave con el metodo containsKey
        System.out.println("Existe la llave 84? " + equipo.containsKey(84));
        System.out.println("Existe la llave 12? " + equipo.containsKey(12));
        //Revisamos si ya existe un valor con el metodo containsValue
        System.out.println("Existe un pateador en el equipo? " + equipo.containsValue("Pateador"));
        System.out.println("Existe un mariscal de campo en el equipo? " + equipo.containsValue("Mariscal de campo"));
        //Revisamos si no hay elementos en el HashMap con el metodo isEmpty
        System.out.println("El equipo no tiene jugadores? " + equipo.isEmpty());
        //Revisamos la cantidad de elementos con el metodo size
        System.out.println("Cuantos jugadores hay en el equipo? " + equipo.size());    
        //Vaciamos el HashMap con el metodo clear
        equipo.clear();
        System.out.println(equipo);
    }  
}
