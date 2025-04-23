package prueba;

public class Perro extends Animal {

    public Perro(String nombre, int esperanzaDeVida)

    {

        super(nombre, esperanzaDeVida);

    }

    @Override
    public void emiteSonido()
    {

        System.out.println("Guau Guau :3");

    }
}
