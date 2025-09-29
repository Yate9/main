import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Aplicación iniciada");
        System.out.println("Introduce un número entero:");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
