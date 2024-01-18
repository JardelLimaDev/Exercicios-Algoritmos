package Exercicios;

import java.util.Arrays;
import java.util.Random;

public class Exercicio83 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[20];

        System.out.println("Array com numeros aleatorios de 0 a 99.");
        for (int i = 0; i <= 19; i++){
            numeros[i] = random.nextInt(99);
            System.out.print(numeros[i] + " - ");
        }

        System.out.println("");
        System.out.println("");
        //Arrays.sort(numeros);
        ordenar(numeros);

        System.out.println("Array ordenado");
        System.out.print( Arrays.toString(numeros) + " - ");

    }
// metodo para realizar a ordenacao
    public static void ordenar(int[] meuArray){
        int num = meuArray.length;
        boolean trocar;

        do {
            trocar = false;
            for (int i = 1; i < num; i++){
                if (meuArray[i - 1] > meuArray[i]){
                    int aux = meuArray[i - 1];
                    meuArray[i -1] = meuArray[i];
                    meuArray[i] = aux;
                    trocar = true;
                }
            }
        }while (trocar);
    }
}

