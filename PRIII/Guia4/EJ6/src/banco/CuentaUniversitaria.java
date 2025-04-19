package banco;

public class CuentaUniversitaria extends Cuenta {

    private double extraccionPermitida = 1000.0 ;
    private boolean dia ;
    public CuentaUniversitaria(String nombre) {
        super(nombre);
        dia = true;
    }

    public void newDia()
    {
        this.dia = true;
        this.extraccionPermitida = 1000.0 ;
    }

    @Override
    protected void extraer(double importe)
    {

        this.setSaldo( this.getSaldo() - importe );
        extraccionPermitida -= importe ;

    }

    @Override
    protected boolean validaExtraccion(double Unmonto)
    {

        if(dia && Unmonto <= extraccionPermitida && this.getSaldo() >= Unmonto)

            return true;

        else

            return false;

    }
}
