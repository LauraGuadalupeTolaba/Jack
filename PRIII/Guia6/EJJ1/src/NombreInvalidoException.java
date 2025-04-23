public class NombreInvalidoException extends Exception{

    private String nombre;

    public NombreInvalidoException(String nombre)
    {

        super("El nombre no esta correcta es vacio (null)");
        this.nombre = nombre;

    }

    public String getNombre()
    {

        return nombre;

    }
}
