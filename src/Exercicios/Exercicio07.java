package Exercicios;

import javax.swing.*;

public class Exercicio07 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um numero");

        double numeroDobro = Double.valueOf(numero) * 2;
        double numeroTerca = Double.valueOf(numero) / 3;

        System.out.println("O dobro do numero " + numero + " é " + numeroDobro);
        System.out.println("A terça parte do nuemro " + numero + " é " + numeroTerca);
    }
}
