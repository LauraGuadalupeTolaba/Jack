package Socios;

public class Socio
{
    private String nombre;
    private int edad;
    private double cuota;
    private boolean representante;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public boolean isRepresentante() {
        return representante;
    }

    public void setRepresentante(boolean representante) {
        this.representante = representante;
    }

    public double calcularCuota()
    {
        if (this.edad > 65 )
        {
            return this.cuota - this.cuota * 0.5 ;
        }
        else
            if ( this.edad < 18 && representante)
            {
                return this.cuota - this.cuota * 0.25 ;
            }
            else
            {
                return this.cuota;
            }

    }

    public String detalle()
    {
        String retorno =
                "Nombre : " + this.nombre + "\n Edad: " + this.edad + "\n Cuota: " + this.calcularCuota();

        return retorno;

    }
}
