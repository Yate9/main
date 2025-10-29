import java.util.Scanner;
import java.util.Random;

        public class ejerciciosestructuras3 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("=======================================");
                System.out.println("   AVENTURA: ESCAPE DEL LABORATORIO  ");
                System.out.println("=======================================");
                System.out.println();
                System.out.println("Te despiertas en una habitación fría y metálica.");
                System.out.println("Tu cabeza da vueltas, no recuerdas cómo has llegado aquí...");
                System.out.println("Miras a tu alrededor y ves lo siguiente:");
                System.out.println("- Una puerta cerrada con una cerradura electrónica.");
                System.out.println("- Una mesa con algunos objetos.");
                System.out.println("- Una ventana muy alta y estrecha.");
                System.out.println();
                System.out.println("De fondo escuchas un zumbido eléctrico... parece que alguien más está en el edificio.");
                System.out.println("Tu objetivo es claro: ¡escapa del laboratorio antes de que llegue el guardia!");
                System.out.println();
                System.out.println("Pulsa ENTER para comenzar tu aventura...");
                sc.nextLine();
                boolean haganado = false;
                boolean haperdido = false;
                while(!haganado && !haperdido) {
                    System.out.println("¿Que opcion eliges?");
                    System.out.println("1)Intentar forzar la cerradura");
                    System.out.println("2)Intentar coger una palanca para forzar la puerta");
                    System.out.println("3)Salir por la ventana");
                    Random rand = new Random();
                    int opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("La cerradura tiene tres intentos maximos, intenta adivinar la combinacion");
                            System.out.println("En la cerradura ves que es una combinacion de tres numeros y tiene una pista cada vez que intentas desbloquearla");
                            int solucion = rand.nextInt(900) + 100;
                            System.out.println(solucion);
                            for (int i = 0; i < 3; i++) {
                                System.out.println("Que combinacion de tres numeros quieres poner?");
                                int respuesta = sc.nextInt();
                                if (respuesta == solucion) {
                                    System.out.println("Numero correcto, adivinaste la combinacion!");
                                    haganado = true;
                                    break;
                                } else {
                                    if (respuesta < solucion) {
                                        System.out.println("Prueba un numero mas alto");
                                    } else if (respuesta > solucion) {
                                        System.out.println("Prueba un numero mas bajo");
                                    }
                                }
                            }
                            break;
                        case 2:
                            System.out.println("Coges la palanca y intentas forzar la cerradura");
                            System.out.println("Elige un numero ente el 1 y el 2 para ganar o perder");
                            int solucionpalanca = rand.nextInt(2);
                            int respuestapalanca = sc.nextInt();
                            if (respuestapalanca == solucionpalanca) {
                                System.out.println("Forzaste la puerta y saliste!");
                                haganado = true;
                            } else {
                                System.out.println("La palanca no fue una buena idea, perdiste!");
                                haperdido = true;
                            }
                            break;
                        case 3:
                            System.out.println("Intentas salir por la ventana pero la ventana es muy alta, asi que te caes y el guardia te pilla!1");
                            haperdido = true;
                            break;

                    }
                }
                if (haganado) {
                    System.out.println("¡Has escapado del laboratorio con éxito!");
                } else if (haperdido) {
                    System.out.println("El guardia te encontró... fin de la aventura");
                }

            }
        }