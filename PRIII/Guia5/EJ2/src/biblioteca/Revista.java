package biblioteca;

public class Revista extends ItemBiblioteca{

    private int nro;
    public Revista(int codigo, String titulo, int anio,int nro)
    {

        super(codigo, titulo, anio);
        this.nro = nro;

    }

    @Override
    public String toString() {
        return "Revista" +
                "nro=" + nro +
                super.toString();
    }
}
