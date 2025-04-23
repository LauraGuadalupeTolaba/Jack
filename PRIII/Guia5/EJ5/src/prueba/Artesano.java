package prueba;

public abstract class Artesano {

    private String nombre;

    public Artesano(String nombre)
    {

        this.nombre = nombre;

    }

    public String getNombre()
    {

        return nombre;

    }

    public abstract String Trabajar(Material mat);
    public abstract  String TrabajarMadera(Madera madera);
    public abstract String TrabajarMetal(Metal metal);

}
