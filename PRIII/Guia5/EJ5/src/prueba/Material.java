package prueba;

public abstract class Material implements Trabajable{

    private String color;

    public Material(String color)
    {

        this.color = color;

    }

    public String getColor()
    {

        return color;

    }

    @Override
    public String toString()
    {

        return color;

    }
}
