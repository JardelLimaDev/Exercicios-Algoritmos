package Exercicios.util;

import javax.swing.*;

public class ComboBox {
    public static void main(String[] args) {
        // Cria um JFrame
        JFrame frame = new JFrame("Exemplo de JComboBox");

        // Define o tamanho do JFrame
        frame.setSize(350, 500);

        // Cria um array de opções
        String[] opcoes = {"Opção 1", "Opção 2", "Opção 3", "Opção 4"};

        // Cria uma caixa de seleção com as opções
        JComboBox<String> comboBox = new JComboBox<>(opcoes);

        // Adiciona a caixa de seleção ao JFrame
        frame.add(comboBox);

        // Cria um botão para exibir a seleção
        JButton botao = new JButton("Exibir seleção");
        frame.add(botao);

        // Adiciona um ouvinte de ação ao botão
        botao.addActionListener(e -> {
            // Obtém a seleção atual da caixa de seleção
            String selecao = comboBox.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Você selecionou: " + selecao);
        });

        // Define a operação padrão quando a janela é fechada
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define o layout do JFrame
        frame.setLayout(new java.awt.FlowLayout());

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);

        // Torna a janela visível
        frame.setVisible(true);

    }
}
