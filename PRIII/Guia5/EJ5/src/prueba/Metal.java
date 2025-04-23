package prueba;

public class Metal extends Material{

    private String nombre;

    public Metal(String color, String nombre)
    {

        super(color);
        this.nombre = nombre;

    }

    public String getNombre()
    {

        return nombre;

    }

    @Override
    public String UsadoPor(Artesano artesano)
    {

        return artesano.TrabajarMetal(this);

    }

    @Override
    public String toString()
    {

        return nombre + " " +  super.toString();

    }

}
