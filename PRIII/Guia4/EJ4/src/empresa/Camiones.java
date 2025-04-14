package empresa;

public class Camiones extends Vehiculos {
    private final double incremento = 40.0 ;
    public Camiones(String patente)
    {
        super(patente);
    }

    @Override
    public double PrecioAlquiler(int dias)
    {
        double precio =0.0;

        precio = this.getPreciobase() + incremento * this.getPreciobase() / 100.0;

        return precio * dias ;
    }
}
