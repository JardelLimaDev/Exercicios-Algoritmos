package Exercicios;

/*
 * 36) Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pontosGanhos = 0;
        System.out.println("Digite quantas horas de atividade fisica você realixou no mês: ");
        int horas = scanner.nextInt();

        if(horas < 10) {
            int pontos = horas * 2;
            pontosGanhos = pontos;
        }else if (horas >= 10 && horas <= 20) {
            int pontos = horas * 5;
            pontosGanhos = pontos;
        }else {
            int pontos = horas * 10;
            pontosGanhos = pontos;
        }

        double faturamrento = pontosGanhos * 0.05;
        System.out.println("Horas de atividade  o mês " + horas + "\n"
                + "Valor Faturado R$ " + faturamrento);

    }
}
