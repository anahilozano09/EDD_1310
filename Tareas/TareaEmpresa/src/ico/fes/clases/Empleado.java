/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.clases;

/**
 *
 * @author Anahi
 */
public class Empleado {
    
    public static final double VALOR_HORAS_EXTRA = 276.5;
    public static final double PRESTACION_ANTIGUEDAD = 0.03;
    private int id;
    private String nombre;
    private String paterrno;
    private String materno;
    private double sueldoBase;
    private int horasExtra;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterrno, String materno, double sueldoBase, int horasExtra, int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.paterrno = paterrno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.horasExtra = horasExtra;
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterrno() {
        return paterrno;
    }

    public void setPaterrno(String paterrno) {
        this.paterrno = paterrno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", paterrno=" + paterrno + ", materno=" + materno + ", sueldoBase=" + sueldoBase + ", horasExtra=" + horasExtra + ", anioIngreso=" + anioIngreso + '}';
    }
    
    public double calcularSueldo(){
        double prestacion = (2022 - this.anioIngreso) * this.PRESTACION_ANTIGUEDAD;
        double he = this.horasExtra * this.VALOR_HORAS_EXTRA;
        return this.sueldoBase + prestacion + he;
    }
    
}