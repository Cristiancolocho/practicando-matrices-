public class ParesImpares {
    /*Elaborar un programa que permita almacenar 12 números enteros en un vector
    llamado “números” y que posteriormente muestre la cantidad de números pares e impares contenidos en el vector. */
    public static void main(String[] args) {
        int[] numeros = new int[12];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int contadorPares = 0;
        int contadorImpares = 0;

        // Ingreso de números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        // Mostrar la cantidad de números pares e impares
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);

        scanner.close();
    }
}
