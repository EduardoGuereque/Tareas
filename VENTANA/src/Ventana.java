import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

    public Ventana(String title) {
        this.setTitle(title);
        this.setSize(500, 500);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BorderLayout());

        JLabel etiqueta1 = new JLabel("Favor de iniciar sesión", SwingConstants.CENTER);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 24));
        etiqueta1.setForeground(Color.BLACK);

        panel.add(etiqueta1, BorderLayout.NORTH);
        this.add(panel);
        
        this.setVisible(true);
    }
}

