package Exercicios;

import javax.swing.*;

public class Exercicio13 {
    public static void main(String[] args) {
        String salario = JOptionPane.showInputDialog("Digite o seu salario");

        double aumento = Double.valueOf(salario) * 0.15;

        double salarioAumento = Double.valueOf(salario) + aumento;

        JOptionPane.showMessageDialog(null, "Salario com aumento é de R$ " + salarioAumento);
    }
}
