package Empresas;

public class NewCategoria extends Categoria {

    private boolean habilitaColectivoLinea;
    private boolean habilitaColectivoLarga;
    private boolean habilitaCamion;
    public NewCategoria(String nombrecategoria, double sueldo)
    {
        super(nombrecategoria, sueldo);
    }

    public void setHabilitaColectivoLinea(boolean habilitaColectivoLinea)
    {
        this.habilitaColectivoLinea = habilitaColectivoLinea;
    }

    public void setHabilitaColectivoLarga(boolean habilitaColectivoLarga)
    {
        this.habilitaColectivoLarga = habilitaColectivoLarga;
    }

    public void setHabilitaCamion(boolean habilitaCamion)
    {
        this.habilitaCamion = habilitaCamion;
    }
}
