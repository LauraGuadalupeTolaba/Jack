package prueba;

public abstract class Personajes implements Hechizable {

    private String nombre;
    private double vitalidad;

    public Personajes(String nombre)
    {

        this.nombre = nombre;
        this.vitalidad = 100.0;

    }

    public double getVitalidad()
    {

        return vitalidad;

    }

    public void setVitalidad(double vitalidad)
    {

        this.vitalidad = vitalidad;

    }
}
