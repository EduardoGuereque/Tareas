import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    private JTextField usuario;
    private JPasswordField contrasena;
    private JButton login;
    
    private JTextField usuario2;
    private JTextArea bio;
    private JPasswordField contrasena2;
    private JButton login2;
    private JCheckBox dulce, salado, saludable;
    private ButtonGroup termino = new ButtonGroup();
    private JRadioButton aceptar;
    private JRadioButton rechazar;
    private JComboBox lugar;

    public Ventana() {
        setTitle("Iniciar Sesión");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.setLocation(1, 1);
        
        panel.add(new JLabel("Usuario:"));
        usuario = new JTextField();
        panel.add(usuario);
        
        panel.add(new JLabel("Contraseña:"));
        contrasena = new JPasswordField();
        panel.add(contrasena);
        
        login = new JButton("Iniciar Sesión");
        panel.add(new JLabel()); // una etiqueta invisible q puse para que el boton de iniciar sesion quede debajo mejor alineadp
        panel.add(login);

        //add(panel);
        
        
        
        setTitle("Registro");
        setSize(400, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JPanel panel2 = new JPanel(new GridLayout(12, 1));
        panel2.setLocation(400, 0);
        
        
        JLabel etiqueta1 = new JLabel("REGISTRO", SwingConstants.CENTER);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 24));
        etiqueta1.setForeground(Color.BLACK);
        panel2.add(etiqueta1);
        
        panel2.add(new JLabel("Nombre de usuario:", SwingConstants.CENTER));
        usuario2 = new JTextField();
        usuario2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.add(usuario2);
        
        panel2.add(new JLabel("BIO:", SwingConstants.CENTER));
        bio = new JTextArea();
        bio.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        panel2.add(bio);
        
        panel2.add(new JLabel("PREFERENCIAS", SwingConstants.CENTER));
                
        JPanel preferencias = new JPanel(new GridLayout(1, 3));
        dulce = new JCheckBox("Dulce");
        salado = new JCheckBox("Salado");
        saludable = new JCheckBox("Saludable");

        preferencias.add(dulce);
        preferencias.add(salado);
        preferencias.add(saludable);

        panel2.add(preferencias);
        
        panel2.add(new JLabel("TERMINOS Y CONDICIONES", SwingConstants.CENTER));
        aceptar = new JRadioButton("ACEPTAR");
        rechazar = new JRadioButton("RECHAZAR");
        termino.add(aceptar);
        termino.add(rechazar);
        JPanel condiciones = new JPanel(new GridLayout(1, 2));
        condiciones.add(aceptar);
        condiciones.add(rechazar);
        panel2.add(condiciones);
        
        String[] lugares = {"Elegir una ubicación", "La Fuente", "Camino Real", "Centro", "Miramar"};
        JComboBox<String> lugar = new JComboBox<>(lugares);
        panel2.add(lugar);
        
        login2 = new JButton("Iniciar Sesión");
        login2.setBackground(new Color(204, 255, 255));
        login2.setForeground(Color.BLACK);
        login2.setFont(new Font("Arial", Font.BOLD, 16));
        panel2.add(login2);
        
        panel2.add(new JLabel(" ", SwingConstants.CENTER));

        add(panel2);
    }

}
