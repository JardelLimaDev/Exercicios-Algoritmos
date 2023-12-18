package Exercicios;

import javax.swing.*;

/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais*/

public class Exercicio26 {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        String num2 = JOptionPane.showInputDialog("Digite o segundo valor");

        if(Double.valueOf(num1) > Double.valueOf(num2)) {
            System.out.println("O primeiro valor é o maior");
        }if(Double.valueOf(num1) < Double.valueOf(num2)) {
            System.out.println("O segundo valor é o maior");
        }if(Double.valueOf(num1) == Double.valueOf(num2)) {
            System.out.println("Não existe valor maior, os dois são iguais");
        }
    }
}
