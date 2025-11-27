package ejercicio5refuerzo;

import java.util.Scanner;

public class Registrousuario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();
        nombre =Validador.validarNombre(nombre);
        String contrasena;
        String correo;
        do {
            System.out.println("Dime un correo");
            correo = sc.nextLine();
            if (!Validador.validarCorreo(correo)) {
                System.out.println("No es valido");
            }
        }while(!Validador.validarCorreo(correo));


        do {
            System.out.println("Dime una contraseña");
            contrasena = sc.nextLine();
            if (!Validador.validarcontraseña(contrasena)) {
                Validador.mostrarerrores();
                }
        }while (!Validador.validarcontraseña(contrasena));
        System.out.println("Registro completado: Tu usuario "+nombre+" registrado con el correo "+correo);
        }




    }

