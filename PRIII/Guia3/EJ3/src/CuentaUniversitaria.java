public class CuentaUniversitaria extends Cuenta {
    private double extraccionPermitida = 1000.0 ;

    private int dia ;


    public CuentaUniversitaria(String nombre,int dia) {
        super(nombre);
        this.dia = dia ;
    }

    public void setDia(int dia)
    {

        this.dia = dia;
        extraccionPermitida = 1000.0 ;

    }

    public int getDia()
    {

        return dia;

    }

    @Override
    void extraer(double importe) {

        if( importe <= extraccionPermitida )
        {

            this.setSaldo(this.getSaldo() - importe);
            extraccionPermitida -= importe ;

        }
    }
}
