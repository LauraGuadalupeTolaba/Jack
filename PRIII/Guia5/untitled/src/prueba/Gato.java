package prueba;

public class Gato extends Animal {

    public Gato(String nombre, int esperanzaDeVida)
    {

        super(nombre, esperanzaDeVida);

    }

    @Override
    public void emiteSonido()
    {

        System.out.println("Miau Miau ≽^•⩊•^≼");

    }
}
