package Exercicios;

import javax.swing.*;

public class Exercicio14 {
    public static void main(String[] args) {

        double precoKm = 0.20;
        double precoDia = 90;

        String km = JOptionPane.showInputDialog("km rodados");
        String dia = JOptionPane.showInputDialog("Dias alugados");

        double valorKm = Double.valueOf(km) * precoKm;
        double valorDia = Double.valueOf(dia) * precoDia;

        double valorTotal = valorDia + valorKm;

        JOptionPane.showMessageDialog(null, "Valor pago na Quilometragem R$ " + valorKm + "\n"
                + "Valor pago por dias alugados R$ " + valorDia + "\n"
                + "Valor total a ser pago R$ " + valorTotal);
    }
}
