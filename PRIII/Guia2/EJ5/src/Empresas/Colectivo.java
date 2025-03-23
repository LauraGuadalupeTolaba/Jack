package Empresas;

public class Colectivo {
    private String modelo;
    private int numerointerno;

    public Colectivo(String modelo, int numerointerno)
    {
        this.modelo = modelo;
        this.numerointerno = numerointerno;
    }

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
}
