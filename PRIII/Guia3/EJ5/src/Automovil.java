public abstract class Automovil {
    private String patente ;
    private double velocidad,velocidadmaxima ;
    private int marcha ;

    public Automovil(String patente, double velocidadmaxima)
    {
        this.patente = patente;
        this.velocidadmaxima = velocidadmaxima;
    }

    public Automovil(String patente)
    {
        this.patente = patente ;
        this.velocidadmaxima = 160.0 ;
    }

    public String getPatente()
    {
        return patente;
    }

    public double getVelocidad()
    {
        return velocidad;
    }

    public int getMarcha()
    {
        return marcha;
    }

    public double getVelocidadmaxima()
    {
        return velocidadmaxima;
    }

    public void setVelocidad(double velocidad)
    {
        this.velocidad = velocidad;
    }

    protected void setMarcha( int marcha)
    {

        if(marcha > -1 && marcha<=5)

            this.marcha = marcha;

    }
    abstract void acelerar(double vel);
    abstract void frenar(double velocidad);

    @Override
    public String toString() {
        return  "patente='" + patente + '\'' + ", velocidad=" + velocidad +
                ", velocidadmaxima=" + velocidadmaxima + "marcha =" + marcha + "\n";
    }
}
