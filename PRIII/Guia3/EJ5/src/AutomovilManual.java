public class AutomovilManual extends Automovil{
    public AutomovilManual(String patente, double velocidadmaxima) {
        super(patente, velocidadmaxima);
    }

    public AutomovilManual(String patente) {
        super(patente);
    }

    @Override
    void acelerar(double vel)
    {
        if (vel < this.getVelocidadmaxima())

            this.setVelocidad(vel);

    }

    @Override
    void frenar(double velocidad)
    {
        if ( velocidad >= 0)

            this.setVelocidad(velocidad);

    }

    @Override
    public String toString() {
        return "AutomovilManual " + super.toString();
    }
}
