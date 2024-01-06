package Exercicios;

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        int somaIdade = 0;
        int contAluno = 0;
        float mediaIdade;
        int escolha = 0;
        System.out.println("IDADE DOS ALUNOS");

        do {
            for (int i = 1; i < 999; i++){
                System.out.println("Idade do aluno " + i);
                idade = scanner.nextInt();
                somaIdade += idade;
                contAluno ++;
                System.out.println("--------------------------------");
                System.out.println("Para parar digite 999 para continuar digite zero!");
                escolha = scanner.nextInt();
                if (escolha == 999){
                    break;
                }
            }
        }while (escolha != 999);

        mediaIdade = somaIdade / contAluno;

        System.out.println("Quantidade de alunos " + contAluno +
                " Media de idade dos alunos " + mediaIdade);

    }
}
