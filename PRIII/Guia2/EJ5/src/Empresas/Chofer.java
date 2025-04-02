package Empresas;

public class Chofer {
    private Categoria categoria;
    private Domicilio domicilio;
    private String nombre;
    private Colectivo colectivo;


    public Chofer(Categoria cat, Domicilio dom, String nbre)
    {
        categoria = cat;
        domicilio = dom;
        nombre = nbre;
    }

    public Colectivo getColectivo()
    {
        return colectivo;
    }

    public void setColectivo(Colectivo colectivo)
    {
        this.colectivo = colectivo;
    }

    public Categoria getCategoria()
    {
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

    public void setDomicilio(Domicilio dom)
    {
        domicilio = dom;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nbre)
    {
        nombre = nbre;
    }

    public void desvincularColectivo()
    {
        colectivo=null;
    }
    @Override
    public String toString() {
        return "Chofer" +
                "categoria=" + categoria.toString() +
                ", nombre='" + nombre + '\'' +
                ", colectivo=" + colectivo ;
    }
}
