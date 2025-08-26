import java.util.Scanner;

public class GestionNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();
        int[] notas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
            while (notas[i] < 0 || notas[i] > 100) {
                System.out.print("Nota inválida. Ingrese un valor entre 0 y 100: ");
                notas[i] = scanner.nextInt();
            }
        }
        int suma = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < n; i++) {
            suma += notas[i];
            if (notas[i] >= 70) {
                aprobados++;
            } else {
                reprobados++;
            }
        }
        double promedio = (double) suma / n;
        System.out.println("\n--- Resultados ---");
        System.out.println("Promedio de la clase: " + promedio);
        System.out.println("Cantidad de alumnos aprobados: " + aprobados);
        System.out.println("Cantidad de alumnos reprobados: " + reprobados);
        if (promedio >= 90) {
            System.out.println("¡Excelente clase!");
        } else if (promedio >= 70) {
            System.out.println("Buen rendimiento.");
        } else {
            System.out.println("Necesitamos mejorar.");
        }

        scanner.close();
    }
}