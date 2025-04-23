package prueba;

public class Pollito extends Animal  {

    public Pollito(String nombre, int esperanzaDeVida)
    {

        super(nombre, esperanzaDeVida);

    }

    @Override
    public void emiteSonido()
    {

        System.out.println("PIo pio");

    }
}
