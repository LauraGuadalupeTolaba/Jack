public class Principiante extends Categorias {


    public Principiante(String nombre, double sueldo)
    {
        super(nombre, sueldo);
    }

    @Override
    void calculoSueldo(int anios)
    {
        double aux,extra;

        extra = anios * getSueldo()/100.0 ;
        aux = this.getSueldo() + this.getSueldo() * 0.25 + extra ;

        this.setSueldo(aux);
    }
}
