import Socios.Socio;
public class Main {
    public static void main(String[] args)
    {
        Socio S1 = new Socio();

        S1.setCuota(500.0);
        S1.setNombre("Patroclo");
        S1.setEdad(17);
        S1.setRepresentante(false);

        System.out.println( S1.detalle());

        if(S1.isRepresentante())
            System.out.println("Es representante oficial del club\n");
        else
            System.out.println("No es representante oficial del club\n");


    }
}