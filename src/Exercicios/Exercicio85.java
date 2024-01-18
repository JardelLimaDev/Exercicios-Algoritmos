package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[5];
        String[] sexo = new String[5];
        double[] salario = new double[5];

        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite o nome da " + (i + 1) + "° pessoa:");
            nome[i] = scanner.next();
            System.out.println("Digite o sexo da " + (i + 1) + "° pessoa:");
            sexo[i] = scanner.next();
            System.out.println("Digite o salario da " + (i + 1) + "° pessoa:");
            salario[i] = scanner.nextDouble();
        }

        System.out.println("");
        System.out.println("");
        System.out.println("Array relacionados");

        System.out.print(Arrays.toString(nome));
        System.out.println("");
        System.out.print(Arrays.toString(sexo));
        System.out.println("");
        System.out.print(Arrays.toString(salario));
        System.out.println("");

        System.out.println("Mulheres que ganham mais de R$ 5.000,00 ");
        for (int i = 0; i <= 4; i++) {
            if (sexo[i].equalsIgnoreCase("f") && salario[i] > 5000.00) {
                System.out.print(nome[i] + " - " + salario[i] + " | ");
            }
        }
    }
}
