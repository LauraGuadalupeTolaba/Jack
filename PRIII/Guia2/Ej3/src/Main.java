import Cuentas.CuentaBancaria;

public class Main {
    public static void main(String[] args)
    {
        CuentaBancaria c1 = new CuentaBancaria("Patroclo");

        c1.depositar(50000);
        System.out.println(c1);

        if(c1.extraer(6000))

            System.out.println("La extracción fue exitosa\n");

        else

            System.out.println("No se pudo realizar la extraccion\n");

        System.out.println("Saldo : "+ c1.getSaldo());





    }
}