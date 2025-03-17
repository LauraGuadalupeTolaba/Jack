import Empleados.Categoria;
import Empleados.Empleado;

public class Main {
    public static void main(String[] args)
    {
        Empleado Ep1 = new Empleado();
        Empleado Ep2 = new Empleado();
        Empleado Ep3 = new Empleado();
        Empleado Ep4 = new Empleado();
        Empleado Ep5 = new Empleado();
        Empleado Ep6 = new Empleado();

        Categoria Principiante = new Categoria("Principiante",80.0);
        Categoria Operario = new Categoria("Operario", 100.0);
        Categoria Experto = new Categoria("Experto",130.0);




        Ep1.setNombre("Juan Perez");
        Ep1.setCat(Principiante);
        Ep1.setHstrabajadas(100);
        Ep1.setAntiguedad(4);

        Ep2.setNombre("Roberto Gonzales");
        Ep2.setCat(Principiante);
        Ep2.setHstrabajadas(10);
        Ep2.setAntiguedad(8);

        Ep3.setNombre("Sandra Lopez");
        Ep3.setCat(Principiante);
        Ep3.setHstrabajadas(120);
        Ep3.setAntiguedad(14);

        Ep4.setNombre("German Gutierrez");
        Ep4.setCat(Operario);
        Ep4.setHstrabajadas(110);
        Ep4.setAntiguedad(16);

        Ep5.setNombre("Vicente Hernandez");
        Ep5.setCat(Experto);
        Ep5.setHstrabajadas(100);
        Ep5.setAntiguedad(9);

        Ep6.setNombre("Patroclo");
        Ep6.setCat(Experto);
        Ep6.setHstrabajadas(115);
        Ep6.setAntiguedad(20);

        System.out.println(Ep1.detalle());
        System.out.println(Ep2.detalle());
        System.out.println(Ep3.detalle());
        System.out.println(Ep4.detalle());
        System.out.println(Ep5.detalle());
        System.out.println(Ep6.detalle());

        System.out.println(":)");


    }
}