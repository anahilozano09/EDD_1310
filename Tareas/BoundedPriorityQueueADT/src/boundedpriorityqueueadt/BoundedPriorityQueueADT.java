/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boundedpriorityqueueadt;

/**
 *
 * @author Anahi
 */
public class BoundedPriorityQueueADT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BoundedPriorityQueue<String> titanic = new BoundedPriorityQueue<>(6);
        System.out.println(titanic.getLongitud());
        System.out.println(titanic);
        titanic.enqueue(1, "Ninias");
        System.out.println(titanic.estaVacia());
        System.out.println(titanic);
        titanic.enqueue(2, "Ninios");
        System.out.println(titanic);
        titanic.enqueue(2, "3ra edad");
        System.out.println(titanic);
        titanic.enqueue(3, "Mujeres");
        System.out.println(titanic);
        titanic.enqueue(4, "Maestre");
        System.out.println(titanic);
        titanic.enqueue(5, "Capitan");
        System.out.println(titanic);
        titanic.enqueue(4, "Timonel");
        System.out.println(titanic);
        titanic.enqueue(4, "Mecanico");
        System.out.println(titanic);
        titanic.enqueue(4, "Vigia");
        System.out.println(titanic);
        titanic.enqueue(3, "Hombres");
        System.out.println(titanic);
        //probando dequeue
        titanic.dequeue();
        System.out.println(titanic);
        titanic.dequeue();
        System.out.println(titanic);
        titanic.dequeue();
        System.out.println(titanic);
    }

}
