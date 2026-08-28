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

    /**
     * Método principal: inicia el programa llamando al menú.
     */
    public static void main(String[] args) {
        menu();
    }

    /**
     * Controla el flujo principal del programa mostrando
     * un menú en consola.
     */
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

    /**
     * Muestra en consola las opciones disponibles del menú.
     */
    public static void mostrarMenu() {
        System.out.println("\nRuleta - Casino Black Cat");
        System.out.println("1.iniciar ronda");
        System.out.println("2.Ver estadisticas");
        System.out.println("3.Salir");
        System.out.print("Seleccione una opcion");
    }

    /**
     * Lee la opción elegida por el usuario desde teclado.
     *
     * @param in Scanner para entrada por consola.
     * @return número de opción ingresado.
     */
    public static int leerOpcion(Scanner in) {
// TODO: Leer y retornar la opción ingresada.
        return 0;
    }

    /**
     * Ejecuta la acción correspondiente a la opción del menú.
     *
     * @param opcion opción elegida por el usuario.
     * @param in     Scanner para entrada por consola.
     */
    public static void ejecutarOpcion(int opcion, Scanner in) {
// TODO: Ejecutar la acción asociada a la opción.
    }

    /**
     * Inicia una ronda de la ruleta: leer apuesta, girar,
     * evaluar y mostrar resultado.
     *
     * @param in Scanner para entrada por consola.
     */
    public static void iniciarRonda(Scanner in) {
// TODO: Implementar el flujo completo de una ronda.
    }

    /**
     * Permite al usuario seleccionar el tipo de apuesta
     * (R/N/P/I).
     *
     * @param in Scanner para entrada por consola.
     * @return el tipo de apuesta elegido.
     */
    public static char leerTipoApuesta(Scanner in) {
// TODO: Leer y validar el tipo de apuesta.
        return ' ';
    }

    /**
     * Simula el giro de la ruleta generando un número
     * aleatorio de 0 a 36.
     *
     * @return número de la ruleta.
     */
    public static int girarRuleta() {
// TODO: Generar y retornar un número entre 0 y 36.
        return 0;
    }

    /**
     * Evalúa si la apuesta realizada por el jugador
     * fue acertada.
     *
     * @param numero número obtenido en la ruleta.
     * @param tipo   tipo de apuesta elegida.
     * @return true si acertó, false si perdió.
     */
    public static boolean evaluarResultado(int numero, char tipo) {
// TODO: Evaluar el resultado según el tipo de apuesta.
        return false;
    }
}

/**
 * Determina si un número corresponde a color rojo.
 */