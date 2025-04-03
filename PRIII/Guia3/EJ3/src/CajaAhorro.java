public class CajaAhorro extends Cuenta {

    protected int maxExtracciones = 10 ;
    protected int cantExtracciones = 0 ;
    private int mesActual ;

    public CajaAhorro(String nombre)
    {
        super(nombre);
    }

    public int getMesActual()
    {
        return mesActual;
    }

    public void setMesActual(int mesActual)
    {
        this.mesActual = mesActual;
        cantExtracciones = 0 ;
    }

    @Override
    void extraer(double importe)
    {
        if( importe <= this.getSaldo() && cantExtracciones < maxExtracciones )
        {

            this.setSaldo(this.getSaldo() - importe);
            cantExtracciones ++ ;

        }
    }
}
