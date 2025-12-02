package ejercicio6refuerzo;
import java.util.Scanner;

public class TaquillaTeatro {
    public static void main(String[] args) {

        char[][]matriz = new char[5][5];
        GestorSala.inicializarmatriz(matriz);
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        int fila;
        int columna;
        while (continuar) {
            GestorSala.mostrarsala(matriz);
            System.out.println("Dime una fila para reservar");
            fila = sc.nextInt();
            System.out.println("Dime una columna para reservar");
            columna = sc.nextInt();
            GestorSala.reservarasiento(matriz,  fila, columna);
            System.out.println("Quieres continuar? true/false");
            continuar = sc.nextBoolean();
        }




    }

}
