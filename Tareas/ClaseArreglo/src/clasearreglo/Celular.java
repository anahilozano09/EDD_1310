/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasearreglo;

/**
 *
 * @author Anahi
 */
public class Celular {
    
    private String marca;
    private String modelo;
    private float pulgadas;
    private int almacenamiento;

    public Celular() {
    }

    public Celular(String marca, String modelo, float pulgadas, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.almacenamiento = almacenamiento;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(float pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", modelo=" + modelo + ", pulgadas=" + pulgadas + ", almacenamiento=" + almacenamiento + '}';
    }
    
    
    
}
