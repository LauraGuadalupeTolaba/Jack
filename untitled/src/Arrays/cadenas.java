package Arrays;

import java.lang.annotation.Target;

public class cadenas {
    public static void main(String[] args) {
        String nombre = "Patroclo";
        String nombre2 = "Paris";
        if(nombre.equals(nombre2)) {
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
        System.out.println("----------------------");
        System.out.println(nombre.toLowerCase()); //Todo a minuscula
        System.out.println(nombre.toUpperCase()); //Todos a mayuscula

        // Para saber que contiene algun conjunto de letras o una letra
        if(nombre.contains("at") ){
            System.out.println("El nombre cont at");
        } else {
            System.out.println("No contiene at");
        }

    }
    }

