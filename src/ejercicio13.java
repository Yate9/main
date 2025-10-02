import java.util.Scanner;

public class ejercicio13  {
    public static void main(String[] args) {


        System.out.println("Que nota has sacado?(0-100)");
        Scanner sc = new Scanner(System.in);
        int nota= sc.nextInt();

        if (nota>=0 && nota<=59){
            System.out.println("Suspenso");
        }else if (nota>=60 && nota<=69){
            System.out.println("Suficiente");
        }else if (nota>=70 && nota<=79){
            System.out.println("Aprobado");
        }else if (nota>=80 && nota<=89){
            System.out.println("Notable");
        }else if (nota>=90 && nota<=100){
            System.out.println("Sobresaliente");
        }else
            System.out.println("No es una nota valida");
    }
}