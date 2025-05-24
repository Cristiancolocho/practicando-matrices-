public class PuntoSilla {
    /*Desarrollar un programa que permita almacenar 12 valores numéricos cualquiera 
    en una matriz y como resultado deberá mostrar si
    existe algún “punto de silla” y el número donde se presenta. */

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Ingreso de valores en la matriz
        System.out.println("Ingrese 12 valores numéricos para la matriz 3x4:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Valor en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Buscar punto de silla
        boolean puntoSillaEncontrado = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int valorActual = matriz[i][j];
                boolean esPuntoSilla = true;

                // Verificar si es el máximo en su fila
                for (int k = 0; k < 4; k++) {
                    if (matriz[i][k] > valorActual) {
                        esPuntoSilla = false;
                        break;
                    }
                }

                // Verificar si es el mínimo en su columna
                if (esPuntoSilla) {
                    for (int k = 0; k < 3; k++) {
                        if (matriz[k][j] < valorActual) {
                            esPuntoSilla = false;
                            break;
                        }
                    }
                }

                if (esPuntoSilla) {
                    System.out.println("Se encontró un punto de silla en la posición [" + i + "][" + j + "] con el valor: " + valorActual);
                    puntoSillaEncontrado = true;
                }
            }
        }

        if (!puntoSillaEncontrado) {
            System.out.println("No se encontró ningún punto de silla en la matriz.");
        }

        scanner.close();
    }
}
