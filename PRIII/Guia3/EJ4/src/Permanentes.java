public abstract class Permanentes extends Empleados {

    private double sueldo;
    private int aniosAntiguedad;

    public Permanentes(String nombre, int numeroLegajo, String domicilio,double sueldobase, int aniosAntiguedad)
    {
        super(nombre, numeroLegajo, domicilio);
        this.sueldo = sueldobase ;
        this.aniosAntiguedad = aniosAntiguedad ;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    public int getAniosAntiguedad()
    {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad)
    {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    abstract double calculoSueldoBruto();
    @Override
    public double calculoSueldo()
    {
      return calculoSueldoBruto() * 0.17 ;
    }

    @Override
    public String toString() {
        return super.toString() + ", sueldo :" + calculoSueldoBruto() +"\n";
    }
}
