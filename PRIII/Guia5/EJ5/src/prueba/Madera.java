package prueba;

public class Madera extends Material{

    private String tipo;

    public Madera(String color, String tipo)
    {

        super(color);
        this.tipo = tipo;

    }

    public String getTipo()
    {

        return tipo;

    }


    @Override
    public String UsadoPor(Artesano artesano)
    {

        return artesano.TrabajarMadera(this);

    }

    @Override
    public String toString()
    {

        return  tipo + " " + super.toString();

    }
}
