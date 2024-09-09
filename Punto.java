/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package act1semana3;

/**
 *
 * @author tracy
 */
public class Punto {

    private int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
public double getDistancia(Punto otro) {
        return Math.sqrt(Math.pow(otro.getX() - this.x, 2) + Math.pow(otro.getY() - this.y, 2));
    }

    // Método para encontrar el punto más cercano entre un array de puntos
    public Punto calcularPuntoMasCercano(Punto[] puntos) {
        Punto masCercano = puntos[0];
        double distanciaMinima = this.getDistancia(masCercano);

        for (Punto p : puntos) {
            double distancia = this.getDistancia(p);
            if (distancia < distanciaMinima) {
                masCercano = p;
                distanciaMinima = distancia;
            }
        }

        return masCercano;
    }

    // Método equals para comparar puntos
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Punto punto = (Punto) obj;
        return x == punto.x && y == punto.y;
    }
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }

}
