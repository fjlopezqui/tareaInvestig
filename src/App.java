import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
      
        // ==================================================================================
        // EJERCICIO 3 - Evaluación de rendimiento académico
        // ==================================================================================
        System.out.println("=== EJERCICIO 3 - Evaluacion de rendimiento academico === ");
        int estudiantes = 5;
        int cursos = 3;
        // Matriz para almacenar calificaciones de cada estudiante en cada curso
        double[][] calificaciones = new double[estudiantes][cursos];
        // Arreglo para almacenar el promedio de cada estudiante
        double[] promediosEstudiantiles = new double[estudiantes];

        // Ingreso de calificaciones
        System.out.println("Ingrese las calificaciones de los estudiantes:");
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < cursos; j++) {
                System.out.print("  Calificación del curso " + (j + 1) + ": ");
                calificaciones[i][j] = entrada.nextDouble();
                // Acumular calificaciones para calcular el promedio
                promediosEstudiantiles[i] += calificaciones[i][j];
            }
            // Calcular promedio del estudiante
            promediosEstudiantiles[i] /= cursos;
        }

        // Contadores para estudiantes aprobados y reprobados
        int contadorAprobados = 0;
        int contadorReprobados = 0;

        // Mostrar resumen y clasificar estudiantes
        System.out.println("Resumen de calificaciones y rendimiento:");
        for (int i = 0; i < estudiantes; i++) {
            System.out.print("\nEstudiante " + (i + 1) + ": ");
            for (int j = 0; j < cursos; j++) {
                System.out.print(calificaciones[i][j] + "    ");
                if (j == cursos - 1) {
                    System.out.print(" | Promedio: " + String.format("%.2f", promediosEstudiantiles[i]));
                }
            }

            // Clasificar estudiante según su promedio (aprobado >= 61)
            if (promediosEstudiantiles[i] >= 61) {
                contadorAprobados++;
            } else {
                contadorReprobados++;
            }
        }

        // Mostrar totales finales
        System.out.println("\n\nTotal de estudiantes aprobados: " + contadorAprobados);
        System.out.println("Total de estudiantes reprobados: " + contadorReprobados);
        
        entrada.close();
    }
}