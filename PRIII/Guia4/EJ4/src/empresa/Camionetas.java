package empresa;

public class Camionetas extends Vehiculos {

    private double PMA = 3.5 ;
    private final double incremento = 20.0 ;

    /**
     * Este método crea una nueva camioneta pasando los datos correspondientes.
     *
     * <b> pre: </b> La patente debe ser distinto de vacio.
     * <b> post : </b> Un nuevo vehiculo tipo camioneta se creo con los datos.
     *
     * @param patente Es la identificacion de la camioneta. pantente != " "
     */
    public Camionetas(String patente)
    {
        super(patente);
    }

    @Override
    public double PrecioAlquiler( int dias )
    {

        double precio =0.0;

        precio = this.getPreciobase() + incremento * PMA * this.getPreciobase() / 100.0;

        return precio * dias ;

    }

}
