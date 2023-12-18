package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner valor1 = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");

        int soma1 = valor1.nextInt();

        System.out.println("Digite o segundo valor:");

        int soma2 = valor2.nextInt();

        int somaTotal = soma1 + soma2;

        System.out.println("O valor da soma dos dois numeros é: "+ somaTotal);
    }
}
