package Exercicios;

import javax.swing.*;

public class Exercicio19 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome");
        String nota1 = JOptionPane.showInputDialog("Digite a nota 1");
        String nota2 = JOptionPane.showInputDialog("Digite a nota 2");

        double media = (Double.valueOf(nota1) + Double.valueOf(nota2)) / 2;

        if (media >= 7) {
            JOptionPane.showMessageDialog(null, "Parabéns pelo bom desempenho " + nome + "\n"
                    + " sua media é " + media);
        }else {
            JOptionPane.showMessageDialog(null, "Você precisa estudar mais  " + nome + "\n"
                    + " sua media é " + media);
        }
    }
}
