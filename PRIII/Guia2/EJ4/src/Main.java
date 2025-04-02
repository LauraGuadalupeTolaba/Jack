import Negocio.Empleado;
import Negocio.LineadePedido;
import Negocio.Producto;
import Negocio.Pedido;


public class Main {
    public static void main(String[] args)
    {
        Empleado empleado1 = new Empleado("Patroclo","patroclo@gmail.com","223222322") ;
        Empleado empleado2 = new Empleado("Jack","jack@gmail.com","011011011") ;
        Producto p1 = new Producto(123,"Pomelos",50.0);
        Producto p2 = new Producto(456,"Chocolate",525.25);
        Producto p3 = new Producto(789,"Frutillas",3999);

        Pedido pedido1 = new Pedido(empleado1,"22-3-2025");
        System.out.println("Empleado encargado del pedido: " + pedido1.getEmpleado().getNombre() + "\n Fecha del pedido : " + pedido1.getFecha() +"\n" );

        pedido1.getLista().add(new LineadePedido(p1,2));
        pedido1.getLista().add(new LineadePedido(p2,4));
        pedido1.getLista().add(new LineadePedido(p3,100));

        System.out.println("Total de elementos en la lista de Pedidido : " + pedido1.getLista().size() + "\n");
        System.out.println(pedido1.toString());

        System.out.println("Monto total: " + pedido1.TotalCompra() + "\n");

        pedido1.setEmpleado(empleado2);

        System.out.println(pedido1.toString());











    }
}