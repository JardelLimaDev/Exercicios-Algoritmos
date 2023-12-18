package Exercicios;

import javax.swing.*;

public class Exercicio17 {
    public static void main(String[] args) {
        double valorMultaTotal = 0;
        String velocidade = JOptionPane.showInputDialog("Qual a velocidade do carro?");

        if(Double.valueOf(velocidade) > 80) {
            double velocidadeMulta = Double.valueOf(velocidade) - 80;
            double valorMulta = velocidadeMulta * 5;
            valorMultaTotal = valorMulta;
        }


        JOptionPane.showMessageDialog(null, "Valor da multa é igual R$ " + valorMultaTotal);
    }
}
