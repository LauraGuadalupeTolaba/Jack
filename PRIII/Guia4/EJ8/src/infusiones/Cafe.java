package infusiones;

public class Cafe extends Infusiones {

    private final boolean endulzado;

    public Cafe(boolean endulzado) {

        super();
        this.endulzado = endulzado;

    }


    @Override
    protected void agregarTipoInfusion()
    {

        System.out.println("Se agrega cafe molido a la taza ₊˚⊹♡");

    }

    @Override
    protected void endulzar()
    {

        System.out.println("Se agrega Azucar a la bebida");

    }

    @Override
    protected boolean siEndulzar()
    {

        return endulzado ;

    }

}
