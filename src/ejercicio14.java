import javax.swing.*;
import java.util.Scanner;

public class ejercicio14  {
    public static void main(String[] args) {

        System.out.println("Eres un empleado? (responde con True o False)");
        Scanner sc = new Scanner(System.in);
        Boolean empleado = sc.nextBoolean();
        System.out.println("Que nivel de acceso tienes?(Del 1 al 5)");
        int nivel = sc.nextInt();

        if (empleado == false){
            System.out.println("Acceso denegado");
        } else if (empleado==true) {
            System.out.println("Acceso activo");
            if (nivel <=4){
                System.out.println("Acceso limitado");
            }else {
                System.out.println("Acceso total");

        }
    }
}}