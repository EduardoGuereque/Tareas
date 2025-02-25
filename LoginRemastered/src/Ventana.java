import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Ventana extends JFrame {
    private JTextField usuario;
    private JPasswordField contrasena;
    private JButton login;
    
    public Ventana() {
        setTitle("Iniciar Sesión");
        setSize(600, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel0 = new JPanel(new GridLayout(1, 2));
        
        JLabel imagen = new JLabel (new ImageIcon("camaron.png"));
        panel0.add(imagen);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        
        panel.add(new JLabel("Usuario:"));
        usuario = new JTextField();
        panel.add(usuario);
        
        panel.add(new JLabel("Contraseña:"));
        contrasena = new JPasswordField();
        panel.add(contrasena);
        
        login = new JButton("Iniciar Sesión");
        panel.add(new JLabel()); // una etiqueta invisible q puse para que el boton de iniciar sesion quede debajo mejor alineadp
        panel.add(login);

        panel0.add(panel);
        add(panel0);
        }

}
