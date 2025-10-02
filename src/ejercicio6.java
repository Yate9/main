import java.util.Scanner;

public class ejercicio6  {
    public static void main(String[] args) {
        System.out.println("Ey tio que edad tienes?");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        double precio = 10 ;
        System.out.println("El precio del evento es de " + precio+"€");

        if (edad < 5) {
            System.out.println("Tienes " + edad + " años asi que entras gratis");
        }else if (edad>=5 && edad<=12) {
            precio = precio * 0.5;
            System.out.println("Tienes " + edad + " años asi que tienes un 50% de descuento, la entrada te vale " + precio);
        }else if  (edad>=13 && edad<=64) {
            System.out.println("Tienes " + edad + " años asi que no tienes descuento, la entrada te vale " + precio);
        }else if (edad>=65){
            precio = precio *0.25;
            System.out.println("Tienes "+edad+" años asi que tienes un descuento del 75%, la entrada te vale "+precio);
        }
    }
}
