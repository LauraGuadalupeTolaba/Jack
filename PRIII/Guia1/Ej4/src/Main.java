import Figuras.Rectangulo;
public class Main {
    public static void main(String[] args)
    {
        Rectangulo r1 = new Rectangulo(4,4);
        System.out.println( "Alto: " + r1.alto() + "\n");
        System.out.println("Ancho: " + r1.ancho() + "\n");
        System.out.println("Perimetro: " + r1.perimetro() + "\n");
        System.out.println("Area: " + r1.area() + "\n");

    }
}