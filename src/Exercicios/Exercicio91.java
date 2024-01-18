package Exercicios;

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int meuValor1 = scanner.nextInt();
        System.out.println("Digite o segundo valor:");
        int meuValor2 = scanner.nextInt();

        maior(meuValor1, meuValor2);
    }

    public static void maior(int valor1, int valor2){
        if (valor2 > valor1){
            System.out.println("O segundo valor digitado é maior que o primeiro");
        }else {
            System.out.println("O primeiro valor digitado é maior que o segundo");
        }if (valor2 == valor1){
            System.out.println("O primeiro valor digitado é igual o segundo valor");
        }
    }
}
