import java.util.Scanner;

public class ejercicio10{
    public static void main(String[] args) {
        System.out.println("Cual es tu peso en kg?");
        Scanner sc = new Scanner(System.in);
        double peso = sc.nextDouble();
        System.out.println("Cual es tu altura en metros?");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);
        if (imc<18.5){
            System.out.println("Bajo peso");
        }else if (imc>=18.5 && imc<25) {
            System.out.println("Peso normal");
        }else if (imc>=25 && imc<30){
            System.out.println("Sobrepeso");
        }else
            System.out.println("Obesidad");

    }
}