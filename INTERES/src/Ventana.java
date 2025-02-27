import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    
    public Ventana () {
        
        setTitle("CALCULADORA DE INTERES");
        setSize(600, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new BorderLayout(20, 50));
        
        JLabel interes = new JLabel("INTERES", SwingConstants.CENTER);
        interes.setForeground(Color.RED);
        interes.setFont(new Font("Arial", Font.BOLD, 16));
        interes.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        
        JLabel izq = new JLabel(" ");
        JLabel der = new JLabel(" ");
        
        panel.add(interes, BorderLayout.NORTH);
        panel.add(izq, BorderLayout.WEST);
        panel.add(der, BorderLayout.EAST);
        
        JPanel verde = new JPanel(new GridLayout(4, 2, 20, 20)); // panel centro
        verde.setOpaque(true);
        verde.setBackground(new Color(205, 255, 205));
        verde.setVisible(true);
        
        JLabel capital = new JLabel("Capital: ", SwingConstants.CENTER);
        capital.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextField capital2 = new JTextField("1500");
        
        JLabel tiempo = new JLabel("Tiempo: ", SwingConstants.CENTER);
        tiempo.setFont(new Font("Arial", Font.PLAIN, 12));
        tiempo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextField tiempo2 = new JTextField("2");
        
        JLabel tasa = new JLabel("Tasa de interes: ", SwingConstants.CENTER);
        tasa.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextField tasa2 = new JTextField("0.1");
        
        JPanel boton = new JPanel(new GridLayout(1, 2, 20, 20)); // boton
        JPanel boton2 = new JPanel(new GridLayout(1, 2, 20, 20)); // boton
        
        JButton calc = new JButton("CALCULAR");
        calc.setBackground(Color.BLACK);
        calc.setForeground(Color.WHITE);
        JButton canc = new JButton("CANCELAR");
        canc.setBackground(Color.BLACK);
        canc.setForeground(Color.WHITE);
        
        verde.add(capital);
        verde.add(capital2);
        verde.add(tiempo);
        verde.add(tiempo2);
        verde.add(tasa);
        verde.add(tasa2);
        boton.add(calc);
        boton2.add(canc);
        verde.add(boton);
        verde.add(boton2);
        
        JPanel rojo = new JPanel(new GridLayout(2, 2, 20, 20)); // panel abajo
        rojo.setOpaque(true);
        rojo.setBackground(new Color(255, 204, 204));
        rojo.setVisible(true);
        
        JLabel inter = new JLabel("Interes: ", SwingConstants.CENTER);
        inter.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextField input = new JTextField("3.1416");
        
        JLabel monto = new JLabel("Monto: ", SwingConstants.CENTER);
        monto.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JTextField input2 = new JTextField("23.14244");
        
        rojo.add(inter);
        rojo.add(input);
        rojo.add(monto);
        rojo.add(input2);
        
        panel.add(verde, BorderLayout.CENTER);
        panel.add(rojo, BorderLayout.SOUTH);
        
        add(panel);
    }
    
}
