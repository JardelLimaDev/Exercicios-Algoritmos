package Exercicios;

/*30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo
de triângulo será formado:
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes*/

import java.util.Scanner;

public class Exercicio30 {
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

        if(reta1 == reta2) {
            if(reta2 == reta3) {
                if(reta3 == reta1) {
                    System.out.println("Os segmentos de retas formam um triangulo EQUILATERO");
                }
            }
        }

        if (reta1 == reta2 || reta1 == reta3 || reta2 == reta3 ) {
            System.out.println("Os segmentos de retas formam um triangulo ISOSCELES");
        }else {
            System.out.println("Os segmentos de retas formam um triangulo ESCALENO");
        }
    }
}
