import java.util.Scanner;

public class ejerciciosestructuras1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean seguir;

        do {
            int numeromayor = 0;
            int numeromenor = 999999999;

            System.out.println("Dime cinco números enteros:");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Número " + i + ": ");
                int numero = sc.nextInt();

                if (numero > numeromayor) {
                    numeromayor = numero;
                }
                if (numero < numeromenor) {
                    numeromenor = numero;
                }
            }

            System.out.println("El número más grande es: " + numeromayor);
            System.out.println("El número más pequeño es: " + numeromenor);

            System.out.println("¿Quieres seguir? (si/no)");
            String respuesta = sc.next();
            seguir = respuesta.equalsIgnoreCase("si");

        } while (seguir);
    }
}
