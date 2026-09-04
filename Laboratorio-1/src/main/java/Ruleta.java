import java.util.Random;
import java.util.Scanner;

public class Ruleta {

    public static final int MAX_HISTORIAL = 100;
    public static int[] historialNumeros = new int[MAX_HISTORIAL];
    public static int[] historialApuestas = new int[MAX_HISTORIAL];
    public static boolean[] historialAciertos = new boolean[MAX_HISTORIAL];
    public static int historialSize = 0;
    public static Random rng = new Random();
    public static int[] numerosRojos = {
            1, 3, 5, 7, 9, 12, 14, 16, 18,
            19, 21, 23, 25, 27, 30, 32, 34, 36
    };


    public static void main(String[] args) {
        menu();
    }


    public static void menu() {
        Scanner in = new Scanner(System.in);
        int option;

        do {
            mostrarMenu();
            option = leerOpcion(in);
            ejecutarOpcion(option,in);
        } while (option != 3);

        in.close();
    }


    public static void mostrarMenu() {
        System.out.println("\nRuleta - Casino Black Cat");
        System.out.println("1.iniciar ronda");
        System.out.println("2.Ver estadisticas");
        System.out.println("3.Salir");
        System.out.print("Seleccione una opcion");
    }


    public static int leerOpcion(Scanner in) {
        int option = -1;
        try {
            option = Integer.parseInt(in.nextLine().trim());
        }   catch (NumberFormatException e) {
            System.out.println("Debes ingresar un numero");
        }
// TODO: Leer y retornar la opción ingresada.
        return option;
    }

    public static void ejecutarOpcion(int opcion, Scanner in) {
// TODO: Ejecutar la acción asociada a la opción.
    }


    public static void iniciarRonda(Scanner in) {
// TODO: Implementar el flujo completo de una ronda.
    }


    public static char leerTipoApuesta(Scanner in) {
// TODO: Leer y validar el tipo de apuesta.
        return ' ';
    }


    public static int girarRuleta() {
// TODO: Generar y retornar un número entre 0 y 36.
        return 0;
    }


    public static boolean evaluarResultado(int numero, char tipo) {
// TODO: Evaluar el resultado según el tipo de apuesta.
        return false;
    }
}
