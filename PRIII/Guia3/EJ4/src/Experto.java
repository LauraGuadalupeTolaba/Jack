public class Experto extends Permanentes {

    public Experto(String nombre, int numeroLegajo, String domicilio, double sueldobase, int aniosAntiguedad)
    {
        super(nombre, numeroLegajo, domicilio, sueldobase, aniosAntiguedad);
    }

    @Override
    double calculoSueldoBruto()
    {
        double bruto ;

        bruto = getSueldo() + getSueldo() * 0.5 + getAniosAntiguedad()*1.5 * getSueldo() / 100.0 ;

        return bruto;

    }
}
