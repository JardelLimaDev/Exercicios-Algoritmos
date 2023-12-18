package Exercicios;

//52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
//a) Qual é a média de idade do grupo
//b) Quantas pessoas tem mais de 18 anos
//c) Quantas pessoas tem menos de 5 anos
//d) Qual foi a maior idade lida

import java.util.Scanner;

public class Exercicio52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[10];
        float mediaIdades = 0;
        int soma = 0;
        int contMaiorIdade = 0;
        int contCriançasMenorCincoAnos = 0;
        int maiorIdadeLida = 0;

        System.out.println("Digite as idades do grupo de 10 pessoas: ");
        idades[0] = scanner.nextInt();
        idades[1] = scanner.nextInt();
        idades[2] = scanner.nextInt();
        idades[3] = scanner.nextInt();
        idades[4] = scanner.nextInt();
        idades[5] = scanner.nextInt();
        idades[6] = scanner.nextInt();
        idades[7] = scanner.nextInt();
        idades[8] = scanner.nextInt();
        idades[9] = scanner.nextInt();

        for(int i = 0; i <= 9; i++) {
            soma += idades[0 + i];
            if(idades[0 + i] > 18) {
                contMaiorIdade ++;
            }if(idades[0 + i] < 5) {
                contCriançasMenorCincoAnos ++;
            }if(idades[0 + i] > maiorIdadeLida) {
                maiorIdadeLida = idades[0 + i];
            }
        }
        mediaIdades = soma / idades.length;
        System.out.println("Qual é a média de idade do grupo " + mediaIdades + "\n" +
                "Quantas pessoas tem mais de 18 anos " + contMaiorIdade + "\n" +
                "Quantas pessoas tem menos de 5 anos " + contCriançasMenorCincoAnos + "\n" +
                "Qual foi a maior idade lida " + maiorIdadeLida);
    }
}
