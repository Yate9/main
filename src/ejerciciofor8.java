import java.util.Scanner;

public class ejerciciofor8  {
    public static void main(String[] args) {

        boolean verdad = true;

        do {
            System.out.println("*** Pokedéx Interactiva");
            System.out.println("1)Buscar pokemon por su nombre");
            System.out.println("2)Comparar estadisticas de pokemon");
            System.out.println("3)Salir");
            Scanner sc = new Scanner(System.in);
            int opcionusuario = sc.nextInt();
            switch (opcionusuario) {
                case 1:
                    System.out.println("Dime el nombre de un pokemon");
                    String pokemonusuario = sc.next();
                    switch (pokemonusuario){
                        case "Pikachu":
                            System.out.println("Pikachu tiene poca vida pero ataques rapidos");
                            break;
                        case "Gyarados":
                            System.out.println("Gyarados tiene buena vida y buenos ataques");
                            break;
                        case "Mewto":
                            System.out.println("Mewto es el pokemon mas fuerte, tiene ataques psiquicos!");
                            break;
                        default:
                            System.out.println("No conozco ese pokemon");
                            break;
                        }
                        break;
                case 2:
                    int ataquegroudon = 150;
                    int ataquekyogre = 120;
                    int defensagroudon = 100;
                    int defensakyogre = 130;
                    if (ataquegroudon>ataquekyogre) {
                        System.out.println("Groudon tiene mas ataque que kyogre");
                    }else if (ataquekyogre>ataquegroudon) {
                        System.out.println("Kyogre tiene mas ataque que Groudon");
                    }else if (ataquegroudon==defensagroudon) {
                        System.out.println("Kyogre y Groudon tienen el mismo ataque");
                    }else if (defensagroudon>defensakyogre) {
                        System.out.println("Groudon tiene mas defensa que kyogre");
                    }else if (defensagroudon<defensakyogre) {
                        System.out.println("Kyogre tiene mas defensa que groudon");
                    }else
                        System.out.println("Groudon tiene la misma defensa que Kyogre");
                    break;
                case 3:
                    System.out.println("Saliendo de la Pokedex");
                    verdad = false;
                    break;
                default:
                    System.out.println("Elige una opcion valida");
                    break;
            }
        }while (verdad);
    }
}