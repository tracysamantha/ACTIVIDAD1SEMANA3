/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1semana3;

/**
 *
 * @author tracy
 */
public class Circulo extends FiguraGeometrica implements Shape {

    private Punto centro;
    private int radio;

    public Circulo(String nombre, Punto centro, int radio) {
        super(nombre);
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double obtenerPerimetro() {
        return Math.PI*2*radio; 
    }

    @Override
    public String toString() {
        return "Circulo{" + "nombre=" + getNombre() + ", centro=" + centro + ", radio=" + radio + '}';
    }

    @Override
    public boolean esRegular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
