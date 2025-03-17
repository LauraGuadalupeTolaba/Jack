package Empleados;

public class Empleado
{
    private String nombre;
    private int antiguedad, hstrabajadas;
    private Categoria cat;

    public String getNombre()
    {
       return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getAntiguedad()
    {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad)
    {
        this.antiguedad=antiguedad;
    }

    public int getHstrabajadas()
    {
        return hstrabajadas;
    }

    public void setHstrabajadas(int hstrabajadas)
    {
        this.hstrabajadas = hstrabajadas;
    }

    public Categoria getCat()
    {
        return cat;
    }

    public void setCat(Categoria cat)
    {
        this.cat = cat;
    }

    public double getsueldo()
    {
        double aux;
        aux = this.cat.getSueldoporhora()*this.hstrabajadas;
        if(this.antiguedad > 5)
        {
            if(this.antiguedad < 10)
                aux *= 1.25;
            else
                aux *= 1.35;
        }

        return aux;
    }

    public String detalle()
    {
        String retorno =
                "Nmbre: "+ this.nombre + "\n antiguedad: " + "años\n Horas trabajadas: " + this.hstrabajadas + "\n Tipo de categoria: " + this.cat.getNombrecategoria() + "\n Sueldo por hora: " + this.cat.getSueldoporhora() + "\n Sueldo a cobrar: " + this.getsueldo() + "\n";
        return retorno;
    }
}
