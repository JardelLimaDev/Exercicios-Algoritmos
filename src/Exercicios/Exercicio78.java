package Exercicios;

import java.util.Random;

//todo numero inteiro é multiplo de 10
//poderia usar tipo double é fazer uma condição

public class Exercicio78 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[15];

        for (int i = 0; i <= 14; i++){
            numeros[i] = random.nextInt(999);
            System.out.print("| " + numeros[i] + " |");
        }
    }
}
