package prueba;

public class Caballero extends Personajes{

    private double armadura;

    public Caballero(String nombre)
    {

        super(nombre);
        armadura = 1000.0;

    }


    @Override
    public void HechizoB()
    {

        this.armadura += 200.0;

    }

    @Override
    public void HechizoM()
    {

        this.armadura -= 200.0;

    }
}
