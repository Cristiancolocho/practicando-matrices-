public class Transpuestos {
    /*Desarrollar un programa que permita almacenar 9 valores numéricos 
    cualquiera en una matriz y que posteriormente muestre su transpuesta. */

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Ingreso de valores en la matriz
        System.out.println("Ingrese 9 valores numéricos para la matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Calcular y mostrar la transpuesta
        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
