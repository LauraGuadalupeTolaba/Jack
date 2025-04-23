import prueba.*;

public class Main {
    public static void main(String[] args)
    {

        Material cobre = new Metal("rojo","cobre");
        Material pino = new Madera("Amarillo","pino");
        Artesano a1 = new Juguetero("Juan");
        Artesano a2 = new Joyero("Pedro");

        System.out.println(a1.Trabajar(cobre));
        System.out.println(a1.Trabajar(pino));
        System.out.println(a2.Trabajar(cobre));
        System.out.println(a2.Trabajar(pino));


    }
}