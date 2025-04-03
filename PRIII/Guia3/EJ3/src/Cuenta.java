public abstract class Cuenta {
    private double saldo;
    private final String nombre;

    public Cuenta(String nombre)
    {
        this.saldo = 0.0 ;
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getSaldo()
    {
        return saldo;
    }
    public void depositar(double importe)
    {
        this.saldo += importe;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }


    abstract void extraer(double importe);

}
