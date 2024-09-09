/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1semana3;

/**
 *
 * @author tracy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1 = new Punto(0, 0);
        Punto p2 = new Punto(4, 0);
        Punto p3 = new Punto(4, 3);
        Punto p4 = new Punto(0, 3);

        Rectangulo rectangulo = new Rectangulo("Rectangulo 1", p1, p2, p3, p4);
        Circulo circulo = new Circulo("Circulo 1", new Punto(5, 5), 2);
        Triangulo triangulo = new Triangulo("Triangulo 1", p1, p2, new Punto(2, 3));

        SuperficiePlana superficie = new SuperficiePlana();
        superficie.agregarFigura(rectangulo);
        superficie.agregarFigura((Shape) circulo);
        superficie.agregarFigura(triangulo);

        System.out.println("Area total de las figuras: " + superficie.calcularAreaTotal());
        superficie.imprimirInformacionDeFiguras();
    }

}
