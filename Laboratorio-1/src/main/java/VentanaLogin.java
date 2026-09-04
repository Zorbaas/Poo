import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaLogin {
    // --- Lista dinámica de usuarios ---
    public static final List USUARIOS = new ArrayList<>();
    // --- Componentes de la interfaz gráfica ---
    private final JFrame frame = new JFrame("Login - Casino Black Cat");
    private final JLabel lblUsuario = new JLabel("Usuario:");
    private final JTextField txtUsuario = new JTextField();
    private final JLabel lblClave = new JLabel("Clave:");
    private final JPasswordField txtClave = new JPasswordField();
    private final JButton btnIngresar = new JButton("Ingresar");
    /**
     * Constructor que inicializa la ventana de inicio de sesión.
     * Configura sus componentes y eventos.
     */
    public VentanaLogin() {
        // Usuarios de prueba precargados (mientras no exista un registro persistente)
        USUARIOS.add(new Usuario("admin", "admin123", "Administrador"));
        USUARIOS.add(new Usuario("donnie", "blackcat", "Don Donnie"));

        // Configuración general de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(320, 180);
        frame.setResizable(false);

        // Distribución simple en grilla: etiqueta + campo por fila
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.add(lblUsuario);
        frame.add(txtUsuario);
        frame.add(lblClave);
        frame.add(txtClave);
        frame.add(new JLabel()); // celda vacía para alinear el botón a la derecha
        frame.add(btnIngresar);

        // Al presionar el botón, se ejecuta la lógica de login()
        btnIngresar.addActionListener(e -> login());
    }
    /**
     * Muestra la ventana en pantalla.
     * Debe centrarla y hacerla visible.
     */

    public void mostrarVentana() {
// TODO: Centrar y mostrar la ventana
    }
    /**
     * Gestiona el inicio de sesión al presionar el botón.
     * Debe validar las credenciales ingresadas y abrir la siguiente
     * ventana o mostrar un mensaje de error.
     */
    private void login() {
// TODO: Implementar la lógica de inicio de sesión
    }
    /**
     * Valida las credenciales ingresadas utilizando la lista de usuarios.
     *
     * @param u nombre de usuario ingresado
     * @param p contraseña ingresada
     * @return el nombre del usuario si las credenciales son válidas o una cadena vacía
    si no existe una coincidencia
     */
    private String validarCredenciales(String u, String p) {
// TODO: Recorrer la lista y validar las credenciales
        return "";
    }
    /**
     * Abre la ventana de registro para crear un nuevo usuario.
     * Debe cerrar la ventana actual e invocar a VentanaRegistro.
     */
    private void abrirRegistro() {
// TODO: Cerrar la ventana actual y abrir la ventana de registro
    }
}