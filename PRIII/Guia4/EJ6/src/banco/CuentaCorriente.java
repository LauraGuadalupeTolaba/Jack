package banco;

public class CuentaCorriente extends Cuenta{
    private final double tope ;
    private double extra;
    public CuentaCorriente(String nombre, double tope)
    {
        super(nombre);
        this.tope = tope;
        this.extra = 0.0;
    }

    @Override
    protected void extraer(double importe)
    {

        double aux;

        aux = this.getSaldo();
        if(aux >= importe)

            this.setSaldo( aux - importe );

        else

            if( aux < importe && aux != 0 )
            {

                extra = aux - importe ;
                this.setSaldo(0.0);

            } else

                extra += importe;


    }

    @Override
    protected boolean validaExtraccion(double Unmonto)
    {

        double aux;

        aux = this.getSaldo();

        if( (aux > 0 && aux >= Unmonto) || (aux < Unmonto) && extra >= Unmonto && extra < tope )

            return true;

        else

            return false;

    }


}
