import java.util.Scanner;

public class ejerciciosestructuras4 {
    public static void main(String[] args) {

        int[] numeros_usados = new int[100];
        int intentos = 0;

        int numero_secreto = (int) (Math.random() * 100) + 1;
        System.out.println(numero_secreto);

        int numero_usuario;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Adivina un número entre 1 y 100:");
            numero_usuario = teclado.nextInt();

            boolean repetido = false;

            for (int i = 0; i < intentos; i++) {
                if (numero_usuario == numeros_usados[i]) {
                    System.out.println("El número ya ha sido usado. No es el número secreto.");
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                numeros_usados[intentos] = numero_usuario;
                intentos++;

                if (numero_usuario < numero_secreto) {
                    System.out.println("El número secreto es mayor.");
                } else if (numero_usuario > numero_secreto) {
                    System.out.println("El número secreto es menor.");
                }
            }

        } while (numero_usuario != numero_secreto);

        System.out.println("¡Felicidades! Has adivinado el número.");
        System.out.println(intentos);
        teclado.close();
    }
}
