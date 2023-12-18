package Exercicios;

import javax.swing.*;

public class Exercicio09 {
    public static void main(String[] args) {
        double dolar = 3.45;

        String real = JOptionPane.showInputDialog("Saldo da carteira é ");

        double saldoDolar = Double.valueOf(real) / dolar;

        System.out.println("Saldo da carteira em dolar é " + saldoDolar);
    }
}
