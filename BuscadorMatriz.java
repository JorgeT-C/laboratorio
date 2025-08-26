import java.util.Scanner;

public class BuscadorMatriz {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para buscar en la matriz: ");
        int numeroBuscado = scanner.nextInt();

        boolean encontrado = false;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                if (matriz[fila][columna] == numeroBuscado) {
                    System.out.println("Número encontrado en [" + fila + "][" + columna + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("Número no encontrado en la matriz.");
        }

        scanner.close();
    }
}