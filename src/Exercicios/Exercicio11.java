package Exercicios;

import javax.swing.*;

public class Exercicio11 {
    public static void main(String[] args) {
        double delta;

        String coeficienteA = JOptionPane.showInputDialog("Digite o valor do Coeficiente A");
        String coeficienteB = JOptionPane.showInputDialog("Digite o valor do Coeficiente B");
        String coeficienteC = JOptionPane.showInputDialog("Digite o valor do Coeficiente C");

        delta = Double.valueOf(coeficienteB) * Double.valueOf(coeficienteB) - 4 * Double.valueOf(coeficienteA) * Double.valueOf(coeficienteC);

        System.out.println("O valo de Delta é igual  " + delta);
    }
}
