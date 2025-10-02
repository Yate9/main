import java.util.Scanner;
public class ejercicio9  {
	public static void main(String[] args) {
        String contraseña = "JavaEsGenial";
        System.out.println("Dime una contraseña");
        Scanner sc = new Scanner(System.in);
        String contraseñausuario = sc.nextLine();

        if (contraseña .equals (contraseñausuario)){
            System.out.println("Contraseña correcta, inicio de sesion realizado");
        }else
        System.out.println("Contraseña incorrecta, acceso denegado");

    }
}