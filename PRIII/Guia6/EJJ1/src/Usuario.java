public class Usuario {

    private String nombre;
    private String contrasenia;

    public Usuario(String nombre, String contrasenia)
    {

        try{

            ValidaNombre(nombre);
            ValidaContrasenia(contrasenia);

        }catch (NombreInvalidoException a){

            System.out.println(a.getMessage());

        }catch (ContraseniaInvalidaException b ){

            System.out.println(b.getMessage());

        }

    }

    public String getNombre()
    {
        return nombre;
    }

    private void ValidaContrasenia(String contrasenia) throws ContraseniaInvalidaException
    {

        if(contrasenia != null && contrasenia.length() > 6 && contrasenia.charAt(0) >= 'A' && contrasenia.charAt(0)  <= 'Z')

            this.contrasenia = contrasenia;

        else

            throw new ContraseniaInvalidaException(contrasenia);

    }

    private void ValidaNombre(String nombre) throws NombreInvalidoException
    {

        if(nombre == null || nombre.isEmpty() ) // .isEmpty() va a lanzar si esta vacio

            throw new NombreInvalidoException(nombre);

        else

            this.nombre = nombre;

    }

    public String getContrasenia()
    {
        return contrasenia;
    }

}
