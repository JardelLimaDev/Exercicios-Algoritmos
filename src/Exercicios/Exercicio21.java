package Exercicios;

import javax.swing.*;

public class Exercicio21 {
    public static void main(String[] args) {
        String ano = JOptionPane.showInputDialog("Digite o ano");

        if (Double.valueOf(ano) % 4 == 0) {
            System.out.println(ano + " é bissexto");
        }else {
            System.out.println(ano + " não é bissexto");
        }
    }
}
