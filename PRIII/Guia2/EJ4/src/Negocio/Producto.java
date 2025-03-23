package Negocio;

public class Producto
{
    private int codigo;
    private String descripcion;
    private double preciounitario;

    public Producto(int codigo, String descripcion, double preciounitario)
    {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public double getPreciounitario()
    {
        return preciounitario;
    }

    public void setPreciounitario(double preciounitario)
    {
        this.preciounitario = preciounitario;
    }

    @Override
    public String toString()
    {
        return "Producto: " + "codigo = " + codigo + ", Descripcion = " + descripcion  + ", Precio unitario = " + preciounitario  ;
    }
}
