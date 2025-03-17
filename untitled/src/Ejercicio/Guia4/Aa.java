package Ejercicio.Guia4;

import java.util.Scanner;

public class Aa {
    public static void main(String[] Args) {
        int[] arrayDeNumeros = new int[3];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tres numeros");
        int num, num2, num3 = teclado.nextInt();
        System.out.println("Ingrese A si el orden es ascendente o D si es desscendente");
        String orden = teclado.nextLine();
        orden = orden.toUpperCase();

    }
}
