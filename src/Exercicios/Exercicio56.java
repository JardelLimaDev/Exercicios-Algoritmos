package Exercicios;

import java.util.Scanner;

public class Exercicio56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        int somaNum = 0;
        int meusNumeros = 0;

        do {
            System.out.println("DIGITE O NUMERO PARA SOMAR");

            meusNumeros = scanner.nextInt();
            somaNum += meusNumeros;
            System.out.println("PARA FINALIZAR DIGITE 1111 PARA CONTINUAR DIGITE 0");

            escolha = scanner.nextInt();
        }while (escolha != 1111);

        System.out.println("SOMA TOTAL DOS NUMEROS DIGITADOS È IGUAL A " + somaNum);
    }
}
