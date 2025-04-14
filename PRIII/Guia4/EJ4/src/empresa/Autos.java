package empresa;

public class Autos extends Vehiculos {

    private final int plazas = 4 ;
    private int cantplaza ;
    private final double incremento = 1.5 ;

    public Autos(String patente)
    {
        super(patente);
    }

    public int getPlazas()
    {
        return plazas;
    }

    public int getCantplaza()
    {
        return cantplaza;
    }

    /**
     * Este método cambia la cantidad de plazas que se van a utilizar.
     *
     * <b> pre: </b> La cantidad de plazas debe ser un numero positivo y menor a las plazas totales.<br>
     * <b> post : </b> Se modifica el valor de la cantidad de plazas que se van a utilizar. <br>
     *
     * @param cantplaza Es la cantidad de plazas que se van a ocupar.
     */
    public void setCantplaza(int cantplaza)
    {
        this.cantplaza = cantplaza;
    }


    @Override
    public double PrecioAlquiler( int dias )
    {

        double porcentaje = 0.0 , precio =0.0;

        porcentaje = cantplaza * cantplaza * incremento ;

        precio = this.getPreciobase() + porcentaje * this.getPreciobase() / 100.0;


        return precio * dias ;

    }


}
