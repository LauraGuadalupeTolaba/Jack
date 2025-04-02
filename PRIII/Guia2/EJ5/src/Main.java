import Empresas.*;

public class Main {
    public static void main(String[] args)
    {
        Empresa empresa = Empresa.getInstancia();

        Categoria categoria1 = new Categoria("Junior",60000);
        Categoria categoria2 = new Categoria("Senior",150000);
        Categoria categoria3 = new Categoria("Profesional",200000);

        empresa.agregarCategoria(categoria1);
        empresa.agregarCategoria(categoria2);
        empresa.agregarCategoria(categoria3);

        empresa.agregarChofer( new Chofer(categoria1,new Domicilio("Nnnnnnnn",3402),"Patroclo"));
        empresa.agregarChofer(new Chofer(categoria1,new Domicilio("AAAAAAAA",3406),"Paris"));
        empresa.agregarChofer(new Chofer(categoria3,new Domicilio("MMMMMMM",3409),"Jack"));

        empresa.agregarColectivo("ZZZZZZZZZZ");
        empresa.agregarColectivo("OOOOOOOOOO:)");

        empresa.obtenerChofer(1).setColectivo(empresa.obtenerColectivo(0));

        System.out.println("Cantidad de colectiveros que no tienen asignado ninguncolectivo :" + empresa.choferesSinColectivo() + "\n");

        System.out.println("Total de colectivos que posee la empresa : " + empresa.totalColectivos() + "\n");

        System.out.println("Lista de los choferes que pertenecen a la categoria " + empresa.nombredeCategoria(0) + ":\n" );
        empresa.choferCategoria(empresa.nombredeCategoria(0));

        System.out.println("Categorias que tienen un sueldo puerior a 90000 : ");
        empresa.categoriaSupSueldo(90000);

        System.out.println("Los choferes que tienes un sueldo superior a 150000 :");
        empresa.montoSupChoferes(150000);

        System.out.println(empresa.getChofer(1).toString());

        empresa.obtenerChofer(1).desvincularColectivo();

        System.out.println(empresa.getChofer(1).toString());

    }
}