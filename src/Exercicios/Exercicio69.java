package Exercicios;

//69) [DESAFIO] Desenvolva um programa que leia o primeiro termo e a razão de uma
//        PA (Progressão Aritmética), mostrando na tela os 10 primeiros elementos da PA e
//        a soma entre todos os valores da sequência.

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int termoPA = 0;
        int razao = 0;
        int contElemento = 0;
        System.out.println("Digite o primeiro termo da PA ");
        termoPA = scanner.nextInt();
        System.out.println("Digite a razão da PA ");
        razao = scanner.nextInt();

        System.out.println("10 primeiros elementos da PA");
        for (int i = termoPA;i > 0; i = i + razao){
            System.out.print(i + " ");
            contElemento ++;
            if (contElemento == 10){
                break;
            }
        }
    }
}
