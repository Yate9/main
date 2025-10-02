import java.util.Scanner;
public class ejercicio11  {
    public static void main(String[] args) {

        System.out.println("Dime un año");
        Scanner sc = new Scanner(System.in);
        int anho = sc.nextInt();

        if (anho%4==0 && anho%100!=0){
            System.out.println("El año es bisiesto");
        }else if (anho%400==0){
            System.out.println("El año es bisiesto");
        }else
            System.out.println("No es un año bisiesto");
    }
}