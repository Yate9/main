import java.util.Scanner;

public class ejercicio5  {
    public static void main(String[] args) {
        System.out.println("Ey pon un precio");
        double nivelalcohol = 0.0;
        int preciochupito = 3;
        double preciocaña = 1.8;
        double preciocombinado = 8;
        double nivelchupito = 0.25;
        double nivelcaña = 0.1;
        double nivelcombinado = 0.4;


        System.out.println("Como te llamas?");
        Scanner sc = new Scanner(System.in);
        String nombreusuario = sc.nextLine();
        System.out.println("Que edad tienes");
        int edadcliente = sc.nextInt();
        System.out.println("Cuanto dinero tienes?");
        double dinerocliente = sc.nextDouble();


        System.out.println("El cliente de nombre: " + nombreusuario +"con edad"+ edadcliente +"Tiene" + dinerocliente+"€");

        if (edadcliente<=17) {
            System.out.println("No puedes entrar eres menor de edad");;
            System.exit(0);
        } else {
            System.out.println("Puedes entrar, que eres mayor de edad");
            System.out.print("Que nivel de alcohol tienes?");
            double nivelalalcohol = sc.nextDouble();
            if (nivelalalcohol>=1.2) {
                System.out.println("No puedes entrar, vas muy borracho");
                System.exit(0);
            } else
                System.out.println("Puedes pasar");
            while(dinerocliente >= 1.8) {
                System.out.print("Que quieres e beber?");
                System.out.println(dinerocliente);
            }
            }
        }
   }
