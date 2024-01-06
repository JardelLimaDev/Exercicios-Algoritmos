package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int meuNumeroGanhador = 0;
        int numeroAleatorio = 0;
        int[] meusNumeros = new int[4];
        int numerosSorteados = 0;

        System.out.println("VOCÊ TEM 4 CHANCES - DIGITE UM VALOR ENTRE 1 E 10.");
        for (int i = 0; i < 4; i++){
            int meuNumero = 0;
            System.out.println("CHANCE " + (1 + i));
            meuNumero = scanner.nextInt();
            meusNumeros[0 + i] = meuNumero;
        }

        do {
            numeroAleatorio = random.nextInt(10);
            numerosSorteados = numeroAleatorio;
        } while (numeroAleatorio == 0);


        for (int i = 0; i < meusNumeros.length; i++){
            if (meusNumeros[i] == numerosSorteados){
                meuNumeroGanhador = numerosSorteados;
            }
        }
        System.out.println();

        System.out.println("NUMERO SORTEADO FOI...");
        System.out.print(numerosSorteados);
        System.out.println();

        System.out.println("SEUS NUMEROS FORAM...");
        for (int i = 0; i < meusNumeros.length; i++){
            System.out.print(meusNumeros[i] + " ");
        }
        System.out.println();


        for (int i = 0; i < meusNumeros.length; i++){
            if (meusNumeros[i] == meuNumeroGanhador){
                System.out.print("VOCÊ GANHOU COM O NUMERO " + meuNumeroGanhador);
                break;
            }
        }
    }
}
