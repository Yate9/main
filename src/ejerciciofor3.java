import java.util.Scanner;

public class ejerciciofor3  {
    public static void main(String[] args) {
        String director1 = ("Christopher Nolan");
        String director2 = ("Quentin Tarantino");
        String director3 = ("Guillermo del Toro");
        System.out.println("Elige tu director favorito:");
        System.out.println(director1);
        System.out.println(director2);
        System.out.println(director3);
        Scanner sc = new Scanner(System.in);
        String directorusuario = sc.nextLine();

        switch (directorusuario) {
            case "Christopher Nolan":
                System.out.println("Te recomiendo la pelicula inception");
                System.out.println("Pero te gustan las peliculas de ciencia ficcion?(si o no)");
                String respuestausuario = sc.nextLine();
                if (respuestausuario.equals("si")) {
                    System.out.println("Genial, disfrutaras de sus mundos complejos");
                } else if (respuestausuario.equals("no")) {
                    System.out.println("Entonces te recomiendo The dark Knight que es mas de accion");
                }

                break;
                case "Guillermo del Toro":
                    System.out.println("Te recomiendo la pelicula Pulp fiction");
                    System.out.println("Pero te gustan los dialogos ingeniosos?(si o no)");
                    String respuestausuario2 = sc.nextLine();
                    if (respuestausuario2.equals("si")) {
                        System.out.println("Perfecto, te encantara el guion!");
                    }else if (respuestausuario2.equals("no")) {
                        System.out.println("No te preocupes, la acción y la trama también son excelentes");
                    }

                    break;
                    case "Quentin Tarantino":
                        System.out.println("Te recomiendo la pelicula  El Laberinto del Fauno");
                        System.out.println("Pero te gustan las peliculas de fantasia oscura?(si o no)");
                        String respuestausuario3 = sc.nextLine();
                        if (respuestausuario3.equals("si")) {
                            System.out.println("Te sumergiras en un mundo magico y inolvidable");
                        }else if (respuestausuario3.equals("no")) {
                            System.out.println("Pues te recomiendo Pacific rim para una dosis de accion con monstruos gigantes");
                        }
                        break;
                        default:
                            System.out.println("Director no encontrado");


        }
    }
}