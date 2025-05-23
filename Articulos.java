public class Articulos {
    /*Elaborar un programa que permita almacenar 10 números cualquiera
en un vector llamado “números” y que posteriormente muestre el
mayor y el menor valor ingresado. */
    public static void main(String[] args) {
        int[] numeros = new int[10];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        // Ingreso de números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar el mayor y menor valor ingresado
        System.out.println("El mayor valor ingresado es: " + mayor);
        System.out.println("El menor valor ingresado es: " + menor);

        scanner.close();
    }
}
