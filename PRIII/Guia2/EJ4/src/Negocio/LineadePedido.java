package Negocio;

public class LineadePedido
{
    private Producto articulo;
    private int cantidad;

    public LineadePedido(Producto articulo, int cantidad)
    {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public Producto getArticulo()
    {
        return articulo;
    }

    public void setArticulo(Producto articulo)
    {
        this.articulo = articulo;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    @Override
    public String toString()
    {
        return   this.articulo.toString() + " Cantidad = " + cantidad + "\n";
    }
}
