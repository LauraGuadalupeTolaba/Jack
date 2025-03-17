package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoTexto {
    public static void main(String [] args) {
        String texto = "Este es el archivo creado";
        File archivo= new File("Archivo de texto");
//Si queremos crear un archivo si o si debemos usar la estructura try
        FileWriter escritor = null;
        try {
            escritor = new FileWriter(archivo);
            escritor.write(texto);
            escritor.close();
            System.out.println("El archivo fue creado");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
