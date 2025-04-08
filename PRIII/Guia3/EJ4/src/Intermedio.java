public class Intermedio extends Permanentes {


    public Intermedio(String nombre, int numeroLegajo, String domicilio, double sueldobase, int aniosAntiguedad)
    {
        super(nombre, numeroLegajo, domicilio, sueldobase, aniosAntiguedad);
    }

    @Override
    double calculoSueldoBruto()
    {

        double bruto ;

        bruto = this.getSueldo() + this.getSueldo() * 0.25 + this.getAniosAntiguedad() * this.getSueldo()/100.0 ;

        return bruto;

    }

}
