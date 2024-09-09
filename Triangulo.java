/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1semana3;

/**
 *
 * @author tracy
 */
public class Triangulo extends FiguraGeometrica implements Shape {
    private Punto vertice1, vertice2, vertice3; 

    public Triangulo(String nombre, Punto vertice1, Punto vertice2, Punto vertice3) {
        super(nombre);
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    
    @Override
    public double calcularArea() {
        double lado1=vertice1.getDistancia(vertice2); 
        double lado2=vertice2.getDistancia(vertice3); 
        double lado3=vertice3.getDistancia(vertice1);
        
        double s=(lado1+lado2+lado3)/2; 
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3)); 
    }

    @Override
    public boolean esRegular() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
    return "Esta figura es un triangulo"+getNombre()+", vertices= "+vertice1+", "+vertice2+", "+vertice3; 
    }

    @Override
    public double obtenerPerimetro() {
        return vertice1.getDistancia(vertice2)+vertice2.getDistancia(vertice3)+vertice3.getDistancia(vertice1);
    }
    
}
