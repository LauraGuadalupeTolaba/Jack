import sun.util.resources.cldr.or.TimeZoneNames_or;

public class CuentaCorriente extends Cuenta{
    private final double tope ;
    public CuentaCorriente(String nombre,double tope)
    {
        super(nombre);
        this.tope = tope;
    }

    @Override
    void extraer(double importe)
    {
        double aux;

        if ( importe < this.getSaldo())

            this.setSaldo(this.getSaldo()-importe);

        else
        {

            aux = this.getSaldo() - importe;
            if ( Math.abs(aux) <= tope )

                this.setSaldo(aux);

        }
    }

}
