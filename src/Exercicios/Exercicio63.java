package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 1;
        double somaNumeros = 0;
        double menorValor;
        int contPar = 0;
        double media;
        List<Double> numeros = new ArrayList<>();

        do {
            System.out.println("Digite um numero: ");
            numeros.add(scanner.nextDouble());
            System.out.println("--------------------------------");
            System.out.println("Para encerrar digite 1 para continuar digite 0 ");
            escolha = scanner.nextInt();
        }while(escolha == 0);

        System.out.print("Numeros digitados ");
        for (Double n : numeros) {
            System.out.print(" " + n);
        }
        System.out.println(" ");

        //a) O somatório entre todos os valores
        for (int i = 0; i < numeros.size(); i++) {
            somaNumeros += numeros.get(i);
        }
        System.out.println("A soma de todos os numeros é igual " + somaNumeros);

        //b) Qual foi o menor valor digitado
        menorValor =  numeros.get(0);
        for (int j = 0; j < numeros.size(); j ++){
            if (numeros.get(j) < menorValor){
                menorValor = numeros.get(j);
            }
        }
        System.out.println("Menor valor digitado é igual " + menorValor);

        //c) A média entre todos os valores
        media = somaNumeros / numeros.size();
        System.out.println("Media dos valores digitados é igual " + media);

        //d) Quantos valores são pares
        for (int k = 0; k < numeros.size(); k ++){
            if (numeros.get(k) % 2 == 0){
                contPar ++;
            }
        }
        System.out.println("Quantidade de numeros pares é igual " + contPar);
    }
}
