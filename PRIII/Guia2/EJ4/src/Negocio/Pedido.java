package Negocio;

import java.util.ArrayList;

public class Pedido
{
    private Empleado empleado;
    private String fecha;

    private ArrayList<LineadePedido> lista = new ArrayList<>() ;

    public Pedido(Empleado empleado, String fecha)
    {
        this.empleado = empleado;
        this.fecha = fecha;
    }

    public ArrayList<LineadePedido> getLista()
    {
        return lista;
    }

    public Empleado getEmpleado()
    {
        return empleado;
    }

    public void setEmpleado(Empleado empleado)
    {
        this.empleado = empleado;
    }

    public String getFecha()
    {
        return fecha;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public double TotalCompra()
    {
        double total = 0.0;

        for (LineadePedido lineadePedido : lista)

            total += lineadePedido.getProducto().getPreciounitario() * lineadePedido.getCantidad();

        return total;
    }
    @Override
    public String toString() {
        return "PEDIDO :\n" +
                "Empleado :" + this.empleado.getNombre() +
                "\n Fecha realizada =" + this.fecha  +
                "\n Lista = \n " + lista  ;
    }
}
