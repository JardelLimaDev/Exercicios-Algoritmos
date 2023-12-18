package Exercicios;

import java.util.Scanner;

//49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
//são pares e quantos são ímpares.
public class Exercicio49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numerosInteiros = new int[6];
        int contImpar = 0;
        int contPar = 0;
        int totalPares = 0;
        int totalImpares = 0;

        System.out.println("Digite 6 numeros inteiros:");
        numerosInteiros[0] = scanner.nextInt();
        numerosInteiros[1] = scanner.nextInt();
        numerosInteiros[2] = scanner.nextInt();
        numerosInteiros[3] = scanner.nextInt();
        numerosInteiros[4] = scanner.nextInt();
        numerosInteiros[5] = scanner.nextInt();

        for(int i = 0; i <= 5; i++) {
            if(numerosInteiros[0 + i] % 2 == 0) {
                contPar ++;
                totalPares = contPar;
            }else {
                contImpar ++;
                totalImpares = contImpar;
            }
        }
        System.out.println(totalImpares);
        System.out.println(totalPares);
    }
}
