import prueba.*;

public class Main {
    public static void main(String[] args) {

        Ambulancia ambulancia = new Ambulancia("54LKJ58","Mercedes");

        Animal[] animales = new Animal[4] ;

        animales[0] = new Gato("Patroclo",15);
        animales[1] = new Perro("Paris",20);
        animales[2] = new Vaca("oTTo",30);
        animales[3] = new Pollito("Jack",15);

        for(int i = 0 ; i<4; i++)
        {

            animales[i].emiteSonido();

        }

        ambulancia.emiteSonido();

    }
}