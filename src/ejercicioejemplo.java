import java.util.concurrent.ThreadLocalRandom;
import  java.util.Scanner;

public class ejercicioejemplo  {
    public static void main(String[] args) {

    int numero = ThreadLocalRandom.current().nextInt(0, 100);
    boolean condicion = true;
    int intentos = 0;
    System.out.println(numero);
    Scanner sc = new Scanner(System.in);

    while(condicion){
        System.out.println("Adivina el numero del 0 al 100");
        int acierto = sc.nextInt();
        intentos++;

        if (acierto==numero){
            System.out.println("Enhorabuena has adivinado el numero!");
            condicion = false;
        }else if (intentos == 3){
            condicion = false;
            System.out.println("Ya no te quedan intentos, el numero era: " + numero);
        }else {
            System.out.println("No es correcto, te quedan" +(3-intentos)+" intentos");
        }
    }
    }
}