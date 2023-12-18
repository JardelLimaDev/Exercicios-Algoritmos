package Exercicios;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {

        Scanner valor1 = new Scanner(System.in);
        Scanner valor2 = new Scanner(System.in);
        Scanner valor3 = new Scanner(System.in);

        System.out.println("Digite o valor do Primeiro segmento de reta:");
        double reta1 = valor1.nextInt();

        System.out.println("Digite o valor do Segundo segmento de reta:");
        double reta2 = valor2.nextInt();

        System.out.println("Digite o valor do Terceiro segmento de reta:");
        double reta3 = valor2.nextInt();

        if (reta1 < reta2 + reta3) {
            if (reta2 < reta1 + reta3) {
                if (reta3 < reta1 + reta2) {
                    System.out.println("Os segmentos de retas formam um triangulo!");
                }else {
                    System.out.println("Os segmentos de retas  informados não formam um triangulo");
                }
            }
        }
    }
}
