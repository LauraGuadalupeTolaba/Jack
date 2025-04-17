package Empresas;

public class Acoplado {

    private int tara;
    private int cargaMaxima;
    private boolean refrigerado;
    private int numeroAcoplado;
    private boolean enUso;

    public Acoplado(int cargaMaxima,int tara)
    {
        this.tara = tara;
        this.cargaMaxima = cargaMaxima;
        refrigerado = false;
        enUso = false;
    }

    public void setRefrigerado(boolean refrigerado)
    {
        this.refrigerado = refrigerado;
    }

    public void setEnUso(boolean enUso)
    {
        this.enUso = enUso;
    }
}
