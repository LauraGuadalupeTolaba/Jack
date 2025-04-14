import empresa.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int i;
        ArrayList<Vehiculos> Vehiculo =  new ArrayList<>();
        FactoryVehiculo factoryV = new FactoryVehiculo();

        Vehiculo.add(factoryV.getVehiculo(1,"12AUS23")) ;
        Vehiculo.add(factoryV.getVehiculo(2,"45AUD78"));
        Vehiculo.add(factoryV.getVehiculo(3,"89QUE78"));
        Vehiculo.add(factoryV.getVehiculo(4,"78HUK89"));
        Vehiculo.add(factoryV.getVehiculo(1,"12AYS23")) ;
        Vehiculo.add(factoryV.getVehiculo(2,"45AUD78"));
        Vehiculo.add(factoryV.getVehiculo(3,"89QUE78"));
        Vehiculo.add(factoryV.getVehiculo(4,"78HAK89"));
        Vehiculo.add(factoryV.getVehiculo(1,"12AAS23")) ;
        Vehiculo.add(factoryV.getVehiculo(2,"45ATD78"));

        for(i=0;i<Vehiculo.size();i++)
        {
            System.out.println(Vehiculo.get(i).toString() + " Precio alquiler por cinco días = " + Vehiculo.get(i).PrecioAlquiler(5));
        }

    }
}