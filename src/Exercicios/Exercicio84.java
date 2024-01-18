package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[9];
        int[] idade = new int[9];

        for (int i = 0; i <= 8; i++){
            System.out.println("Digite o nome da " + (i + 1) + "° pessoa:");
            nome[i] = scanner.next();
            System.out.println("Digite a idade da " + (i + 1) + "° pessoa:");
            idade[i] = scanner.nextInt();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Array relacionados");

        System.out.print(Arrays.toString(nome));
        System.out.println("");
        System.out.print(Arrays.toString(idade));
        System.out.println("");

        System.out.println("Pessoas menores de idade");
        for (int i = 0; i <= 8; i++){
            if (idade[i] < 18) {
                System.out.print(nome[i] + " - " + idade[i] + " | ");
            }
        }
    }
}
