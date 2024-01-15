package Exercicios;

import java.util.Random;

public class Exercicio76 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[7];

        for (int i = 0; i <= 6; i++){
            numeros[i] = random.nextInt(999);
            System.out.print("| " + numeros[i] + " |");
        }

    }
}
