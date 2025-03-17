package Ejercicio.Guia3;

public class Bb {
    public static void main(String [] args) {
   // b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3
     int[] arrayDeNumeros = new int[3];
     int num1= -87;
     int num3= 72;
     int num2= 14;
     //Ascendente
        if(num1> num2 && num1>num3){
          arrayDeNumeros[0]=num1;
          if(num2>num3){
            arrayDeNumeros[1]=num2;
            arrayDeNumeros[2]=num3;
          }else{
              arrayDeNumeros[1]=num3;
              arrayDeNumeros[2]=num2;
          }
        }else{
            if(num2>num1 && num2>num3){
                arrayDeNumeros[0]=num2;
                if(num1>num3){
                    arrayDeNumeros[1]=num1;
                    arrayDeNumeros[2]=num3;
                }else{
                    arrayDeNumeros[1]=num3;
                    arrayDeNumeros[2]=num1;
                }
            } else {
                arrayDeNumeros[0]=num3;
                if(num2>num1){
                    arrayDeNumeros[1]=num2;
                    arrayDeNumeros[2]=num1;
                }else{
                    arrayDeNumeros[1]=num1;
                    arrayDeNumeros[2]=num2;
                }
            }
        }
        for (int arrayDeNumero : arrayDeNumeros) {
            System.out.println(arrayDeNumero);
        }
     }
}
