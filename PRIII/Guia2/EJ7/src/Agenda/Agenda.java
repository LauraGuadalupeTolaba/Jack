package Agenda;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;

public class Agenda {

    private static Agenda _instancia = null;
    private HashMap<String, Telefonos> contactos = new HashMap<String, Telefonos>();

    private Agenda (){

    }
    public static Agenda getInstancia()
    {
        if(_instancia == null)
            _instancia = new Agenda();
        return _instancia ;
    }

    public void agregaContacto(String nombre)
    {
      if(!contactos.containsKey(nombre))

          contactos.put(nombre, new Telefonos());

      else

          System.out.println("Ya existe el contacto "+nombre+"\n");
    }

    public void eliminarContacto(String nombre)
    {
        if(contactos.containsKey(nombre))

            contactos.remove(nombre);

    }

    public void actualizarCelular(String nombre,int celular)
    {
        if(contactos.containsKey(nombre))
            contactos.get(nombre).agregaCelular(celular);
    }
    public void actualizarFijo(String nombre, int nroFijo)
    {
        if(contactos.containsKey(nombre))

            contactos.get(nombre).setNroFijo(nroFijo);
    }

    public String busquedaContacto(String nombre)
    {
        if(contactos.containsKey(nombre))
            return nombre + contactos.get(nombre).toString();
        else
            return "No existe el contacto "+nombre+"\n";
    }

    public void todosContactos() {
        for (String nombre : contactos.keySet()) {
            System.out.println(nombre);
            System.out.println(contactos.get(nombre).toString());
        }
    }
}
