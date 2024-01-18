package Exercicios;

import java.util.Scanner;

public class Exercicio79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numeros = new int[10];

        System.out.println("Digite os 10 numeros:");
        System.out.println("===========================");
        for (int i = 0; i <= 9; i++){
            System.out.println("Numero na posição " + i);
            numeros[i] = scanner.nextInt();
            System.out.println("---------------------------");
        }

        System.out.println("Numeros pares e suas respectivas posições");
        for (int j = 0; j <= 9; j++){
            if (numeros[j] % 2 == 0){
                System.out.println("---------------");
                System.out.println(numeros[j] + " é um numero par, na posição " + j + " do array");
            }
        }
    }
}
