package Exercicios;

import java.util.Scanner;

public class Exercicio67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor inteiro para iniciarmos a contagem!");
        int numero = scanner.nextInt();

        for (int i = 0; i <= numero; i++){
            System.out.print(i + ", ");
        }
        System.out.print("FIM");
    }

}
