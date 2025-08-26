public class MatrizPocoDensa {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        matriz[0][1] = 5;
        matriz[1][2] = 9;
        matriz[2][0] = 0;

        System.out.println("Elementos no nulos en la matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] != 0) {
                    System.out.println("[" + fila + "," + columna + "]=" + matriz[fila][columna]);
                }
            }
        }
    }
}