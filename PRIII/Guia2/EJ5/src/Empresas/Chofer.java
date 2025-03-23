package Empresas;

public class Chofer {
    private Categoria categoria;
    private Domicilio domicilio;
    private String nombre;

    public Chofer(Categoria categoria, Domicilio domicilio, String nombre)
    {
        this.categoria = categoria;
        this.domicilio = domicilio;
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria)
    {
        this.categoria = categoria;
    }

    public Domicilio getDomicilio()
    {
        return domicilio;

    }

    public void setDomicilio(Domicilio domicilio)
    {
        this.domicilio = domicilio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
