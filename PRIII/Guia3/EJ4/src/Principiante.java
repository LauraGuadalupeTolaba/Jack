import java.util.HashMap;
import java.util.Map;
public class Principiante extends Permanentes {

    protected Map<Integer,Double> porcentajes = new HashMap<>() ;

    public Principiante(String nombre, int numeroLegajo, String domicilio, double sueldobase, int aniosAntiguedad)
    {

        super(nombre, numeroLegajo, domicilio, sueldobase, aniosAntiguedad);

        porcentajes.put(5,5.0);
        porcentajes.put(10,7.0);
        porcentajes.put(15,10.0);
        porcentajes.put(20,15.0);
        porcentajes.put(100,20.0);
    }


    @Override
    double calculoSueldoBruto()
    {
        int i = 5 ;
        double bruto = getSueldo() ;

        if ( getAniosAntiguedad()>= 2 ) {

            while (getAniosAntiguedad() >= i && getAniosAntiguedad()<21 )

                i += 5;

            if ( i == 25 )

                i=100;

            bruto += bruto * porcentajes.get(i) / 100.0 ;

        }

        return bruto ;
    }

}
