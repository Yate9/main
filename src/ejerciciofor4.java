import java.util.Scanner;

public class ejerciciofor4 {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Que nombre tiene tu pokemon?");
        String nombrepokemon = sc.nextLine();
        System.out.println("Que nivel es tu pokemon?");
        int nivelpokemon = sc.nextInt();
        System.out.println("Cuantos niveles quieres que suba?");
        int nivelespokemon = sc.nextInt();
        int subidadenivel = (nivelespokemon + nivelpokemon);
        for(int i=(nivelpokemon+1); i<=(subidadenivel); i++){
            System.out.println(nombrepokemon + " ha subido al nivel"+ i);
            if(i == 16 || i == 36){
                String mensajeevolucion = ("Vaya "+ nombrepokemon +" esta evolucionando");
                System.out.println(mensajeevolucion);
                Thread.sleep(3000);
            }
            Thread.sleep(500);
        }
    }
}