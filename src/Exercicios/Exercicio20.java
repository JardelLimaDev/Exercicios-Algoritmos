package Exercicios;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero");
        int testeNumero = numero.nextInt();

        if(testeNumero % 2 == 0) {
            System.out.println("O numero " + testeNumero + " é par.");
        }else {
            System.out.println("O numero " + testeNumero + " é impar5");
        }
    }
}
