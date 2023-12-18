package Exercicios;

/*
 * 42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */

import java.util.Scanner;

public class Exercicio42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num = scanner.nextInt();

        for(int cont = 1; cont <= num; cont++) {
            System.out.println(cont);
        }
        System.out.println("Acabou!");
    }
}
