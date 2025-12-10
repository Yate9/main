import java.util.concurrent.LinkedTransferQueue;

public class Tablero {

    /**
     * Crea un tablero de barcos y lo inicializa a -1 (sin barco).
     * En las posiciones del barco, guardaremos su id más adelante.
     * Lo devuelve como resultado!
     */
    public static int[][] crearTableroBarcos(int filas, int columnas) {
        int[][] tablerobarcos = new int[filas][columnas];
        for (int i = 0; i < tablerobarcos.length; i++) {
            for (int j = 0; j < tablerobarcos.length; j++) {
                tablerobarcos[i][j]= -1;
            }
        }
            return tablerobarcos;
    }

    /**
     * Crea un tablero de disparos y lo inicializa a '~' (no disparado).
     */
    public static char[][] crearTableroDisparos(int filas, int columnas) {
        char [][]tablerodisparos = new char [filas][columnas];
        for (int i = 0 ; i < tablerodisparos.length; i++) {
            for (int j = 0; j < tablerodisparos[i].length; j++) {
                tablerodisparos[i][j] = '~';
            }
        }
        return tablerodisparos;
    }

    /**
     * Muestra un tablero de disparos (del jugador o de la CPU).
     * Recuerda que tienes que imprimir también el número de fila, y el número de columna,
     * como un tablero real.
     *
     * Recibe como entrada el tablero a imprimir, no devuelve nada de salida, simplemente lo imprime.
     */
    public static void mostrarTableroDisparos(char[][] tableroDisparos) {
        for (int i = tableroDisparos.length-1; i >= 0; i--) {
            System.out.print(i);
            for (int j = 0; j < tableroDisparos.length; j++) {
                System.out.print(tableroDisparos[i][j]);
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < tableroDisparos.length; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    /**
     * Muestra el tablero del jugador con sus barcos y el estado de disparos
     * de la CPU (agua, tocado, hundido). EL objetivo de esta función es mostrar
     * al usuario sus barcos junto a los disparos del enemigo (en un sólo tablero).
     *
     * tableroBarcos: IDs de barcos o -1
     * tableroDisparosCPU: qué ha disparado la CPU sobre este tablero
     *
     * Por ejemplo, si en la posición 1,1:
     * - hay agua y no ha habido disparos, '.'.
     * - hay agua y ha habido disparo, '~'.
     * - había un barco y hubo un disparo, pero el barco sigue activo: 'T'
     * - había un barco y hubo un disparo, el barco está hundido: 'H'
     * - hay un barco, el barco "1": 1
     */
    public static void mostrarTableroConBarcos(int[][] tablerobarcos, char[][] tablerodisparoscpu) {

        int filas = tablerobarcos.length;
        int columnas = tablerobarcos[0].length;
        for (int i=filas-1 ; i >=0; i--) {
            System.out.print(i+" ");
            for (int j = 0; j < columnas; j++) {
                int barco = tablerobarcos[i][j];
                char disparo = tablerodisparoscpu[i][j];
                char simbolo;
                if (barco == -1) {
                    if (disparo == 'A') simbolo = 'A';
                    else if (disparo == 'T') simbolo = 'T';
                    else if (disparo == 'H') simbolo = 'H';
                    else simbolo = '~';
                } else {
                    if (disparo == '~') {
                        simbolo = (char) ('0' + barco);
                    } else {
                        simbolo = disparo;
                    }
                }
                System.out.print(simbolo + " ");
            }
            System.out.println();
        }
        System.out.print("  ");
        for (int i = 0; i < columnas; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Comprueba si una coordenada está dentro del tablero. Devuelve "true" si está, "false" si no está.
     */
    public static boolean esCoordenadaValida(int fila, int columna, int filas, int columnas) {
        return fila >= 0 && fila < filas && columna >= 0 && columna < columnas;
    }
}