import java.util.Scanner;
public class ejerciciosestructuras2  {
	public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);
        int dinerousuario = 10;
        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1.Consultar Saldo");
            System.out.println("2.Ingresar dinero");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Salir");
            int opcionusuario = sc.nextInt();
            switch (opcionusuario){
                case 1:
                    System.out.println("Usted tiene un saldo de: "+dinerousuario+"€");
                    break;
                case 2:
                    System.out.println("Cuanto dinero quieres ingresar?");
                    int dineroingresar = sc.nextInt();
                    dinerousuario = dinerousuario+dineroingresar;
                    System.out.println(dineroingresar+"€ ingresados en tu cuenta");
                    break;
                case 3:
                    System.out.println("Cuanto dinero quieres retirar?");
                    int dineroretirar = sc.nextInt();
                    dinerousuario = dinerousuario-dineroretirar;
                    System.out.println(dineroretirar+"€ retirados");
                    break;
                case 4:
                    seguir = false;
                    break;
            }
        }while (seguir);
    }
}