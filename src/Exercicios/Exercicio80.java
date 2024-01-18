package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[30];
        int numeroChave = 0;
        Scanner scanner = new Scanner(System.in);
        int contChave = 0;

        System.out.println("Digite um numero entre 1 e 15.");
        System.out.println("------------------------------");
        numeroChave = scanner.nextInt();

        System.out.println("Numeros sorteados entre 1 e 15.");
        for (int i = 0; i <= 29; i++) {
            do {
                numeros[i] = random.nextInt(15);
            } while (numeros[i] == 0);
            System.out.print(numeros[i] + " - ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int j = 0; j <= 29; j++) {
            if (numeros[j] == numeroChave) {
                contChave++;
                System.out.println("Chave encontrda na posição " + j + " do array.");
                System.out.println("-----------------------------------------------");
            }
        }
        System.out.println("A chave foi sorteada " + contChave + " vezes.");
    }
}
