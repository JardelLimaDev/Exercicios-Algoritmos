package Exercicios;

import javax.swing.*;

public class Exercicio15 {
    public static void main(String[] args) {

        double valorDiaTrabalhado = 200;

        String diasTrabalhados = JOptionPane.showInputDialog("Quantidade de dias trabalhados.");

        double salario = Double.valueOf(diasTrabalhados) * valorDiaTrabalhado;

        JOptionPane.showMessageDialog(null, "Salario do mês R$ " + salario);
    }
}
