public class Empresa {

    private static Empresa _instancia = null;

    private Empresa()
    {
    }
    public static Empresa getInstancia()
    {
        if(_instancia == null)

            _instancia = new Empresa();

        return _instancia;
    }

}
