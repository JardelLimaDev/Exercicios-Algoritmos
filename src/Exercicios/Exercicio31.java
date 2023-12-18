package Exercicios;

/*
 * 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio31 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JoKenPo");
        frame.setSize(300, 600);
        frame.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5,1));

        JButton button = new JButton("JoKenPo");

        String[] jokenpo = {"Pedra", "Papel", "Tesoura"};

        JComboBox<String> combobox = new JComboBox<>(jokenpo);
        JComboBox<String> combobox2 = new JComboBox<>(jokenpo);

        JLabel jogador1 = new JLabel("Jogador 1 faça sua jogada");
        JLabel jogador2 = new JLabel("Jogador 2 faça sua jogada");

        painel.add(jogador1);
        painel.add(combobox);
        painel.add(jogador2);
        painel.add(combobox2);
        painel.add(button);

        frame.add(painel);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String jogador1 = combobox.getSelectedItem().toString();
                String jogador2 = combobox2.getSelectedItem().toString();

                if(jogador1 == jogador2) {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "JOGO EMPATADO");
                }else if (jogador1 == "Pedra" && jogador2 == "Tesoura") {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "VITORIA JOGADOR 1");
                }else if (jogador1 == "Pedra" && jogador2 == "Papel") {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "VITORIA JOGADOR 2");
                }else if (jogador1 == "Papel" && jogador2 == "Pedra") {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "VITORIA JOGADOR 1");
                }else if (jogador1 == "Papel" && jogador2 == "Tesoura") {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "VITORIA JOGADOR 2");
                }else if (jogador1 == "Tesoura" && jogador2 == "Pedra") {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "VITORIA JOGADOR 2");
                }else if (jogador1 == "Tesoura" && jogador2 == "Papel") {
                    JOptionPane.showMessageDialog(frame, "JoKenpo " + "VITORIA JOGADOR 1");
                }

            }
        });

        frame.setVisible(true);
    }
}
