package prueba;

public class Guerrero extends Personajes{

    public Guerrero(String nombre)
    {

        super(nombre);

    }

    @Override
    public void HechizoB()
    {

        this.setVitalidad( this.getVitalidad() * 1.25);

    }

    @Override
    public void HechizoM()
    {

        this.setVitalidad( this.getVitalidad() - this.getVitalidad() * 0.5 );

    }
}
