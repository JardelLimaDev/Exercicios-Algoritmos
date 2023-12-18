package Exercicios;

//44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
//incremento, mostrando em seguida todos os valores no intervalo:
//Ex: Digite o primeiro Valor: 3
//Digite o último Valor: 10
//Digite o incremento: 2
//Contagem: 3 5 7 9 Acabou!

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor inicial:");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite o valor final:");
        int valorFinal = scanner.nextInt();
        System.out.println("Digite o valor do incremento:");
        int incremento = scanner.nextInt();

        System.out.print("Contagem: ");
        for (int i = valorInicial; i <= valorFinal; i += incremento) {
            System.out.print(i + " ");
        }
        System.out.print("Acabou");

    }
}
