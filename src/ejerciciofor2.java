import java.util.Scanner;

public class ejerciciofor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Como se llama el jugador de futbol?");
        String nombrejugador = sc.nextLine();
        System.out.println("Cuantos partidos ha jugado?");
        int partidos = sc.nextInt();
        System.out.println("Cuantos goles ha marcado?");
        int goles = sc.nextInt();

        if (partidos > 0) {
            double promedio = (double) goles / partidos;
            System.out.println(promedio);

            if (promedio >= 0.8) {
                System.out.println("Promedio de bota de oro me recuerda a Lucas Podolski");
            } else if (promedio >= 0.5 && promedio < 0.8) {
                System.out.println("Que buen jugador");
            } else if (promedio < 0.5 && promedio > 0) {
                System.out.println("Hay que entrenar mas");
            } else {
                System.out.println("Si no juega partidos no se le puede evaluar");
            }
        }
    }
}
