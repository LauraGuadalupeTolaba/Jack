package Empresas;

public class Categoria {

    private String nombrecategoria;
    private double sueldo;

    public Categoria(String nombrecategoria, double sueldo)
    {
        this.nombrecategoria = nombrecategoria;
        this.sueldo = sueldo;
    }

    public String getNombrecategoria()
    {
        return nombrecategoria;
    }

    public void setNombrecategoria(String nombrecategoria)
    {
        this.nombrecategoria = nombrecategoria;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "nombrecategoria='" + nombrecategoria + '\'' ;
    }
}
