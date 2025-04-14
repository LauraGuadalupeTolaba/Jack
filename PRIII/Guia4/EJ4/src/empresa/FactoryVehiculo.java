package empresa;

public class FactoryVehiculo {

    public FactoryVehiculo() {
    }

    public Vehiculos getVehiculo(int nro, String patente)
    {
      if (nro != 0 ) {

          switch (nro) {

              case 1:
                  return new Autos(patente);
              case 2:
                  return new Camionetas(patente);
              case 3:
                  return new Camiones(patente);
              case 4:
                  return new Combis(patente);

          }
      }else
          return null;
      return null;
    }
}
