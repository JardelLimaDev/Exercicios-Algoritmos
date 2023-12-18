package Exercicios;

import javax.swing.*;

public class Exercicio03 {
    public static void main(String[] args) {
        String nomeFuncionario = JOptionPane.showInputDialog("Qual seu nome?");
        String salario = JOptionPane.showInputDialog("Valor do seu salario");

        System.out.println("Nome do colaborador: "+ nomeFuncionario);
        System.out.println("Valor do salario: "+ salario);
        System.out.println("O colaborador "+ nomeFuncionario + " teve um salario no valor de "+ salario +" em julho");
    }
}
