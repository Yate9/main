import java.util.Scanner;

public class ejercicio5  {
    public static void main(String[] args) {
        System.out.println("Ey pon un precio");
        Scanner sc = new Scanner(System.in);
        double precio = sc.nextDouble();
        if (precio >= 100)
            precio = precio * 0.85;
      System.out.println(precio);
    }
}