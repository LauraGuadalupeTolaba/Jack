package prueba;

public class Juguetero extends Artesano {

    public Juguetero(String nombre)
    {

        super(nombre);

    }

    @Override
    public String Trabajar(Material mat)
    {

        return mat.UsadoPor(this);

    }

    @Override
    public String TrabajarMadera(Madera madera)
    {

        return this.getNombre() + " fabricó un muñeco de " + madera.toString();

    }

    @Override
    public String TrabajarMetal(Metal metal)
    {

        return this.getNombre() + " fabrico un Autito de " + metal.toString();

    }


}
