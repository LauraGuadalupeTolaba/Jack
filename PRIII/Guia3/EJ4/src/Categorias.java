public abstract class Categorias {
    private String nombre;
    private double sueldo;

    public Categorias(String nombre, double sueldo)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setSueldo(double sueldo)
    {
        this.sueldo = sueldo;
    }

    abstract void calculoSueldo(int anios);
}
