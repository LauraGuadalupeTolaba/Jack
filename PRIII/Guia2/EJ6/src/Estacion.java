import java.util.ArrayList;

public class Estacion
{
    private static Estacion _intancia = null ;
    private ArrayList<Surtidor> surtidores = new ArrayList<>() ;
    int nro;

    private Estacion()
    {
    }

    public static Estacion getInstance()
    {
        if(_intancia == null)

            _intancia = new Estacion();

        return _intancia;
    }
    public void agregarSurtidor()
    {
        surtidores.add(new Surtidor(nro)) ;
        nro++;
    }

    public Surtidor getSurtidor( int ind)
    {
        return surtidores.get(ind);
    }

    public int cantidadTotalS()
    {
        return surtidores.size();
    }
    public int totalGasoil ()
    {
        int total = 0;
        for(Surtidor surtidor : surtidores)

            total += surtidor.getCantGasoil();

        return total;
    }

    public int totalSuper ()
    {
        int total = 0;
        for(Surtidor surtidor : surtidores)

            total += surtidor.getCantSuper();

        return total;
    }

    public int totalPremium ()
    {
        int total = 0;
        for(Surtidor surtidor : surtidores)

            total += surtidor.getCantPremium();

        return total;
    }

    public int litrosVendidosEstacion()
    {
        int total = 0;
        for(Surtidor surtidor : surtidores)

            total += surtidor.getLitrosVendidosP() + surtidor.getLitrosVendidosG() + surtidor.getLitrosVendidosS() ;

        return total;
    }

    public int mayorVentasP() {
        int aux, nroaux = 0;

        aux = surtidores.get(1).getCantVentasP();
        for (Surtidor surtidor : surtidores)

            if (aux < surtidor.getCantVentasP())
            {
                aux = surtidor.getCantVentasP();
                nroaux = surtidor.getNrodeSurtidor();
            }

        return  nroaux;
    }

    public int mayorVentasG() {
        int aux, nroaux = 0;

        aux = surtidores.get(1).getCantVentasG();
        for (Surtidor surtidor : surtidores)

            if (aux < surtidor.getCantVentasG())
            {
                aux = surtidor.getCantVentasG();
                nroaux = surtidor.getNrodeSurtidor();
            }

        return  nroaux;
    }

    public int mayorVentasS() {
        int aux, nroaux = 0;

        aux = surtidores.get(1).getCantVentasS();
        for (Surtidor surtidor : surtidores)

            if (aux < surtidor.getCantVentasS())
            {
                aux = surtidor.getCantVentasS();
                nroaux = surtidor.getNrodeSurtidor();
            }

        return  nroaux;
    }
}
