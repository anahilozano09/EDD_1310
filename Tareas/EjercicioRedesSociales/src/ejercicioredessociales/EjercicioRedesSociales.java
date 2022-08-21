/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioredessociales;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Anahi
 */
public class EjercicioRedesSociales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        
        File getCSVFiles = new File(System.getProperty("user.dir")+"\\src\\ejercicioredessociales\\presenciaredes.csv");
        Scanner sc = new Scanner(getCSVFiles);
        sc.useDelimiter(";");
        while(sc.hasNext())
        {
            System.out.println(sc.next());
        }
        
        sc.close();
        
    }
    
}
