package Ejercicio.Guia3;

import java.util.Scanner;

public class Cc {
    public static void main(String [] args){
        //c. dado un vector de números, y un número X, que sume todos los números > X y
        //retorne el resultado
        int suma;
        int[] num= new int[5];
        num[0]= 23;
        num[1]= 24;
        num[2]= 56;
        num[3]= 2;
        num[4]= 5;
        suma=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int aux= teclado.nextInt();
        for (int i=0; i<num.length;i++){
            if (num[i]>aux){
               suma=suma+num[i];
            }
        }
        System.out.println(suma);

    }
}
