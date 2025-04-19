import banco.CajaAhorro;
import banco.Cuenta;
import banco.CuentaCorriente;
import banco.CuentaUniversitaria;

public class Main {
    public static void main(String[] args)
    {

        Cuenta Alumno = new CuentaUniversitaria("Paris");
        Cuenta PersonaX = new CuentaCorriente("Jack",10000);
        Cuenta PersonaY = new CajaAhorro("Patroclo",05);

        System.out.println("----------------------Depisitos------------------");
        Alumno.depositar(150000);
        PersonaX.depositar(500000);
        PersonaY.depositar(1500000);

        System.out.println("----------------------Saldo Actual------------------");
        System.out.println( PersonaX.getSaldo() );
        System.out.println( PersonaY.getSaldo() );
        System.out.println( Alumno.getSaldo() );

        System.out.println("----------------------Extracciones------------------");
        Alumno.Extraer(200000);
        Alumno.Extraer(200);

        PersonaX.Extraer(550000);
        PersonaX.Extraer(250000);

        PersonaY.Extraer(2000000);
        PersonaY.Extraer(500);

        System.out.println("----------------------Saldo Actual------------------");
        System.out.println( PersonaX.getSaldo() );
        System.out.println( PersonaY.getSaldo() );
        System.out.println( Alumno.getSaldo() );

    }

}