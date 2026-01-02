package daninituorg; // Programa desarrollado por Daniel Nitu Velinov.
import java.util.Scanner;

public class Main {

        // Variables del Tamagotchi.
        static int saciedad = 6;
        static int energia = 6;
        static int diversion = 6;

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menuPrincipal();

            switch (opcion) {
                case 1 -> mostrarEstado();
                case 0 -> System.out.println("Saliendo...");
            }
        } while (opcion !=0);
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

    private static void mostrarEstado() {

        if (saciedad == 0 || energia == 0 || diversion == 0) { // Estado de GAME OVER.
            System.out.println("(x_x) :( Game Over ):");
            System.out.println(" /|_|\\");
            System.out.println("  | |");
            return;
        }

        if (saciedad > 5 && energia > 55 && diversion >5) { // Estado de felicidad máxima.
            System.out.println("(•‿•) ¡Estoy feliz!");
            System.out.println(" /|_|\\");
            System.out.println("  | |");
        }

        if (diversion <=4) { // Estado de aburrimiento.
            System.out.println("(-︵-) Estoy aburrido");
            System.out.println(" /|_|\\ ¡Juega conmigo!");
            System.out.println(" / \\");
        }

        else if (energia <= 4) { // Estado de baja energia.
            System.out.println("(-_-) Zzz");
            System.out.println(" /|_|\\");
            System.out.println("  | |");
        }

        else if (saciedad <= 4) { // Estado de hambre.
            System.out.println("(•︵•) ¡Tengo hambre! 🍗");
            System.out.println(" /|x|\\");
            System.out.println("  | |");
        }
    }
}