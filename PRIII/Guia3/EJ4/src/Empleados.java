public abstract class Empleados {

    private String nombre ;
    private int numeroLegajo ;
    private String domicilio ;


    public Empleados(String nombre, int numeroLegajo, String domicilio)
    {

        this.nombre = nombre;
        this.numeroLegajo = numeroLegajo;
        this.domicilio = domicilio;

    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setNumeroLegajo(int numeroLegajo)
    {
        this.numeroLegajo = numeroLegajo;
    }

    public void setDomicilio(String domicilio)
    {
        this.domicilio = domicilio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getNumeroLegajo()
    {
        return numeroLegajo;
    }

    public String getDomicilio()
    {
        return domicilio;
    }

    abstract double calculoSueldo();

    @Override
    public String toString() {
        return "Empleado :" +
                "nombre ='" + nombre ;
    }
}
