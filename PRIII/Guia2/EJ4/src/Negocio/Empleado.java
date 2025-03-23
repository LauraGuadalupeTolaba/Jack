package Negocio;

public class Empleado
{
    private String empleado, email,telefono;

    public Empleado(String empleado, String email, String telefono)
    {
        this.empleado = empleado;
        this.email = email;
        this.telefono = telefono;
    }

    public String getEmpleado()
    {
        return empleado;
    }

    public void setEmpleado(String empleado)
    {
        this.empleado = empleado;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getTelefono()
    {
        return telefono;
    }

    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
    }
}
