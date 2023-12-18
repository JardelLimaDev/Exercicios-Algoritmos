package Exercicios;

import java.util.Scanner;

//45) O programa acima (exercicio 44) vai ter um problema quando digitarmos o primeiro valor
//maior que o último. Resolva esse problema com um código que funcione em qualquer
//situação.
public class Exercicio45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor inicial:");
        int valorInicial = scanner.nextInt();
        System.out.println("Digite o valor final:");
        int valorFinal = scanner.nextInt();
        System.out.println("Digite o valor do incremento:");
        int incremento = scanner.nextInt();

        if(valorInicial < valorFinal) {
            System.out.print("Contagem: ");
            for (int i = valorInicial; i <= valorFinal; i += incremento) {
                System.out.print(i + " ");
            }
            System.out.print("Acabou");
        }else {
            System.out.print("Contagem: ");
            for (int i = valorFinal; i <= valorInicial; i += incremento) {
                System.out.print(i + " ");
            }
            System.out.print("Acabou");
        }

    }
}
