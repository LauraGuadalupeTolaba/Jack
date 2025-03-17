package Ejercicio.Guia3;

public class Aa {
    public static void main(String [] args) {
        String frase = "Si yo te extraño\n" +
                "Te extraño por la noche\n" +
                "La noche me hace daño\n" +
                "Yo todavía te extraño\n" +
                "Dicen que un clavo\n" +
                "Siempre saca otro clavo\n" +
                "Pero este amor esclavo\n" +
                "Es difícil de olvidar ";
        System.out.println(frase.length());
        if(frase.contains("a")) {
            System.out.println("Si contiene la letra a");
        }else{
            System.out.println("No contiene la letra a");
        }
        //Vamos a buscar la cantidad de veces que se repite el caracter
        int pos,cont = 0;
        pos = frase.indexOf("a");
        System.out.println(pos);
        while(pos != -1){
            cont++;
            pos = frase.indexOf("a", pos+1);
        }
        System.out.println(cont);

    }
}
