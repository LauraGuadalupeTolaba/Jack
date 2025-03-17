package Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayDeNumeros = new int[4];
        arrayDeNumeros[0] =12;
        arrayDeNumeros[1] = 3;
        arrayDeNumeros[2] = 4;
        arrayDeNumeros[3] = 15;
        System.out.println(arrayDeNumeros.length);
        for(int i=0; i < arrayDeNumeros.length;i++) {
            System.out.println(arrayDeNumeros[i]);
        }
        System.out.println("-------------------------");
    }

}