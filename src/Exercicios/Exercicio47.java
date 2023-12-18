package Exercicios;

//47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
//450 + 400 + 350 + 300 + ... + 50 + 0
public class Exercicio47 {
    public static void main(String[] args) {
        int soma = 0;
        int valorTotal = 0;
        for (int i = 500; i >= 0; i -= 50) {
            soma += i;
            valorTotal = soma;
        }

        System.out.println("A soma dos valores 500 + 450 + 400 + 350 + 300 + ... + 50 + 0 = " + valorTotal);
    }
}
