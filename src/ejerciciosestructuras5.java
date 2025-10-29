import java.util.Scanner;

public class ejerciciosestructuras5  {
    public static void main(String[] args) {

        System.out.println("Iniciamos programa");
        double acumuladorNotas = 0;
        int contadoraNotas=0;
        while(true){
            Scanner kb = new Scanner(System.in);
            double nota;
            //do while que valida nota, si no es valida el flujo se queda dentro del do while
            do{
                System.out.println("Introduzca nota:");
                //asignamos nota
                nota = kb.nextDouble();
                //si es -1 salimos del do while, tendríamos que salir del while tambien
                if(nota == -1){
                    break;
                }
                System.out.println("Introduzca -1 para parar la ejecucion");
            }while(nota < 0 || nota > 10);
            //salimos del while si es -1
            if(nota == -1){
                break;
            }
            //usamos para saber cuantas notas válidas son introducidas
            contadoraNotas++;
            acumuladorNotas += nota;
            System.out.println("Nota introducida: " + nota + " => nota acumulada = " + acumuladorNotas);
        }
        //solo se ejecuta cuando salimos del while y calcula la media de notas
        System.out.println("La media es: " + (acumuladorNotas/contadoraNotas));
    }
}