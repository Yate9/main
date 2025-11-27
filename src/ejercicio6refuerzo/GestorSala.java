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
        if(fila<=sala.length){

        }else if(columna<=sala[fila].length){

        }
        return true;
    }
}
