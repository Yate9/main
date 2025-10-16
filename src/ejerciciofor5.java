import java.util.Scanner;

public class ejerciciofor5  {
	public static void main(String[] args) throws InterruptedException {


        int vidapikachu = 100;
        int ataquepikachu = 55;
        int vidagengar = 120;
        int ataquegengar= 50;

        System.out.println("COMIENZA EL COMBATE ENTRE PIKACHU Y GENGAR!!!");

        for (int i = 3; i > 0; i--) {
            vidagengar = vidagengar - ataquepikachu;
            vidapikachu = vidapikachu - ataquegengar;
            System.out.println("Quedan " +i+ " turnos");
            Thread.sleep(1000);
            System.out.println("Pikachu ataca a Gengar y le quita "+ataquepikachu+ " puntos de vida, ahora Gengar tiene: "+vidagengar);
            System.out.println("------------------------------------------------------------------------------------------------------");
            Thread.sleep(5000);
            System.out.println("Gengar ataca a Pikachu y le quita "+ataquegengar+ " puntos de vida, ahora Pikachu tiene: "+vidapikachu)
            ;
            Thread.sleep(5000);
            if(vidapikachu <= 0) {
                System.out.println("Pikachu se ha debilitado!");
                break;
            } else if (vidagengar <= 0) {
                System.out.println("Gengar se ha debilitado!");
                break;
            }
        }

        if (vidapikachu>vidagengar) {
            System.out.println("Pikachu ha ganado el combate!");
        }else if (vidagengar>vidapikachu) {
            System.out.println("Gengar ha ganado el combate!");
        }else  {
            System.out.println("Empate!");
            }
    }
}