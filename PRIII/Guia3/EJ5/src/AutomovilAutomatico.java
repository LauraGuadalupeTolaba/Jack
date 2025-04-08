public class AutomovilAutomatico extends Automovil{
    protected double [] velocidades = new double[5];

    public AutomovilAutomatico(String patente, double velocidadmaxima) {
        super(patente, velocidadmaxima);
        cargaVelocidades();
    }

    public AutomovilAutomatico(String patente) {
        super(patente);
        cargaVelocidades();
    }

    private void cargaVelocidades()
    {
        velocidades[0] = 0.0 ;
        velocidades[1] = 10.0 ;
        velocidades[2] = 35.0 ;
        velocidades[3] = 50.0 ;
        velocidades[4] = 90.0 ;
    }
    @Override
    void acelerar(double vel)
    {
        if(vel > 0 && vel < this.getVelocidadmaxima())
        {

            this.setVelocidad(vel);
            this.setMarcha(cambioMarcha(vel));

        }
    }

    private int cambioMarcha(double velocidad)
    {
        int i=0;

        while (i<5 && velocidad> velocidades[i])

            i++;

        return i;
    }

    @Override
    void frenar(double velocidad)
    {
        if( velocidad > 0 )
        {
            this.setVelocidad(velocidad);
            this.setMarcha(cambioMarcha(velocidad));
        }
    }

    @Override
    public String toString() {
        return "AutomovilAutomatico " + super.toString();
    }
}
