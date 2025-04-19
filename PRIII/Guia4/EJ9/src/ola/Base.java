package ola;

public class Base {

    public String metodo1(Base x)
    {
        return "metodo 1 en clase Base, parametro Base: "+x.toString();
    }
    public String metodo1(Extendida x)
    {
        return "metodo 1 en clase Base, parametro Extendida: " +x.toString();
    }
    public String metodo2(Extendida y)
    {
        return "metodo 2 en clase Base, parametro Extendida: " +y.toString();
    }
    @Override
    public String toString()
    {
        return "soy Base";
    }
}
