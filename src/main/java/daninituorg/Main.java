package daninituorg; // Programa desarrollado por Daniel Nitu Velinov.
import java.util.Scanner;

public class Main {

        // Variables del Tamagotchi.
        static int saciedad = 6;
        static int energia = 6;
        static int diversion = 6;
        private static int Math;

    public static void main(String[] args) {
        int opcion;

        do {
            opcion = menuPrincipal();

            switch (opcion) {
                case 1 -> mostrarEstado();
                case 2 -> comer();
                case 3 -> jugar();
                case 4 -> dormir();
                case 5 -> curar();
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
            System.out.println("5. Curar (NUEVA OPCION.");
            System.out.println("------------");
            System.out.println("0. Salir.");
            System.out.println("Seleccione una opcion del menu.");

            while (!lector.hasNextInt()) {
                lector.next();
                System.out.println("Opcion no valida. Intente de nuevo:");
            }

            opcion = lector.nextInt();

            if (opcion < 0 || opcion > 5) {
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
        }

        if (saciedad > 5 && energia > 5 && diversion >5) { // Estado de felicidad.
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

    private static void comer() {
        if (saciedad >= 10) {
            System.out.println("No tengo hambre.");
        } else {
            saciedad = java.lang.Math.min(10, saciedad + 2);
            diversion--;
            mostrarEstado();
        }
    }

    private static void jugar() {
        if (diversion >= 10) {
            System.out.println("Ahora no me apetece jugar.");
        } else {
            diversion = java.lang.Math.min(10, diversion + 4);
            saciedad--;
            energia--;
            mostrarEstado();
        }
    }

    private static void dormir() {
        if (energia >= 10) {
            System.out.println("No tengo sueño.");
        } else {
            energia = java.lang.Math.min(10, energia + 3);
            saciedad -= 2;
            diversion -= 2;
            mostrarEstado();
        }
    }

    private static void curar() {
        System.out.println("Te estás curando...");

        energia = java.lang.Math.min(10, energia + 2);
        diversion = java.lang.Math.min(10, diversion +2);
        saciedad--;
        mostrarEstado();
    }
}