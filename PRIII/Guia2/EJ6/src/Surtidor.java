public class Surtidor
{
    private final int nrodeSurtidor ;
    private int cantGasoil;
    private int cantPremium;
    private int cantSuper;
    private int litrosVendidosG;
    private int litrosVendidosS;
    private int litrosVendidosP;
    private int cantVentasP;
    private int cantVentasS;
    private int cantVentasG;

    public Surtidor(int nro)
    {
        nrodeSurtidor = nro ;
        cantGasoil = 20000 ;
        cantSuper = 20000 ;
        cantPremium = 20000 ;
        cantVentasP = 0;
        cantVentasG = 0;
        cantVentasS = 0;
        litrosVendidosG = 0;
        litrosVendidosP = 0;
        litrosVendidosS = 0;
    }

    // private boolean extraerGasolina( )  Solo para uso interno de la clase
    public boolean extraerGasolina(int litros)
    {
        return litros <= cantGasoil;

    }

    public int getNrodeSurtidor()
    {
        return nrodeSurtidor;
    }

    public int getLitrosVendidosG()
    {
        return litrosVendidosG;
    }

    public int getLitrosVendidosS()
    {
        return litrosVendidosS;
    }

    public int getLitrosVendidosP()
    {
        return litrosVendidosP;
    }

    public int getCantVentasP()
    {
        return cantVentasP;
    }

    public int getCantVentasS()
    {
        return cantVentasS;
    }

    public int getCantVentasG()
    {
        return cantVentasG;
    }

    public boolean extraerSuper(int litros)
    {
        return litros <= cantSuper;

    }
    public boolean extraerPremium(int litros)
    {
        return litros <= cantPremium;
    }
    public int getCantGasoil()
    {
        return cantGasoil;
    }

    public int getCantPremium()
    {
        return cantPremium;
    }

    public int getCantSuper()
    {
        return cantSuper;
    }

    public void llenarDepositoGasoil()
    {
        this.cantGasoil = 20000 ;
    }
    public void llenarDepositoSuper()
    {
        this.cantSuper = 20000 ;
    }

    public void llenarDepositoPremium ()
    {
        this.cantPremium = 20000 ;
    }

    public void ventaSuper(int cantidadS)
    {
        if (cantSuper != 0)
            cantVentasS++;

        if (extraerSuper(cantidadS)) {
            cantSuper -= cantidadS;
            litrosVendidosS += cantidadS;
        } else {
            litrosVendidosS += cantidadS + (cantSuper-cantidadS);
            cantSuper = 0;
        }
    }
    public void ventaGasoil(int cantidadG)
    {
        if (cantGasoil != 0)
            cantVentasG ++;

        if (extraerGasolina(cantidadG))
        {
            cantGasoil -= cantidadG;
            litrosVendidosG += cantidadG;
        }
        else
        {
            litrosVendidosG += cantidadG + (cantGasoil-cantidadG);
            cantGasoil = 0;
        }
    }

    public void ventaPremium(int cantidadP)
    {
        if (cantPremium != 0)
            cantVentasP ++;

        if (extraerPremium(cantidadP))
        {
            cantPremium -= cantidadP;
            litrosVendidosP += cantidadP;
        }
        else
        {
            litrosVendidosP += cantidadP + (cantPremium-cantidadP);
            cantPremium = 0;
        }
    }



}



