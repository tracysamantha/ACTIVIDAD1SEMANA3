/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1semana3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tracy
 */
public class SuperficiePlana {
    private List<Shape> figuras; 

    public SuperficiePlana() {
            this.figuras=new ArrayList<>(); 
    }
    
    public void agregarFigura(Shape figura){
        figuras.add(figura);
    }
    public double calcularAreaTotal(){
        double areaTotal = 0; 
        for(Shape figura:figuras){
            if (figura instanceof FiguraGeometrica){
                areaTotal+=((FiguraGeometrica)figura).calcularArea(); 
            }
        }
    return areaTotal;
    }
     public void imprimirInformacionDeFiguras() {
        for (Shape figura : figuras) {
            if (figura instanceof FiguraGeometrica) {
                System.out.println(figura.toString());
                System.out.println("Area: " + ((FiguraGeometrica) figura).calcularArea());
                System.out.println("Perimetro: " + figura.obtenerPerimetro());
            }
        }
    }
}
