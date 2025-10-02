import java.util.Scanner;
public class ejercicio12  {
    public static void main(String[] args) {
        System.out.println("Hey elige una opcion por su numero");
        System.out.println("1. Consultar Saldo");
        System.out.println("2. Ingresar Dinero");
        System.out.println("3. Retirar Dinero");
        System.out.println("4. Salir");

        int saldo= 10;

        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();

        if (opcion==1){
            System.out.println("Tiene "+saldo+"€ en la cuenta");
        }else if (opcion==2){
            System.out.println("Cuanto dinero quiere ingresar?");
        }else if (opcion==3){
            System.out.println("Cuanto dinero quiere retirar?");
        }else if (opcion==4){
            System.out.println("Sesion finalizada");
        }else
            System.out.println("Opcion no valida");
    }
}