public class Numeros {
    /*Elaborar un programa que permita almacenar 12 números enteros  en un vector 
    llamado “números” y que posteriormente muestre el promedio de los números ingresados. */

    public static void main(String[] args) {
        int[] numeros = new int[12];
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int suma = 0;

        // Ingreso de números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        // Calcular y mostrar el promedio
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }
}
