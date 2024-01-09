package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        List<Integer> idades = new ArrayList<>();
        int escolha = 1;
        int somaIdade = 0;
        float mediaIdade = 0;
        int contIdade = 0;
        int contIdadeMaior21 = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Digite a idade da pessoa:");
            idades.add(scanner.nextInt());
            contIdade ++;
            System.out.println("---------------------------");
            System.out.println("Para encerrar digite 1 para continuar digite 0:");
            escolha = scanner.nextInt();
        }while (escolha == 0);

        System.out.print("Idades digitadas ");
        for (Integer i : idades) {
            System.out.print(" " + i);
        }
        System.out.println(" ");
        //a) Quantas idades foram digitadas
        System.out.println("Quantidade de idadedes digitadas " + contIdade);
        //b) Qual é a média entre as idades digitadas
        for (int i = 0; i < idades.size(); i ++){
            somaIdade += idades.get(i);
        }
        mediaIdade = somaIdade / idades.size();
        System.out.println("Media das idadedes digitadas " + mediaIdade);
        //c) Quantas pessoas tem 21 anos ou mais.
        for (int j = 0; j < idades.size(); j++){
            if (idades.get(j) > 21){
                contIdadeMaior21 ++;
            }
        }
        System.out.println("Quantidade Idadedes digitadas maiores que 21 " + contIdadeMaior21);
    }
}
