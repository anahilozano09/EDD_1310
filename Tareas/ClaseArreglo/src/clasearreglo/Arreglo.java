/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasearreglo;

/**
 *
 * @author Anahi
 */
public class Arreglo {
    
    int tamano;
    int index;
    int index2;
    String valor1;
    String valor2;

    public Arreglo() {
    }

    public Arreglo(int tamano) {
        this.tamano = tamano;
        
        for (int i = 0; i < tamano ; i++) {
            
        }
        
    }
    
    public void setElemento(int index, String valor) {
        
        for (int j = 0; j < tamano; j++) {
            if ( j == index ){
                System.out.println(valor);
            }
        }
        
    }
    
    public void getElemento(int index2) {
        
        
        
    }
    
    public int getLenght() {
        
        return tamano;
        
    }
    
    public void limpiar (String valor2) {
        this.valor2 = valor2;
        
        
    }
    
}
