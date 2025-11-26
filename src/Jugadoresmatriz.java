import java.util.Scanner;

public class Jugadoresmatriz {
    public static void main(String[] args) {

        String[][] jugadoresiniciales = new String[50][4];
        String[][] jugadores = {
                {"Jude Bellingham", "21", "Centrocampista", "Real Madrid"},
                {"Vini Jr.", "24", "Delantero", "Real Madrid"},
                {"Federico Valverde", "26", "Centrocampista", "Real Madrid"},
                {"Antonio Rüdiger", "31", "Defensa", "Real Madrid"},
                {"Thibaut Courtois", "32", "Portero", "Real Madrid"},
                {"Luka Modric", "39", "Centrocampista", "Real Madrid"},
                {"Dani Carvajal", "32", "Defensa", "Real Madrid"},
                {"Eduardo Camavinga", "22", "Centrocampista", "Real Madrid"},

                {"Lamine Yamal", "17", "Delantero", "FC Barcelona"},
                {"Gavi", "20", "Centrocampista", "FC Barcelona"},
                {"Pedri", "22", "Centrocampista", "FC Barcelona"},
                {"Robert Lewandowski", "36", "Delantero", "FC Barcelona"},
                {"Jules Koundé", "26", "Defensa", "FC Barcelona"},
                {"Marc-André ter Stegen", "32", "Portero", "FC Barcelona"},
                {"Ronald Araújo", "25", "Defensa", "FC Barcelona"},
                {"Frenkie de Jong", "27", "Centrocampista", "FC Barcelona"},

                {"Jesús Navas", "38", "Defensa", "FC Sevilla"},
                {"Youssef En-Nesyri", "27", "Delantero", "FC Sevilla"},
                {"Lucas Ocampos", "30", "Delantero", "FC Sevilla"},
                {"Marcos Acuña", "33", "Defensa", "FC Sevilla"},
                {"Nemanja Gudelj", "32", "Centrocampista", "FC Sevilla"},
                {"Dodi Lukebakio", "27", "Delantero", "FC Sevilla"},
                {"Ørjan Nyland", "34", "Portero", "FC Sevilla"},
                {"Sergio Ramos", "38", "Defensa", "FC Sevilla"},

                {"Nico Williams", "22", "Delantero", "Athletic de Bilbao"},
                {"Iñaki Williams", "30", "Delantero", "Athletic de Bilbao"},
                {"Oihan Sancet", "24", "Centrocampista", "Athletic de Bilbao"},
                {"Unai Simón", "27", "Portero", "Athletic de Bilbao"},
                {"Daniel Vivian", "25", "Defensa", "Athletic de Bilbao"},
                {"Óscar de Marcos", "35", "Defensa", "Athletic de Bilbao"},
                {"Ander Herrera", "35", "Centrocampista", "Athletic de Bilbao"},
                {"Gorka Guruzeta", "28", "Delantero", "Athletic de Bilbao"},

                {"Lucas Pérez", "36", "Delantero", "RCD Deportivo"},
                {"Yeremay Hernández", "22", "Centrocampista", "RCD Deportivo"},
                {"Diego Villares", "28", "Centrocampista", "RCD Deportivo"},
                {"Pablo Martínez", "35", "Defensa", "RCD Deportivo"},
                {"Germán Parreño", "38", "Portero", "RCD Deportivo"},
                {"David Mella", "19", "Delantero", "RCD Deportivo"},
                {"Miguel Loureiro", "28", "Defensa", "RCD Deportivo"},
                {"Marcos Soriano", "27", "Centrocampista", "RCD Deportivo"}
        };

        for (int i = 0; i < jugadores.length; i++) {
            for (int j = 0; j < 4; j++) {
                jugadoresiniciales[i][j] = jugadores[i][j];
            }
        }
        for (int i = 0;i<jugadoresiniciales.length; i++){
            for (int j = 0; j < 4; j++) {
                if (jugadoresiniciales[i][j]==null){
                    System.out.println("La posicion: "+(i+1)+" numero: "+(j+1)+" esta libre");
            }



            }
        }
        boolean verdad= true;
        do {
            System.out.println("Elige una opcion de las sguientes:");
            System.out.println("a) Ingresar Jugador");
            System.out.println("b) Buscar jugadores de equipo");
            System.out.println("c) Buscar jugador");
            System.out.println("d) Eliminar Jugador");
            System.out.println("e) Ver informacion");
            System.out.println("f) Salir");
            Scanner sc = new Scanner(System.in);
            String letra = sc.nextLine();
            switch (letra){
                case "a":
                    System.out.println("Que jugador quieres ingresar?");
                    String jugadoringresar = sc.nextLine();
                    for (int i = 0; i < jugadoresiniciales.length; i++) {
                        for (int j = 0; j < 4; j++) {
                            if (jugadoresiniciales[i][j]== null){
                                System.out.println("La posicion: "+(i+1)+" numero: "+(j+1)+" esta libre");
                                System.out.println("Que nombre quieres ponerle?");
                                int nombreingresado = sc.nextInt();
                                System.out.println("Que edad quieres ponerle?");
                                int edadingresado = sc.nextInt();
                                System.out.println("Que posicion quieres ponerle?");
                                int posicioningresado = sc.nextInt();
                                System.out.println("Que equipo quieres ponerle?");
                                int equipoingresado = sc.nextInt();

                            }

                        }
                    }
                    break;
                case "b":
                    System.out.println("Que equipo quieres buscar?");
                    String equipobuscado  = sc.nextLine();
                    for (int i = 0; i < jugadoresiniciales.length; i++){
                        if (jugadoresiniciales[i][3].equals(equipobuscado)){
                            System.out.println(jugadoresiniciales[i][0]);
                        }
                    }
                    break;
                case "c":
                    System.out.println("opcion c");
                    break;
                case "d":
                    System.out.println("opcion d");
                    break;
                case "e":
                    System.out.println("opcion e");
                    break;
                case "f":
                    System.out.println("Saliendo del programa");
                    verdad=false;
                    break;
            }
        }while (verdad);
    }
}
