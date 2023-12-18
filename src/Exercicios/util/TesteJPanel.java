package Exercicios.util;

import javax.swing.*;
import java.awt.*;

public class TesteJPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo GridLayout");
        JPanel panel = new JPanel();

        // Configura o layout para GridLayout com 2 linhas e 3 colunas
        panel.setLayout(new GridLayout(2, 3));

        // Adiciona componentes ao JPanel
        panel.add(new JButton("Botão 1"));
        panel.add(new JButton("Botão 2"));
        panel.add(new JButton("Botão 3"));
        panel.add(new JButton("Botão 4"));
        panel.add(new JButton("Botão 5"));
        panel.add(new JButton("Botão 6"));

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
