package empresa;

public abstract class  Vehiculos {

    private String patente ;

    private double preciobase = 500.0 ;

    /**
     * Este método crea un nuevo vehiculo.
     *
     * <b> pre: </b> La patente debe ser una cadena.
     * <b> post : </b> Creo el nuevo vehículo.
     *
     * @param patente Es la identificacion del vehiculo. patente != null, patente != " "
     *
     */
    public Vehiculos(String patente)
    {
        this.patente = patente;
    }

    public void setPreciobase(double preciobase)
    {
        this.preciobase = preciobase;

    }

    public double getPreciobase()
    {
        return preciobase;
    }

    /**
     * Este método obtiene el precio total de los días que se quiere alquilar-<br>
     *
     * <b> pre: </b> La cantidad de días debe ser un numero mayor o igual a uno.
     * <b> post : </b> Se obtiene el precio del aquiler por los días dados.
     *
     * @param dias Es la cantidad de dias que se va a alquilar el vehículo. dias >= 1
     * @return
     */
    public abstract double PrecioAlquiler(int dias);

    @Override
    public String toString() {
        return "Vehiculos" + "patente ='" + patente  ;
    }
}
