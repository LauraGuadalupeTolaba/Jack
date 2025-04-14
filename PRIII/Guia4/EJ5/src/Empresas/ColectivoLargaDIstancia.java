package Empresas;

public class ColectivoLargaDIstancia extends Vehiculo {

    private boolean cocheCama ;

    public ColectivoLargaDIstancia(String m, int nrointerno)
    {
        super(m, nrointerno);
        cocheCama = false;
    }

    public void setCocheCama(boolean cocheCama)
    {
        this.cocheCama = cocheCama;
    }

    @Override
    public boolean aceptoChofer(Chofer chofer)
    {
        return false;
    }
}
