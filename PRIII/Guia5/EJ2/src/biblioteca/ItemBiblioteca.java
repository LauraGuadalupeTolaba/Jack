package biblioteca;

public class ItemBiblioteca {

    private int codigo;
    private String titulo;
    private int anio;

    public ItemBiblioteca(int codigo, String titulo, int anio)
    {

        this.codigo = codigo;
        this.titulo = titulo;
        this.anio = anio;

    }

    public int getCodigo()
    {

        return codigo;

    }

    public String getTitulo()
    {

        return titulo;

    }

    public int getAnio()
    {

        return anio;

    }

    @Override
    public String toString() {
        return "codigo=" + codigo +
                " titulo='" + titulo + '\'' +
                " anio=" + anio ;
    }
}
