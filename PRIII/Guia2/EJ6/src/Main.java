public class Main {
    public static void main(String[] args) {
        Estacion estacion = Estacion.getInstance();
        int ind = 10, i;

        for (i = 0; i < ind ; i++)

            estacion.agregarSurtidor();

        System.out.println("Cantidad de surtidores :" + estacion.cantidadTotalS() );

        System.out.println("Cantidad total de Premium : " + estacion.totalPremium());
        System.out.println("Cantidad total de Super : " + estacion.totalSuper());
        System.out.println("Cantidad total de Gasoil : " + estacion.totalGasoil() + "\n");

        estacion.getSurtidor(2).ventaPremium(1200);
        estacion.getSurtidor(8).ventaGasoil(120);
        estacion.getSurtidor(3).ventaPremium(1100);
        estacion.getSurtidor(9).ventaSuper(20200);
        estacion.getSurtidor(8).ventaGasoil(19000);
        estacion.getSurtidor(2).ventaSuper(18000);

        System.out.println("Cantidad total de Premium : " + estacion.totalPremium());
        System.out.println("Cantidad total de Super : " + estacion.totalSuper());
        System.out.println("Cantidad total de Gasoil : " + estacion.totalGasoil() + "\n");

        System.out.println("Surtidor con mayor ventas de combustible Gasoil:" + estacion.mayorVentasG());
        System.out.println("Surtidor con mayor ventas de combustible Super:" + estacion.mayorVentasS());
        System.out.println("Surtidor con mayor ventas de combustible Premium:" + estacion.mayorVentasP() +"\n");

        System.out.println("Litro vendidos de toda la estación:" + estacion.litrosVendidosEstacion());
        System.out.println("Litros vendidsos de cada surtidor:");
        for(i=0;i< estacion.cantidadTotalS(); i++)
        {
            System.out.println("Surtidor : " + estacion.getSurtidor(i).getNrodeSurtidor() );
            System.out.println("Litros vendidos de cada combustible:");
            System.out.println("Premium:"+estacion.getSurtidor(i).getLitrosVendidosP());
            System.out.println("Super:"+estacion.getSurtidor(i).getLitrosVendidosS());
            System.out.println("Gasoil:"+estacion.getSurtidor(i).getLitrosVendidosG()+"\n");
        }


    }
}