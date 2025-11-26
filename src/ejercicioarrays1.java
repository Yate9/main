import java.util.Scanner;

public class ejercicioarrays1 {
    public static void main(String[] args) {
        System.out.println("Cuantos nombres quieres poner?");
        Scanner sc = new Scanner(System.in);
        int numeronombres = sc.nextInt();
        String[] nombres = new String[numeronombres];

        for (int i = 0; i < numeronombres; i++) {
            System.out.println("Introduza el "+(i+1)+" nombre que quieres poner:");
            nombres[i] = sc.next();
        }
        for  (int i = numeronombres-1; i > -1; i--) {
            System.out.println(nombres[i]);
        }
    }
}