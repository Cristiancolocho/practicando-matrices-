public class Frutas {
    /*Desarrollar un programa que permita almacenar 10 nombres de frutas en un vector 
    llamando “frutas” y que posteriormente muestre el contenido del vector 
    pero en forma inversa, es decir, el último elemento ingresado deberá aparecer primero
    y el primero en el último lugar */
    
    public static void main(String[] args) {
        String[] frutas = new String[10];
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Ingreso de nombres de frutas
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Ingrese el nombre de la fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        // Mostrar el contenido del vector en forma inversa
        System.out.println("Frutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }

        scanner.close();
    }
}
