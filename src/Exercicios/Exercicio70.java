package Exercicios;

public class Exercicio70 {
    public static void main(String[] args) {
        int n = 10; // Número de elementos da sequência que você deseja mostrar
        System.out.println("Os primeiros " + n + " elementos da Sequência de Fibonacci são:");

        int primeiroElemento = 0;
        int segundoElemento = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(primeiroElemento + " ");

            int proximoElemento = primeiroElemento + segundoElemento;
            primeiroElemento = segundoElemento;
            segundoElemento = proximoElemento;
        }
    }
}

