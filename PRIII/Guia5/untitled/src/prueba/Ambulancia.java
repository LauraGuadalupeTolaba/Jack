package prueba;

public class Ambulancia extends Vehiculo implements Emisor_de_Sonido {
    public Ambulancia(String patente, String modelo)
    {

        super(patente, modelo);

    }

    @Override
    public void emiteSonido()
    {

        System.out.println("***Sonido de ambulancia***");

    }
}
