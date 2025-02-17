import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Ventana() {
        setTitle("Iniciar Sesión");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Usuario:"));
        userTextField = new JTextField();
        panel.add(userTextField);
        panel.add(new JLabel("Contraseña:"));
        passwordField = new JPasswordField();
        panel.add(passwordField);
        loginButton = new JButton("Iniciar Sesión");
        panel.add(new JLabel()); // una etiqueta invisible q puse para que el boton de iniciar sesion quede debajo mejor alineadp
        panel.add(loginButton);

        add(panel);
    }

}
