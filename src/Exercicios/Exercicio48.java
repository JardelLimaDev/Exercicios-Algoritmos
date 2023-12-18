package Exercicios;

import java.util.Scanner;

//48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
//entre eles.
public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosInteiros = new int[7];
        int soma = 0;
        int valorTotal = 0;
        System.out.println("Digite 7 numeros inteiros: ");
        numerosInteiros[0] = scanner.nextInt();
        numerosInteiros[1] = scanner.nextInt();
        numerosInteiros[2] = scanner.nextInt();
        numerosInteiros[3] = scanner.nextInt();
        numerosInteiros[4] = scanner.nextInt();
        numerosInteiros[5] = scanner.nextInt();
        numerosInteiros[6] = scanner.nextInt();

        for (int i = 0; i <= 6; i++) {
            soma += numerosInteiros[0 + i];
        }
        valorTotal = soma;
        System.out.println("O valor total é " + valorTotal);
    }
}
