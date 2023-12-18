package Exercicios;

import java.util.Random;

//50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
//mostre na tela:
//a) Quais foram os números sorteados
//b) Quantos números estão acima de 5
//c) Quantos números são divisíveis por 3
public class Exercicio50 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosSorteio = new int[20];
        int contMaiorQueCinco = 0;
        int contDivisiveisPorTres = 0;

        for (int i = 0; i <= 19; i++) {
            numerosSorteio[0 + i] = random.nextInt(10);
            if (numerosSorteio[0 + i] > 5) {
                contMaiorQueCinco ++;
            }
            if(numerosSorteio[0 + i] % 3 == 0) {
                contDivisiveisPorTres ++;
            }
        }
        System.out.println("Os numeros sorteados foram:");
        for (int i = 0; i <= 19; i++) {
            System.out.print("[" + numerosSorteio[0 + i] + "] ");
        }
        System.out.println();
        System.out.println("Quantidade de numeros maior que 5: " + contMaiorQueCinco);
        System.out.println("Quantidade de numeros dividiveis por 3: " + contDivisiveisPorTres);
    }
}
