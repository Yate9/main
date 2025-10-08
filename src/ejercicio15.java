import java.util.Scanner;

public class ejercicio15  {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tres numeros enteros");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();

        if (numero1>numero2 && numero1>numero3) {
            System.out.println(numero1+ " es el numero mas grande que has puesto");
        }else if (numero2>numero1 && numero2>numero3) {
            System.out.println(numero2+ " es el numero mas grande que has puesto");
        }else
            System.out.println(numero3+ " es el numero mas grande que has puesto");
    }
}