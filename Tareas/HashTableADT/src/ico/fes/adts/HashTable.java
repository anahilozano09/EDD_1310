/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.adts;

import java.util.ArrayList;

/**
 *
 * @author Anahi
 */
public class HashTable<T> {

    int tamanio;
    ArrayList<ArrayList<T>> tabla;
    ArrayList<T> datos;

    public HashTable(int tableSize) {
        this.tamanio = tableSize;
        tabla = new ArrayList();
        for (int i = 0; i < this.tamanio; i++) {
            tabla.add(null);
        }
    }

    public void add(int key, T value) {

        int index = key % tamanio;

        datos = new ArrayList();

        ArrayList<T> aux = datos;

        T auxValue = value;

        if (tabla.get(index) == null) {
            datos.add(value);
            tabla.remove(index);
            tabla.add(index, datos);
        } else {

            //aux se va a igualar al valor que tenga el arraylist que esta en la posicion index de la tabla
            aux = tabla.get(index);

            //se va a agregar value en el arraylist aux
            aux.add(auxValue);

        }

    }

    public ArrayList<T> valueOf(int key) {

        int index = key % tamanio;
        return tabla.get(index);

    }

    public ArrayList<T> remove(int key) {
        int index = key % tamanio;
        ArrayList<T> aux = tabla.set(index, null);

        //este for solo elimina los datos que estan en datos, pero uno por uno
//        for (int i = 0; i < aux.size(); i++) {
//            aux.set(i, null);
//            
//        }
        return aux;

    }

    @Override
    public String toString() {
        String estado = "";

        for (ArrayList<T> arrayList : tabla) {
            estado += arrayList + " ";
        }

        return estado;
    }

}
