package Empresas;

public abstract class Vehiculo {

    private String modelo;
    private int numerointerno;

    public Vehiculo(String m,int nrointerno)
    {
        numerointerno = nrointerno;
        modelo = m;
    }

    public abstract boolean aceptoChofer(Chofer chofer) ;

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getNumerointerno()
    {
        return numerointerno;
    }

    public void setNumerointerno(int numerointerno)
    {
        this.numerointerno = numerointerno;
    }

    @Override
    public String toString() {
        return "Modelo='" + modelo + '\'' +
                ", Numerointerno=" + numerointerno ;
    }


}
