package prueba;

public class Joyero extends Artesano {
    public Joyero(String nombre)
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

        return this.getNombre() + " fabricó Aros de " + madera.toString();

    }

    @Override
    public String TrabajarMetal(Metal metal)
    {

        return this.getNombre() + " fabricó un anillo " + metal.toString();

    }


}
