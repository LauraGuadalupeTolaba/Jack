package biblioteca;

import java.util.Arrays;

public class CD extends ItemBiblioteca implements Prestable, Comparables{

    private String interprete;
    private Canciones ListadeCanciones[] = new Canciones[10];
    private int ind;
    private boolean prestado;
    public CD(int codigo, String titulo, int anio,String interprete)
    {


        super(codigo, titulo, anio);
        this.interprete = interprete ;
        prestado = false;
        ind=-1;
    }

    public String getInterprete()
    {
        return interprete;
    }

    public Canciones[] getCanciones()
    {
        return ListadeCanciones;
    }

    public void addCancion(Canciones cancion)
    {

        if(ind<10)
            this.ind ++;
            this.ListadeCanciones[ind]= cancion;

    }

    @Override
    public void prestar()
    {

        if(!prestado)

            prestado = true;

    }

    @Override
    public void devolver()
    {

        if(prestado)

            prestado = false;

    }

    @Override
    public void isPrestado()
    {

        if(prestado)

            System.out.println("El CD esta prestado");

        else

            System.out.println("El CD no esta prestado");

    }

    @Override
    public String toString() {
        return "CD" + super.toString() +
                "interprete='" + interprete + '\'' +
                ", ListadeCanciones=" + Arrays.toString(ListadeCanciones) ;
    }

    @Override
    public void comparable( CD cd2)
    {

        int aux = interprete.compareTo(cd2.getInterprete());

        if( aux < 0 || aux == 0 && this.getTitulo().compareTo(cd2.getTitulo()) < 0)
        {

            System.out.println("Debe ir antes");

        }else

            System.out.println("Debe ir despues");


    }
}
