package infusiones;

public class Mate extends Infusiones {

    public Mate()
    {

        super();

    }

    @Override
    protected void agregarTipoInfusion()
    {
        System.out.println("Se agrega yerba al mate ☆ﾟ.*･｡ﾟ ");
    }

    @Override
    protected void endulzar()
    {
    }

    @Override
    protected boolean siEndulzar()
    {

        return false;

    }
}
