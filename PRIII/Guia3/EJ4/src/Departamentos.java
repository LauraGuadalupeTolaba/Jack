import java.util.ArrayList;

public class Departamentos {

    private String nombre;
    private ArrayList<Empleados> empleados = new ArrayList<>();

    public Departamentos(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleados empleado)
    {
         empleados.add(empleado);
    }
    public void sacarEmpleado(int ind)
    {
        empleados.remove(ind) ;
    }

    @Override
    public String toString() {
        return "Departamento de "+ nombre + "\n" + empleados ;
    }
}
