import java.util.Scanner;

public class ejercicioarrays2 {
    public static void main(String[] args) {

        int[] puntuaciones = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("¿Qué puntuación quieres poner al jugador " + (i + 1) + "?");
            puntuaciones[i] = sc.nextInt();
        }

        int max = puntuaciones[0];
        int min = puntuaciones[0];

        for (int i = 1; i < puntuaciones.length; i++) {
            if (puntuaciones[i] > max) {
                max = puntuaciones[i];
            }
            if (puntuaciones[i] < min) {
                min = puntuaciones[i];
            }
        }

        System.out.println("La puntuación más alta es: " + max);
        System.out.println("La puntuación más baja es: " + min);

    }
}
