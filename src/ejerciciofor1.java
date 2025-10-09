import java.util.Scanner;

public class ejerciciofor1 {
    public static void main(String[] args) {

        System.out.println("A que velocidad vas(numero entero)");
        Scanner sc = new Scanner(System.in);
        int velocidad = sc.nextInt();

        boolean excesodevelocidad;

        if (velocidad > 120) {
            excesodevelocidad = true;
        } else
            excesodevelocidad = false;
        {

        if (excesodevelocidad == true) {
            System.out.println("Vas muy rapido");
        } else if (excesodevelocidad == false) {
            System.out.println("Vas a una buena velocidad");
        }
        }
    }
}
