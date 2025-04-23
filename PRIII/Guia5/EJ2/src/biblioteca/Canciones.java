package biblioteca;

public class Canciones {

    private int nroPista;
    private String titulo;
    private String duracion;

    public Canciones(int nroPista, String titulo, String duracion)
    {

        this.nroPista = nroPista;
        this.titulo = titulo;
        this.duracion = duracion;

    }

    public int getNroPista()
    {
        return nroPista;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getDuracion()
    {
        return duracion;
    }

    @Override
    public String toString() {
        return "Cancion " +
                "nroPista=" + nroPista +
                ", titulo='" + titulo + '\'' +
                ", duracion='" + duracion ;
    }
}
