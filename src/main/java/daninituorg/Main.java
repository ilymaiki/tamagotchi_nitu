package daninituorg; // Programa desarrollado por Daniel Nitu Velinov.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcion = menuPrincipal();
        System.out.println("Opcion elegida: " +opcion);
    }

    private static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== ¿Que quiere hacer? ===");
            System.out.println("1. Estado.");
            System.out.println("2. Comer.");
            System.out.println("3. Jugar.");
            System.out.println("4. Dormir.");
            System.out.println("------------");
            System.out.println("0. Salir.");
            System.out.println("Seleccione una opcion del menu.");

            while (!lector.hasNextInt()) {
                lector.next();
                System.out.println("Opcion no valida. Intente de nuevo:");
            }

            opcion = lector.nextInt();

            if (opcion < 0 || opcion > 4) {
                System.out.println("Opcion fuera de rango");
            }

        } while (opcion < 0 || opcion > 4);
        return opcion;
    }
}