package Exercicios;

/*
 * 43) Desenvolva um algoritmo que mostre uma contagem regressiva de 30 até 1,
marcando os números que forem divisíveis por 4, exatamente como mostrado abaixo:
30 29 [28] 27 26 25 [24] 23 22 21 [20] 19 18 17 [16]...
 */

public class Exercicio43 {
    public static void main(String[] args) {
        for(int cont = 30; cont >= 1; cont--) {
            if(cont % 4 == 0) {
                System.out.print(" [" + cont + "] ");
            }else {
                System.out.print(" " + cont + " ");
            }
        }
    }
}
