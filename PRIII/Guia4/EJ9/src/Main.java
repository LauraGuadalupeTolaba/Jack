import ola.Base;
import ola.Extendida;

public class Main {
    public static void main(String[] args) {

        Base b = new Base();
        Base e = new Extendida();


        System.out.println(b.metodo1(e));
        System.out.println(e.metodo1(e));
        System.out.println(b.metodo1((Extendida) e));
        System.out.println(e.metodo1((Extendida) e));
        //System.out.println(b.metodo2(b));
        //System.out.println(e.metodo2(e));
        //System.out.println(e.metodo2((Extendida) b));
        System.out.println(e.metodo2((Extendida) e));
        Extendida x = (Extendida) e;
        System.out.println(x.metodo2(b));
        System.out.println(x.metodo2(e));

    }
}