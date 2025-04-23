package prueba;

public class Vaca extends Animal {

    public Vaca(String nombre, int esperanzaDeVida)
    {

        super(nombre, esperanzaDeVida);

    }

    @Override
    public void emiteSonido()
    {

        System.out.println("Muuuuuuuu ...");

    }
}
