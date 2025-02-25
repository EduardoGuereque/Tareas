import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {

        setTitle("EPICA CALCULADORA MORTAL DE LA MUERTE");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel(new GridLayout(6, 1));
        
        JLabel resultado = new JLabel(" ");
        resultado.setOpaque(true);
        resultado.setBackground(new Color(236, 252, 255));
        panel.add(resultado);
        
        JPanel panel1 = new JPanel(new GridLayout(1, 4));
        
        JButton borrar = new JButton("CE");
        borrar.setBackground(new Color(246, 177, 142));
        borrar.setForeground(Color.BLACK);
        borrar.setFont(new Font("Arial", Font.BOLD, 16));
        panel1.add(borrar);
        
        JButton null1 = new JButton(" ");
        null1.setBackground(new Color(204, 255, 255));
        null1.setForeground(Color.BLACK);
        null1.setFont(new Font("Arial", Font.BOLD, 16));
        panel1.add(null1);
        
        JButton null2 = new JButton(" ");
        null2.setBackground(new Color(204, 255, 255));
        null2.setForeground(Color.BLACK);
        null2.setFont(new Font("Arial", Font.BOLD, 16));
        panel1.add(null2);
        
        JButton null3 = new JButton(" ");
        null3.setBackground(new Color(204, 255, 255));
        null3.setForeground(Color.BLACK);
        null3.setFont(new Font("Arial", Font.BOLD, 16));
        panel1.add(null3);
        
        panel.add(panel1);

        
        JPanel panel2 = new JPanel(new GridLayout(1, 4));
        
        JButton siete = new JButton("7");
        siete.setBackground(new Color(204, 255, 255));
        siete.setForeground(Color.BLACK);
        siete.setFont(new Font("Arial", Font.BOLD, 16));
        panel2.add(siete);
        
        JButton ocho = new JButton("8");
        ocho.setBackground(new Color(204, 255, 255));
        ocho.setForeground(Color.BLACK);
        ocho.setFont(new Font("Arial", Font.BOLD, 16));
        panel2.add(ocho);
        
        JButton nueve = new JButton("9");
        nueve.setBackground(new Color(204, 255, 255));
        nueve.setForeground(Color.BLACK);
        nueve.setFont(new Font("Arial", Font.BOLD, 16));
        panel2.add(nueve);
        
        JButton div = new JButton("/");
        div.setBackground(new Color(246, 215, 142));
        div.setForeground(Color.BLACK);
        div.setFont(new Font("Arial", Font.BOLD, 16));
        panel2.add(div);
        
        panel.add(panel2);
        
        JPanel panel3 = new JPanel(new GridLayout(1, 4));
        
        JButton cuatro = new JButton("4");
        cuatro.setBackground(new Color(204, 255, 255));
        cuatro.setForeground(Color.BLACK);
        cuatro.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(cuatro);
        
        JButton cinco = new JButton("5");
        cinco.setBackground(new Color(204, 255, 255));
        cinco.setForeground(Color.BLACK);
        cinco.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(cinco);
        
        JButton seis = new JButton("6");
        seis.setBackground(new Color(204, 255, 255));
        seis.setForeground(Color.BLACK);
        seis.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(seis);
        
        JButton mult = new JButton("*");
        mult.setBackground(new Color(246, 215, 142));
        mult.setForeground(Color.BLACK);
        mult.setFont(new Font("Arial", Font.BOLD, 16));
        panel3.add(mult);
        
        panel.add(panel3);
        
        
        JPanel panel4 = new JPanel(new GridLayout(1, 4));
        
        JButton uno = new JButton("1");
        uno.setBackground(new Color(204, 255, 255));
        uno.setForeground(Color.BLACK);
        uno.setFont(new Font("Arial", Font.BOLD, 16));
        panel4.add(uno);
        
        JButton dos = new JButton("2");
        dos.setBackground(new Color(204, 255, 255));
        dos.setForeground(Color.BLACK);
        dos.setFont(new Font("Arial", Font.BOLD, 16));
        panel4.add(dos);
        
        JButton tres = new JButton("3");
        tres.setBackground(new Color(204, 255, 255));
        tres.setForeground(Color.BLACK);
        tres.setFont(new Font("Arial", Font.BOLD, 16));
        panel4.add(tres);
        
        JButton menos = new JButton("-");
        menos.setBackground(new Color(246, 215, 142));
        menos.setForeground(Color.BLACK);
        menos.setFont(new Font("Arial", Font.BOLD, 16));
        panel4.add(menos);
        
        panel.add(panel4);
        
        
        JPanel panel5 = new JPanel(new GridLayout(1, 4));
        
        JButton cero = new JButton("0");
        cero.setBackground(new Color(204, 255, 255));
        cero.setForeground(Color.BLACK);
        cero.setFont(new Font("Arial", Font.BOLD, 16));
        panel5.add(cero);
        
        JButton punto = new JButton(".");
        punto.setBackground(new Color(204, 255, 255));
        punto.setForeground(Color.BLACK);
        punto.setFont(new Font("Arial", Font.BOLD, 16));
        panel5.add(punto);
        
        JButton igual = new JButton("=");
        igual.setBackground(new Color(246, 215, 142));
        igual.setForeground(Color.BLACK);
        igual.setFont(new Font("Arial", Font.BOLD, 16));
        panel5.add(igual);
        
        JButton mas = new JButton("+");
        mas.setBackground(new Color(246, 215, 142));
        mas.setForeground(Color.BLACK);
        mas.setFont(new Font("Arial", Font.BOLD, 16));
        panel5.add(mas);
        
        panel.add(panel5);
        
        
        add(panel);
    }

}
