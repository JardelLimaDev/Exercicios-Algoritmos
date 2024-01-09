package Exercicios;

import java.util.Scanner;

public class Exercicio66 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("TABUADA DE MULTIPLICAÇÃO");
        System.out.println("Escolha um numero de 1 a 10 para gerar a tabuada.");
        int escolha = scanner.nextInt();

        for (int i = 1; i <= 10; i ++){
            int resultado = escolha * i;
            System.out.println(escolha + " x " + i + " = " + resultado);
        }
    }
}
