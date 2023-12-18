package Exercicios;

/*
 * 32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o
jogador vai tentar descobrir qual foi o valor sorteado.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int valor;
        int numeroAleatorio;

        /*
         * do { numeroAleatorio = random.nextInt(5); } while (numeroAleatorio == 0);
         *
         *
         * if(valor == numeroAleatorio) {
         * System.out.println("Você GANHOU Numero Sorteado foi " + numeroAleatorio);
         * System.out.println("Seu Numero foi " + valor); }else {
         * System.out.println("Você PERDEU Numero Sorteado foi " + numeroAleatorio);
         * System.out.println("Seu Numero foi " + valor); }
         */

        // parar so quando ganhar

        System.out.println("DIGITE UM VALOR ENTRE 1 E 5.");
        valor = scanner.nextInt();

        do {
            numeroAleatorio = random.nextInt(5);
        } while (numeroAleatorio == 0);

        if (valor == numeroAleatorio) {
            System.out.println("Você GANHOU Numero Sorteado foi " + numeroAleatorio);
            System.out.println("Seu Numero foi " + valor);
        } else {
            do {
                System.out.println("Você PERDEU Numero Sorteado foi " + numeroAleatorio);
                System.out.println("Seu Numero foi " + valor);
                System.out.println("-------------- NOVA CHANCE --------------------");
                System.out.println("DIGITE UM VALOR ENTRE 1 E 5.");
                valor = scanner.nextInt();
                do {
                    numeroAleatorio = random.nextInt(5);
                } while (numeroAleatorio == 0);
            } while (valor != numeroAleatorio);

            if (valor == numeroAleatorio) {
                System.out.println("Você GANHOU Numero Sorteado foi " + numeroAleatorio);
                System.out.println("Seu Numero foi " + valor);
            }

        }
    }
}
