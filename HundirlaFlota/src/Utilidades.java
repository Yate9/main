import java.util.Scanner;

public class Utilidades {

    private static final Scanner SC = new Scanner(System.in);

    /**
     * Devuelve un número entero aleatorio entre min y max (ambos incluidos).
     */
    public static int numeroAleatorio(int min, int max) {
        int numeroAleatorio = (int) (Math.random() * (max - min)) + min;
        return numeroAleatorio;
    }

    /**
     * Convierte una coordenada tipo "A5" en fila.
     * Suponemos que la parte numérica es la fila.
     * Consideramos que EXISTE LA FILA 0.
     * Ejemplo: "A5" -> 5
     *
     * Si la coordenada no es válida, debe devolver -1.
     */
    public static int convertirFila(String coord) {
        if (coord ==null || coord.length() != 2) {
            return -1;
        }
        String partenumerica = coord.substring(1);
        for (int i = 0; i < partenumerica.length(); i++) {
            boolean esdigito = false;
            for (int j = 0; j <= 9; j++) {
                if (partenumerica.charAt(i) ==('0'+j)) {
                    esdigito = true;
                    break;
                }
            }
            if (!esdigito) {
                return -1;
            }
        }
        return Integer.parseInt(partenumerica);
    }


    /**
     * Convierte una coordenada tipo "A5" en columna.
     * La letra indica la columna: A=0, B=1, C=2, ...
     *
     * Si la coordenada no es válida, puede devolver -1.
     */
    public static int convertirColumna(String coord) {
        if (coord==null || coord.length()!=2){
            return -1;
        }
        char letra = coord.charAt(0);

        for (char i='A';i<='Z';i++) {
            if (letra == i){
                return letra-'A';
            }
        }
        return -1;
    }

    /**
     * Lee una línea de texto de la entrada estándar.
     */
    public static String leerLinea() {
        return SC.nextLine();
    }
}