package Cuentas;

public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular)
    {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar (double monto)
    {
        if(monto > 0)
        {
            this.saldo += monto ;
        }
    }

    public boolean extraer (double monto)
    {
        if(monto > 0 && monto <= this.saldo)
        {
            this.saldo -= monto;
            return true;

        } else

            return false;
    }
    public double getSaldo()
    {
        return saldo;
    }

    public String getTitular()
    {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria \n" +
                "saldo=" + this.saldo +
                ", titular='" + this.titular + '\'' +
                '\n';
    }
}
