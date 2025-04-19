package banco;

public class CajaAhorro extends Cuenta{

    protected int maxExtracciones = 10 ;
    protected int cantExtracciones = 0 ;
    private int mesActual ;

    public CajaAhorro(String nombre, int mesActual)
    {
        super(nombre);
        this.mesActual = mesActual ;
    }


    public int getMesActual()
    {
        return mesActual;
    }

    public void setMesActual(int mesActual) // Cuando cambien el mes, va a empezar settear la cantidad de extracciones
    {

        this.mesActual = mesActual;
        cantExtracciones = 0;

    }

    @Override
    protected void extraer(double importe)
    {
        this.setSaldo( this.getSaldo() - importe );
    }

    @Override
    protected boolean validaExtraccion(double Unmonto)
    {

        double aux;

        aux = this.getSaldo();

        if( cantExtracciones < maxExtracciones && aux > 0 && aux >= Unmonto )

            return true;

        else

            return false;

    }
}
