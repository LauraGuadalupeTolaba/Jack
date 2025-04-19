package infusiones;

public abstract class Infusiones {

    public Infusiones()
    {
    }

    public final void prepararInfusion()
    {

        calentarAgua();
        agregarTipoInfusion();
        if(siEndulzar())

            endulzar();

        else

            System.out.println("La bebida se tomara amarga ⋆.˚ ☾ .⭒˚ ");

        tomar();
    }

    protected void calentarAgua()
    {

        System.out.println("Calentando agua ˶ᵔ ᵕ ᵔ˶");

    }

    protected abstract void agregarTipoInfusion();

    protected abstract void endulzar();

    protected abstract boolean siEndulzar();

    protected void tomar()
    {

        System.out.println("Tomando bebida ꒰ঌ(˶ˆᗜˆ˵)໒꒱");

    }

}
