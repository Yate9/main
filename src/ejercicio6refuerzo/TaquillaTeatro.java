package ejercicio6refuerzo;
import java.util.Scanner;

public class TaquillaTeatro {
    public static void main(String[] args) {

        char[][]matriz = new char[5][5];
        GestorSala.inicializarmatriz(matriz);
        GestorSala.mostrarsala(matriz);
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una fila");
        int fila = sc.nextInt();
        System.out.println("Dime una columna");
        int columna = sc.nextInt();

        GestorSala.reservarasiento(matriz,  fila, columna);


    }

}
