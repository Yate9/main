import java.util.Scanner;

public class practicocontarletras {
    public static void main(String[] args){


        System.out.println("Dime una palabra");
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();

        char[] letras = new char[palabra.length()];

        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
        }
        System.out.println("Las letras son: ");
        for (int i = 0; i < letras.length; i++) {
            System.out.println("Posicion "+i+": "+letras[i]);
        }
        boolean verdad = true;
        while(true){
            System.out.println("Dime una letra a comprobar");
            Character letracomprobar = sc.next().charAt(0);
            for(int i = 0; i < letras.length; i++){
                if (letracomprobar.equals(letras[i])){
                    System.out.println("En la posicion "+i+" la letra "+letras[i]+" se repite" );
                }
            }
            verdad = false;
        }

    }
}