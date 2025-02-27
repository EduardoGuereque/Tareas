import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {
    CardLayout cardLayout = new CardLayout();
    JPanel mainPanel = new JPanel(cardLayout);

    public Ventana() {
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));
        
        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));

        mainPanel.add(card1, "Card 1");
        mainPanel.add(card2, "Card 2");

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.next(mainPanel));

        this.add(mainPanel, BorderLayout.CENTER);
        this.add(nextButton, BorderLayout.SOUTH);

        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
