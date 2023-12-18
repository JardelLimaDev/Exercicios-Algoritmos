package Exercicios;

import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Digite um numero?");

        int numeroAnt = Integer.valueOf(numero) - 1;
        int numerotoPost = Integer.valueOf(numero) + 1;

        System.out.println("O antecessor de " + numero + " é " + numeroAnt);
        System.out.println("O sucessor de " + numero + " é " + numerotoPost);
    }
}
