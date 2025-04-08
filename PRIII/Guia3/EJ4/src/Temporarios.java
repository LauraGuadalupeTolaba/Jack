public class Temporarios extends Empleados {

    private double sueldoHora ;
    private int cantHoras;

    public Temporarios(String nombre, int numeroLegajo, String domicilio, double sueldoHora,int cantHoras)
    {
        super(nombre, numeroLegajo, domicilio);
        this.sueldoHora = sueldoHora ;
        this.cantHoras = cantHoras ;

    }

    public double getSueldoHora()
    {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora)
    {
        this.sueldoHora = sueldoHora;
    }

    public int getCantHoras()
    {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras)
    {
        this.cantHoras = cantHoras;
    }

    @Override
    public double calculoSueldo()
    {
        return sueldoHora * cantHoras ;
    }

    @Override
    public String toString() {
        return super.toString() + ", sueldo :" + calculoSueldo() + "\n" ;
    }
}
