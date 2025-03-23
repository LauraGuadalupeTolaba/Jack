package Negocio;

import java.util.ArrayList;

public class Pedido
{
    private Empleado encargado;
    private String fecha;

    private ArrayList<LineadePedido> lista = new ArrayList<>() ;

    public Pedido(Empleado encargado, String fecha)
    {
        this.encargado = encargado;
        this.fecha = fecha;
    }

    public ArrayList<LineadePedido> getLista()
    {
        return lista;
    }

    public Empleado getEncargado()
    {
        return encargado;
    }

    public void setEncargado(Empleado encargado)
    {
        this.encargado = encargado;
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

        for(int i = 0; i < lista.size(); i++)

            total += lista.get(i).getArticulo().getPreciounitario() * lista.get(i).getCantidad();

        return total;
    }
    @Override
    public String toString() {
        return "PEDIDO :\n" +
                "Encargado de pedido :" + this.encargado.getEmpleado() +
                "\n Fecha realizada =" + this.fecha  +
                "\n Lista = \n " + lista  ;
    }
}
