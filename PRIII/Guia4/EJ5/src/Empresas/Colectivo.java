package Empresas;

public class Colectivo extends Vehiculo{

    private int cantidadPasajeros;

    public Colectivo(String m, int nrointerno) {
        super(m, nrointerno);
    }

    public void setCantidadPasajeros(int cantidadPasajeros)
    {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public boolean aceptoChofer(Chofer chofer)
    {
        return false;
    }
}