import infusiones.Cafe;
import infusiones.Infusiones;
import infusiones.Mate;

public class Main {
    public static void main(String[] args)
    {

        Infusiones mate = new Mate();
        Infusiones CafeDulce = new Cafe(true);
        Infusiones CafeAmargo = new Cafe(false);

        System.out.println("-----------------------MATE---------------------------");
        mate.prepararInfusion();

        System.out.println("-----------------------CAFE AMARGO---------------------------");
        CafeAmargo.prepararInfusion();

        System.out.println("-----------------------CAFE DULCE---------------------------");
        CafeDulce.prepararInfusion();



    }
}