package prueba;

public class Dragon extends Personajes {

    private double poderFuego;

    public Dragon(String nombre)
    {

        super(nombre);
        this.setVitalidad(1000.0);
        poderFuego = 100.0 ;

    }

    @Override
    public void HechizoB()
    {

        poderFuego += poderFuego*0.4 ;
        this.setVitalidad(this.getVitalidad()+250);

    }

    @Override
    public void HechizoM()
    {

        poderFuego -= poderFuego*0.3;
        this.setVitalidad(this.getVitalidad()-this.getVitalidad()*0.2);

    }

}




