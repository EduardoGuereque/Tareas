import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        
        JMenuBar barra = new JMenuBar();
        
        JMenu menu1 = new JMenu("Archivo");
        JMenu menu2 = new JMenu("Ayuda");
        
        barra.add(menu1);
        barra.add(menu2);
        
        JMenuItem abrir = new JMenuItem("Abrir");
        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem cerrar = new JMenuItem("Cerrar");
        
        JMenuItem bienv = new JMenuItem("Bienvenido");
        JMenuItem centro= new JMenuItem("Centro de ayuda");
        JMenuItem reportar = new JMenuItem("Reportar errores");
        
        
        menu1.add(nuevo);
        menu1.add(abrir);
        menu1.add(guardar);
        menu1.add(cerrar);
        
        menu2.add(bienv);
        menu2.add(centro);
        menu2.add(reportar);
        
        this.setJMenuBar(barra);

        panel0.add(panel);
        add(panel0);
        }

}
