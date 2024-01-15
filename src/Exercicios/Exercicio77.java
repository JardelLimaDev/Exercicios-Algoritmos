package Exercicios;

import java.util.Scanner;

public class Exercicio77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[7];

        System.out.println("Digite os nome pra o array.");
        System.out.println("================================");
        for (int i = 0; i <= 6;i++){
            nomes[i] = scanner.next();
            System.out.println("-----------------------------");
        }


        System.out.println("Nomes digitados em ordem inversa da que forma informados. ");
        for (int j = 6; j >=0; j--){
            System.out.println(nomes[j]);
            System.out.println("-----------------------------");
        }
    }
}
