package Exercicios;

import java.util.Scanner;

/*
 * 33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("QUAL O VALOR DA CASA?");
        double valorCasa = scanner.nextDouble();

        System.out.println("QUAL É O VALOR DO SEU SALARIO?");
        double valorSalario = scanner.nextDouble();

        System.out.println("EM QUANTOS ANOS SERA PAGO O VALOR DA CASA?");
        int anosQuitacaoCasa = scanner.nextInt();

        double trintaPorCentoSalario = valorSalario * 0.3;

        int numeroParcelas = anosQuitacaoCasa * 12;

        double valorParcela = valorCasa / numeroParcelas;

        if(valorParcela > trintaPorCentoSalario) {
            System.out.println("EMPRESTIMO PARA COMPRA DE CASA NEGADO");
        }else {
            System.out.println("EMPRESTIMO PARA COMPRA DE CASA APROVADO");
        }

    }
}

