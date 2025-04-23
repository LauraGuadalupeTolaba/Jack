import biblioteca.CD;
import biblioteca.Canciones;
import biblioteca.ItemBiblioteca;
import biblioteca.Libros;

public class Main {
    public static void main(String[] args)
    {

        ItemBiblioteca libro1 = new Libros(12345,"Patroclo",2015);
        CD cd1 = new CD(56878,"XaaaaaaP",2020,"pAis");
        CD cd2 = new CD(58878,"PaaaaaaP",2000,"Aatroclo");
        cd1.addCancion(new Canciones(1,"Aaaa","2:45"));
        cd1.addCancion(new Canciones(2,"Bbbb","3:15"));

        System.out.println(libro1);
        System.out.println(cd1);
        cd1.isPrestado();
        cd1.prestar();
        cd1.isPrestado();
        cd1.comparable(cd2);





    }
}