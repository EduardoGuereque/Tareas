import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Ventana extends JFrame {

	public Ventana() {
		
		setTitle("Usuarios");
		setSize(900, 900);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLocationRelativeTo(null);
	    
	    //panel principal
	    
	    JPanel panel = new JPanel(new GridLayout(5, 1));
	    
	    JLabel titulo = new JLabel("USUARIOS", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.BLACK);
        panel.add(titulo);
        
        //tabla de total de usuarios
        
        JPanel totales = new JPanel(new GridLayout(2, 2));
	    
	    JLabel users = new JLabel("Total de usuarios:", SwingConstants.CENTER);
	    users.setFont(new Font("Arial", Font.BOLD, 20));
        users.setOpaque(true);
        users.setForeground(Color.WHITE);
        users.setBackground(Color.BLACK);
        totales.add(users);
        
        JLabel vacio = new JLabel(" ", SwingConstants.CENTER);
        vacio.setFont(new Font("Arial", Font.BOLD, 12));
        vacio.setBackground(Color.WHITE);
        totales.add(vacio);
        
        JLabel users2 = new JLabel("100", SwingConstants.CENTER);
        users2.setFont(new Font("Arial", Font.BOLD, 35));
        users2.setOpaque(true);
        users2.setForeground(Color.WHITE);
        users2.setBackground(Color.BLACK);
        totales.add(users2);
        
        panel.add(totales);
        
        //exportar y añadir
        
        JPanel botones = new JPanel(new GridLayout(1, 3));
        
        JLabel vacio2 = new JLabel(" ");
        vacio2.setFont(new Font("Arial", Font.BOLD, 12));
        vacio2.setBackground(Color.WHITE);
        botones.add(vacio2);
        
        JButton exportar = new JButton("Exportar");
        exportar.setFont(new Font("Arial", Font.BOLD, 12));
        exportar.setOpaque(true);
        exportar.setBackground(Color.WHITE);
        exportar.setForeground(Color.BLACK);
        botones.add(exportar);
        
        JButton añadir = new JButton("Añadir");
        añadir.setFont(new Font("Arial", Font.BOLD, 12));
        añadir.setOpaque(true);
        añadir.setBackground(Color.WHITE);
        añadir.setForeground(Color.BLACK);
        botones.add(añadir);
        
        panel.add(botones);
        
        //tabla de usuarios
        
        String data[][] = {{"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},
        				   {"2005", "pepe", "pecas","4to","9.4","acciones"},};
        String[] columnas = {"No. Control", "Nombre", "Apellido","semestre","Promedio","Acciones"};
        
        JTable tabla=new JTable(data,columnas);    
        tabla.setBounds(30,40,200,300);          
        JScrollPane scroll =new JScrollPane(tabla);
        scroll.setSize(800, 200);
        
        panel.add(tabla);
        
        JLabel vacio3 = new JLabel(" ");
        botones.add(vacio3);
        
        
        
        
        add(panel);
		
	}
	
	
}
