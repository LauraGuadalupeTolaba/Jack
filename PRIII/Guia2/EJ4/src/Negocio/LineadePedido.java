package Negocio;

public class LineadePedido
{
    private Producto producto;
    private int cantidad;

    public LineadePedido(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto()
    {
        return producto;
    }

    public void setProducto(Producto producto)
    {
        this.producto = producto;
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
        return   this.producto.toString() + " Cantidad = " + cantidad + "\n";
    }
}
