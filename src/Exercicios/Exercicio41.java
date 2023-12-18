package Exercicios;

/*
 * 41) Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
 */


public class Exercicio41 {
    public static void main(String[] args) {
        int contador = 0;
        for(contador = 100; contador > -1; contador = contador - 5) {
            System.out.println(contador);
        }
        System.out.println("Acabou!");
    }
}
