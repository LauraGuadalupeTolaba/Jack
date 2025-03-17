package ClaseyObjetos;

public class Clase {
    public static void main(String[] args){
        auto auto1= new auto(4,"rojo","Ford","Fiesta");
        System.out.println("El auto es "+auto1.getMarca());
        auto auto2= new auto(4,"verde","Ford","Fiesta");
        if (auto1.getColor() != auto2.getColor()){
            System.out.println("NO Son del mismo color");
        }else {
            System.out.println("Son del mismo color");
        }
        if (auto1.getPuertas() == auto2.getPuertas()){
            System.out.println("Misma cantidad de puertas");
        }else {
            System.out.println("No tienen la misma cantidad de puertas");
        }
        System.out.println("------------------------------");
        Usado auto3= new Usado(4,"Amarillo", "Fiat", "Uno",1300000);
        System.out.println(auto3.toString());
    }


}

class auto {
    //Atributos
      private int puertas;
      private String color;
      private String modelo;
      private String Marca;
      private boolean usado;

    public auto(int puertas,String color, String modelo, String Marca){
        this.puertas=puertas;
        this.color=color;
        this.modelo=modelo;
        this.Marca=Marca;
        this.usado=false;
    }



    public int getPuertas() {
        return puertas;
    }

    public String getColor() {
        return color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public boolean isUsado() {

        return usado;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    @Override
    public String toString() {
        return "auto{ " +
                "puertas = " + puertas + '\n' +
                "color = " + color  +'\n' +
                "modelo = " + modelo + '\n' +
                "Marca = " + Marca + '\n' +
                "usado = " + usado + " " +
                '}';
    }
}

//Herencia
class Usado extends auto{
    int kilometro;
    public Usado(int puertas, String color,String modelo, String Marca, int kilometro){
        super(puertas, color, modelo, Marca);
        super.setUsado(true);
        this.kilometro=kilometro;

    }

    public int getKilometro() {
        return kilometro;
    }

    @Override
    public String toString() {
        return "Auto Usado : " + '\n' +
                "puertas = " + super.getPuertas() + '\n' +
                "color = " + super.getColor()  +'\n' +
                "modelo = " + super.getModelo() + '\n' +
                "Marca = " + super.getMarca() + '\n' +
                "kilometro = " + kilometro + " " ;
    }
}