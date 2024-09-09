/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1semana3;

/**
 *
 * @author tracy
 */
public class Rectangulo extends Cuadrilatero implements Shape{

    public Rectangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3, Punto vertice4) {
        super(vertice1, vertice2, vertice3, vertice4, nombre);
    }
    
    @Override
    public double calcularArea() {
        double base;
        double altura;
        base = calcularDistancia(getVertice1(), getVertice2());
        altura = calcularDistancia(getVertice1(), getVertice3());
        return base * altura;
    }
    
    private double calcularDistancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }
    @Override
    public String toString() {
        return "Rectangulo[nombre=" + getNombre() + ", vertices=(" 
               + getVertice1() + ", " + getVertice2() + ", " 
               + getVertice3() + ", " + getVertice4() + ")]";
    }

    @Override
    public double obtenerPerimetro() {
        double base = calcularDistancia(getVertice1(), getVertice2());
        double altura = calcularDistancia(getVertice1(), getVertice4());
        return 2 * (base + altura);   
    }

    @Override
    public boolean esRegular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
