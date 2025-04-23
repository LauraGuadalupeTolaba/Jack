package prueba;

public class Arquero extends Personajes{

    private int flechas;
    public Arquero(String nombre)
    {

        super(nombre);
        flechas = 10;

    }

    public int getFlechas()
    {

        return flechas;

    }

    public void setFlechas(int flechas)
    {

        this.flechas = flechas;

    }

    @Override
    public void HechizoB()
    {

        this.flechas += 5;

    }

    @Override
    public void HechizoM()
    {

        this.flechas = 0;

    }
}
