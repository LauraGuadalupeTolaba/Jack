import ejerteorico.A;
import ejerteorico.C;

public class Main {
    public static void main(String[] args) {
        C datoc = new C();
        datoc.m3();
        datoc.m2();
        datoc.m1();
        System.out.println("El valor de los atributos es: \n "+ " varC1="+datoc.varC1+ " var1="+ datoc.var1 +
                " var2="+ datoc.var2 + " varB1=" + datoc.varB1);

        A datoX = new C();
        datoX.m3();
        datoX.m2();
        datoc.m1();
        System.out.println("El valor de los atributos es: \n "+ " varC1="+
                datoX.varC1 +
                " var1="+ datoX.var1 + " var2="+ datoX.var2 +" varB1=" + datoX.varB1);

    }
}