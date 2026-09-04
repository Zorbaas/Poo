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
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion(in);
            ejecutarOpcion(opcion, in);
        } while (opcion != 3);

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
        int opcion = -1;
        try {
            opcion = Integer.parseInt(in.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Debes ingresar un numero");
        }
// TODO: Leer y retornar la opción ingresada.
        return opcion;
    }

    public static void ejecutarOpcion(int opcion, Scanner in) {
        switch (opcion) {
            case 1:
                iniciarRonda(in);
                break;
            case 2:
                mostrarEstadisticas();
                break;
            case 3:
                System.out.println("Gracias por jugar");
                break;
            default:
                System.out.println("Opcion invalida");
        }
// TODO: Ejecutar la acción asociada a la opción.
    }


    public static void iniciarRonda(Scanner in)  {
        if (historialSize >= MAX_HISTORIAL) {
            System.out.println("Se alcanzó el máximo de rondas registrables.");
            return;
        }

        char tipo = leerTipoApuesta(in);

        int monto = -1;
        while (monto < 0) {
            System.out.print("Ingrese el monto a apostar: ");
            try {
                monto = Integer.parseInt(in.nextLine().trim());
                if (monto < 0) {
                    System.out.println("El monto no puede ser negativo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
            }
        }

        int numero = girarRuleta();
        boolean acierto = evaluarResultado(numero, tipo);

        registrarResultado(numero, monto, acierto);
        mostrarResultado(numero, tipo, monto, acierto);
    }


    public static char leerTipoApuesta(Scanner in) {
        char tipo = ' ';
        boolean valido = false;

        while (!valido) {
            System.out.println("Seleccione el tipo de apuesta:");
            System.out.println("  R - Rojo");
            System.out.println("  N - Negro");
            System.out.println("  P - Par");
            System.out.println("  I - Impar");
            System.out.print("Opción: ");

            String entrada = in.nextLine().trim().toUpperCase();
            if (entrada.length() == 1 && "RNPI".indexOf(entrada.charAt(0)) != -1) {
                tipo = entrada.charAt(0);
                valido = true;
            } else {
                System.out.println("Opción inválida, intente nuevamente.\n");
            }
// TODO: Leer y validar el tipo de apuesta.
        }
        return tipo;
    }

    public static int girarRuleta()  {
        return rng.nextInt(37);
    }


    public static boolean evaluarResultado(int numero, char tipo) {
        switch (tipo) {
            case 'R':
                return esRojo(numero);
            case 'N':
                return numero != 0 && !esRojo(numero);
            case 'P':
                return numero != 0 && numero % 2 == 0;
            case 'I':
                return numero % 2 != 0;
            default:
                return false;
        }
    }

    public static boolean esRojo(int numero) {

        for (int i = 0; i < numerosRojos.length; i++) {
            if (numerosRojos[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void registrarResultado(int numero, int apuesta, boolean acierto) {
        if (historialSize < MAX_HISTORIAL) {
            historialNumeros[historialSize] = numero;
            historialApuestas[historialSize] = apuesta;
            historialAciertos[historialSize] = acierto;
            historialSize++;
        }
    }

    public static void mostrarResultado(int numero, char tipo, int monto, boolean
        acierto) {
// TODO: Mostrar los datos y el resultado de la ronda.
    }

    public static void mostrarEstadisticas() {
// TODO: Calcular y mostrar las estadísticas acumuladas.
    }
}