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
            archivo.readLine();
            String fila = null;
            
            
            while((fila = archivo.readLine()) != null){
                String[] campos = fila.split(",");
                Empleado emp = new Empleado();
                
                emp.setId(Integer.parseInt(campos[0]));
                emp.setNombre(campos[1]);
                emp.setPaterrno(campos[2]);
                emp.setMaterno(campos[3]);
                emp.setHorasExtra(Integer.parseInt(campos[4]));
                emp.setSueldoBase(Integer.parseInt(campos[5]));
                emp.setAnioIngreso(Integer.parseInt(campos[6]));
                
                System.out.println(emp);
                System.out.println("Sueldo Total = " + emp.calcularSueldo());
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
        public void obtener_max_min(){
        
        int min = 29999999;
        int max = 0;
        Empleado  empMax;
        Empleado  empMin;
        
        for (Empleado e : contador) {
            if(e.getAnioIngreso()>max){
                max = e.getAnioIngreso();
                empMax = e;
            }
            
            if(e.getAnioIngreso()<min){
                min = e.getAnioIngreso();
                empMin = e;
            }
        }
        
    } */

}
