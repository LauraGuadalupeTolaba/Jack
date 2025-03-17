package Archivos;

import java.io.File; // Ya me lo importo

public class Archi {
    public static void main(String[] args) {
        File carpeta = new File("CarpetaNueva");
        if (carpeta.mkdir()){// Para ssaber si la carpeta fue creada
            System.out.println("La carpeta fue creada ");
        }else{
            System.out.println("La carpeta no fue creada");
        }

    }
}
