import java.util.Scanner;

public class ejercicio16  {
    public static void main(String[] args) {

        System.out.println("Que clima hace(soleado, lluvioso o nublado)?");
        Scanner sc = new Scanner(System.in);
        String clima = sc.nextLine();
        System.out.println("Que temperatura hace?");
        int temperatura = sc.nextInt();

        if (clima.equals("soleado")){
            if(temperatura > 25){
                System.out.println("Te recomiendo ir a la playa");
            }else if(temperatura >=15&& temperatura <=25){
                System.out.println("Te recomiendo dar un paseo");
            }else
                System.out.println("Te recomiendo ir a la montaña en chaqueta");
        }else if(clima.equals("lluvioso")){
            System.out.println("Te recomiendo ver una peli en casa");
        }else if(clima.equals("nublado")){
            System.out.println("Te recomiendo ir a un museo");
        }else
            System.out.println("No tengo una recomendacion para ese clima");
    }
}