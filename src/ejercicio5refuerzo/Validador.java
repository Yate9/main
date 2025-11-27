package ejercicio5refuerzo;

public class Validador {

    public static String validarNombre(String nombre) {
        if(nombre==null || nombre.isEmpty()){
            return nombre;
        }
        return nombre.substring(0, 1).toUpperCase()+nombre.substring(1).toLowerCase();
    }

    public static boolean validarCorreo(String correo) {
        return correo.contains("@");
    }
    public static boolean validarcontraseña(String contrasena){
        return contrasena.length()>8;
    }
    public static void  mostrarerrores(){
        System.out.println("Error en la contraseña:");
        System.out.println("La contraseña debe tener 8 caracteres al menos");
    }
}
