package biblioteca;

public class Libros extends ItemBiblioteca implements Prestable {

    private boolean prestado;

    public Libros(int codigo, String titulo, int anio)
    {

        super(codigo, titulo, anio);
        prestado = false;

    }

    public void setPrestado(boolean prestado)
    {

        this.prestado = prestado;

    }

    @Override
    public String toString() {

        return "Libro = " + super.toString();

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

        if (prestado)

            prestado = false ;

    }

    @Override
    public void isPrestado()
    {

        if( prestado )

            System.out.println("El libro esta prestado");

        else

            System.out.println("El libro no se encuentra prestado");

    }
}
