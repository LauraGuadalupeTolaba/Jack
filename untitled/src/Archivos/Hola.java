package Archivos;

import java.util.Scanner;

public class Hola {
    public static void main(String[] args) {
        // Vamos a pedir al usuario
        Scanner teclado= new Scanner(System.in); //Aca abrimos el scanner
        System.out.println("Ingrese el primer numero");
        int num1= teclado.nextInt();
        System.out.println(num1);
        System.out.println("ingrese algo");
        String Oracion = teclado.next();
        System.out.println(Oracion);
        teclado.close();// Hay que cerrar el scanner ya que gasta demasiados recursos
    }

    }


