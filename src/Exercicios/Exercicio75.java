package Exercicios;

public class Exercicio75 {
    public static void main(String[] args) {
        int[] fibonacci = new int[15];
        int n = 15; // Número de elementos da sequência que você deseja mostrar
        System.out.println("Os primeiros " + n + " elementos da Sequência de Fibonacci são:");

        int primeiroElemento = 0;
        int segundoElemento = 1;

        for (int i = 0; i < n; i++) {
            fibonacci[i] = primeiroElemento;
            System.out.print(fibonacci[i] + " ");

            int proximoElemento = primeiroElemento + segundoElemento;
            primeiroElemento = segundoElemento;
            segundoElemento = proximoElemento;
        }
    }
}
