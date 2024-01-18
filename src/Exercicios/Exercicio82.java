package Exercicios;

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double mediaTurma = 0;
        double somaNotas = 0;
        int contAlunoAcimaMedia = 0;
        double maiorNota = 0;

        System.out.println("Digite as notas dos alunos na seguinte sequencia:");
        for (int i = 0; i <= 9; i++){
            System.out.println("Nota do aluno " + (i +1));
            notas[i] = scanner.nextDouble();
            System.out.println("------------------");
        }
        System.out.println("As notas digitadas foram: ");
        for (int i = 0; i <= 9; i++){
            System.out.print(notas[i] + " - ");
            somaNotas += notas[i];
        }
        System.out.println("");
        System.out.println("");

//        a) Qual é a média da turma
        mediaTurma = somaNotas / 10;
        System.out.println("A media da turma é " + mediaTurma);

//        b) Quantos alunos estão acima da média da turma, definimos media 7
        for (int i = 0; i <= 9; i++){
            if (notas[i] >= 7){
                contAlunoAcimaMedia ++;
            }
        }
        System.out.println("Quantidade de alunos acima da media " + contAlunoAcimaMedia);

//        c) Qual foi a maior nota digitada
        maiorNota = notas[0];
        for (int i = 0; i <= 9; i++){
            if (notas[i] > maiorNota){
                maiorNota = notas[i];
            }
        }
        System.out.println("Maior nota digitada é igual a " + maiorNota);

//        d) Em que posições a maior nota aparece
        for (int i = 0; i <= 9; i++){
            if (notas[i] == maiorNota){
                System.out.println("A maior nota foi digitada na posição " + i + " do Array.");
            }
        }

    }
}
