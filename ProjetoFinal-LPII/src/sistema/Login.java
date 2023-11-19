package src.sistema;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Login {
    public Login(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800,500);
        frame.setTitle("Spotify");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);


        JButton enter = new JButton("Enter");
        enter.setBounds(100, 200, 250, 70);
        enter.setFont(new Font("Arial",Font.BOLD,28));
        enter.setBackground(new Color(100,100,100));
        enter.setForeground(new Color (50,50,50));

        frame.add(enter);
    }
}
