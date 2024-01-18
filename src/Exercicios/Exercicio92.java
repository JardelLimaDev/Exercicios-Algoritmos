package Exercicios;

import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero para o teste de par ou impar:");
        int numero = scanner.nextInt();

        parOuImpar(numero);
    }

    public static void parOuImpar(int numero){
        if (numero % 2 == 0){
            System.out.println("O numero digitado é par");
        }else
            System.out.println("O numero digitado é impar");
    }

}
