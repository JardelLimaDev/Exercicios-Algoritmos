package Exercicios;

import java.util.Scanner;

//51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
//qual foi o maior e qual foi o menor preço digitados.
public class Exercicio51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] precosProdutos = new float[8];
        float maiorPreco = 0;
        float menorPreco = 0;

        System.out.println("Digite o preço dos 8 produtos: ");
        precosProdutos[0] = scanner.nextFloat();
        precosProdutos[1] = scanner.nextFloat();
        precosProdutos[2] = scanner.nextFloat();
        precosProdutos[3] = scanner.nextFloat();
        precosProdutos[4] = scanner.nextFloat();
        precosProdutos[5] = scanner.nextFloat();
        precosProdutos[6] = scanner.nextFloat();
        precosProdutos[7] = scanner.nextFloat();

        for(int i = 0; i <= 7; i++) {
            System.out.println("R$ " + precosProdutos[0 + i]);
            if(precosProdutos[0 + i] > maiorPreco ) {
                maiorPreco =  precosProdutos[0 + i];
            }if (precosProdutos[0 + i] < maiorPreco) {
                menorPreco = precosProdutos[0 + i];
            }
        }

        System.out.println("Maior preço R$ " + maiorPreco);
        System.out.println("Menor preço R$ " + menorPreco);
    }
}
