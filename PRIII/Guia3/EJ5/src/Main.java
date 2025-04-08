public class Main {
    public static void main(String[] args) {
        AutomovilManual auto1 = new AutomovilManual("98ERT98",140.0);
        AutomovilAutomatico auto2 = new AutomovilAutomatico("78ADS89");

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        auto1.acelerar(50.0);
        auto2.acelerar(60.0);

        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        auto2.acelerar(200.0);

        System.out.println(auto2.toString());



    }
}