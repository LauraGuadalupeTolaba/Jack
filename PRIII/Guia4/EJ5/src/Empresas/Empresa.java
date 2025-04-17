package Empresas;

import java.util.ArrayList;

public class Empresa {
    private static Empresa _instancia = null;
    private ArrayList<Categoria> categorias = new ArrayList<>();
    private ArrayList<Chofer> choferes = new ArrayList<>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    int nrointerno=0;

    private Empresa()
    {
    }
    public static Empresa getInstancia()
    {
        if (_instancia == null)

            _instancia = new Empresa();

        return _instancia;
    }

    public Chofer obtenerChofer(int ind)
    {
        return choferes.get(ind) ;
    }

    public Vehiculo obtenerColectivo(int ind)
    {
        return vehiculos.get(ind);
    }

    public ArrayList<Categoria> getCategorias()
    {
        return categorias;
    }

    public ArrayList<Chofer> getChoferes()
    {
        return choferes;
    }

    public Chofer getChofer( int ind)
    {
        return choferes.get(ind);
    }

    public ArrayList<Vehiculo> getColectivos()
    {
        return vehiculos;
    }
    public void agregarCategoria(Categoria categoria)
    {
        categorias.add(categoria);
    }
    public void  agregarChofer(Chofer chofer)
    {
        choferes.add(chofer);
    }
    public void agregarColectivo(Vehiculo vehiculo)
    {
        nrointerno ++;
        vehiculos.add(vehiculo);
    }
    public int totalColectivos()
    {
        return vehiculos.size();
    }

    public  String nombredeCategoria(int ind)
    {
        return categorias.get(ind).getNombrecategoria();
    }
    public void choferCategoria(String nombrecategoria)
    {
        if ( !choferes.isEmpty())
        {
            for (Chofer chofer : choferes)
            {
                if( nombrecategoria.equals( chofer.getCategoria().getNombrecategoria()))

                    System.out.println(chofer + "\n");

            }
        }
    }
    public void categoriaSupSueldo(double sueldo)
    {
        if(!categorias.isEmpty())
        {
            for (Categoria categoria : categorias)
            {
                if (sueldo <= categoria.getSueldo())

                    System.out.println(categoria.getNombrecategoria());

            }
        }
    }
    public void montoSupChoferes(double sueldo)
    {
        if(!choferes.isEmpty())
        {
            for(Chofer chofer : choferes)
            {
                if (chofer.getCategoria().getSueldo() >= sueldo)

                    System.out.println(chofer.toString() + "\n");

            }
        }
    }

    public int choferesSinColectivo()
    {
        int cant = 0;

        for(Chofer chofer : choferes)
        {

            if(chofer.getColectivo() == null)

                cant++;

        }

        return  cant;
    }
}
