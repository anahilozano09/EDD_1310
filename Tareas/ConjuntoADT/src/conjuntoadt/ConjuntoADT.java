/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjuntoadt;

/**
 *
 * @author Anahi
 */
public class ConjuntoADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Probando el ADT
        
        Conjunto<Integer> listaNum = new Conjunto();
        
        //Probando el metodo agregar
        
        listaNum.agregar(5);
        listaNum.agregar(8);
        listaNum.agregar(15);
        System.out.println("Conjunto listaNum: " +listaNum);
        listaNum.agregar(85);
        System.out.println("Conjunto listaNum: " + listaNum);
        
        //Probando el metodo eliminar
        listaNum.eliminar(85);
        System.out.println("Conjunto listaNum: " + listaNum);
        
        //Probando el metodo contiene
        
        System.out.println("listaNum contiene 8? " + listaNum.contiene(8));
        
        //Probando el metodo getLongitud
        
        System.out.println("Longitud del conjunto: " + listaNum.getLongitud());
        
        //Probando equals
        System.out.println("");
        Conjunto<Integer> listaNum2 = new Conjunto();
        listaNum2.agregar(5);
        listaNum2.agregar(8);
        listaNum2.agregar(15);
        System.out.println("Conjunto listaNum2: " +listaNum2);
        System.out.println("listaNum2 es igual a listaNum? " + listaNum2.equals(listaNum));
        
        //Probando esSubConjunto
        System.out.println("");
        Conjunto <Integer> listaNum3 = new Conjunto();
        listaNum3.agregar(9);
        listaNum3.agregar(15);
        listaNum3.agregar(47);
        listaNum3.agregar(8);
        listaNum3.agregar(5);
        listaNum3.agregar(87);
        System.out.println("listaNum2 es subconjunto de listaNum3? " + listaNum2.esSubConjunto(listaNum3));
        System.out.println("listaNum3 es subconjunto de listaNum2? " +listaNum3.esSubConjunto(listaNum2));
        
        //Probando union
        System.out.println("");
        Conjunto <Integer> listaNum4 = new Conjunto();
        listaNum4.agregar(52);
        listaNum4.agregar(65);
        listaNum4.agregar(10);
        listaNum4.agregar(9);
        listaNum4.agregar(7);
        System.out.println("La union de listaNum y listaNum4 es:");
        listaNum.union(listaNum4);
        System.out.println(listaNum);
        
        //Probando Interseccion
        System.out.println("");
        System.out.println("La interseccion de listaNum2 y listaNum3 es: ");
        System.out.println(listaNum2.interseccion(listaNum3));
        
        //Probando Diferencia
        System.out.println("");
        Conjunto <Integer> listaNum5 = new Conjunto();
        listaNum5.agregar(8);
        listaNum5.agregar(16);
        listaNum5.agregar(9);
        listaNum5.agregar(84);
        listaNum5.agregar(65);
        System.out.println("La diferencia de listaNum5 y listaNum4 es: ");
        System.out.println(listaNum5.diferencia(listaNum4));
    }
    
}
