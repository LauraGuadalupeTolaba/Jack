public class ContraseniaInvalidaException extends Exception{

    private String contrasenia;

    public ContraseniaInvalidaException (String contrasenia)
    {

        super("La contrasenia es invalida :S");
        this.contrasenia = contrasenia ;

    }

    public String getContrasenia()
    {

        return contrasenia;

    }

}
