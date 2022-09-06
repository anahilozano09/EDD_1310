/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.clases;

import adts.Arreglo;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Anahi
 */
public class NominaADT {
    
    String nombreEmpresa;
    Arreglo<Empleado> nomina;
    String rutaArchivo;

    public NominaADT(String ruta) {
        
        this.rutaArchivo = ruta;
        
        try {
            
            BufferedReader archivo = new BufferedReader(new FileReader(ruta));
            String fila = archivo.readLine();
            int contador = 0;
            
            while(fila != null){
                String datos[] = fila.split(",");
                System.out.println(fila);
                fila = archivo.readLine();
                contador++;
            }
            
            
            
            
        } 
        
        catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } 
        catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        
    }
    
    /*
    
    public void calcularSueldos(){
        for (int i = 0; i < arreglo.getTamanio(); i++) {
            System.out.print(empleados.getElemento().calcularSueldo());
        }
    }
    
    public void obtener_max_min(){
        
        int min = 29999999;
        int max = 0;
        Empleado  empMax;
        Empleado  empMin;
        
        for (Empleado e : empleados) {
            if(e.getAnioIngreso()>max){
                max = e.getAnioIngreso();
                empMax = e;
            }
            
            if(e.getAnioIngreso()<min){
                min = e.getAnioIngreso();
                empMin = e;
            }
        }
        
    }
    
    */
}
