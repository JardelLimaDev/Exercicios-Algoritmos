package Exercicios;

public class Exercicio72 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int soma = 5;
        for (int i = 0; i <= 9; i++){
            numeros[i] = soma;
            soma += 5;
            System.out.print("| " + numeros[i] + " |");
        }
    }
}
