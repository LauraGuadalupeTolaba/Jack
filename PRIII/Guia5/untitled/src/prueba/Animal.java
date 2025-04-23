package prueba;

public abstract class Animal implements Emisor_de_Sonido{

    private final String nombre;
    private final int esperanzaDeVida;

    public Animal(String nombre, int esperanzaDeVida)
    {

        this.nombre = nombre;
        this.esperanzaDeVida = esperanzaDeVida;

    }

    public String getNombre()
    {

        return nombre;

    }

    public int getEsperanzaDeVida()
    {

        return esperanzaDeVida;

    }


}
