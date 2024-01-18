package Exercicios;

// 81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
// final, mostre:
//        a) Qual é a média de idade das pessoas cadastradas
//        b) Em quais posições temos pessoas com mais de 25 anos
//        c) Qual foi a maior idade digitada (podem haver repetições)
//        d) Em que posições digitamos a maior idade

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[8];
        int somaIdade= 0;
        double mediaIdade = 0;
        int maiorIdade;

        for (int i = 0; i <= 7; i++){
            System.out.println("Digite a idade da pessoa " + (i + 1) +"°");
            idades[i] = scanner.nextInt();
            System.out.println("------------");
            somaIdade += idades[i];
        }

        System.out.println("=====================================================");
        System.out.println("Array com todas a idades digitadas");
        for (int i = 0; i <= 7; i++){
            System.out.print(idades[i] + " - ");
        }
        System.out.println("");
        System.out.println("");

        mediaIdade = somaIdade / 8;
        System.out.println("Media de idades é " + mediaIdade);

        for (int i = 0; i <= 7; i++){
            if (idades[i] > 25){
                System.out.println("A idade da posição " + i + " do array, é maior que 25.");
            }
        }

        maiorIdade = idades[0];
        for (int i = 0; i <= 7; i++){
            if (idades[i] > maiorIdade){
                maiorIdade = idades[i];
            }
        }
        System.out.println("A maior idade digitada foi " + maiorIdade);

        for (int i = 0; i <= 7; i++){
            if (maiorIdade == idades[i]){
                System.out.println("A maior idade esta na posição " + i + " do array");
            }
        }


    }
}
