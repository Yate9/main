import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Dime cuantos cm va a medir el primer lado de tu triangulo");
        Scanner sc = new Scanner(System.in);
        double ladoA = sc.nextDouble();
        System.out.println("Dime cuantos cm va a medir el segundo lado de tu triangulo");
        double ladoB = sc.nextDouble();
        System.out.println("Por ultimo dime cuantos cm medira el ultimo lado de tu triangulo");
        double ladoC = sc.nextDouble();

        if (ladoA==ladoB && ladoA==ladoC){
            System.out.println("Tu triangulo es equilatero");
        }else if (ladoA!=ladoB && ladoA!=ladoC && ladoB!=ladoC){
            System.out.println("Tu triangulo es escaleno");
        }else
            {
            System.out.println("La triangulo es isosceles");
            }

    }
}