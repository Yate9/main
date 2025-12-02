package ejercicio6refuerzo;

public class GestorSala {

    public static void inicializarmatriz(char[][]matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]='L';
            }
        }
    }
    public static void mostrarsala(char[][]sala){
        for(int i=0;i<sala.length;i++){
            for(int j=0;j<sala[i].length;j++){
                System.out.print(sala[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean reservarasiento(char[][]sala, int fila, int columna){
        if(fila<=sala.length && fila>=0 &&  columna<=sala.length  && columna>=0){
            if (sala[fila][columna]=='L'){
                sala[fila][columna]='X';
                return true;
            }else {
                System.out.println("El sitio que has elegido esta ocupado");
                return false;
            }
        }else{
        return false;

        }
    }
}
