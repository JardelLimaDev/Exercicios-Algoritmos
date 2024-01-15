package Exercicios;

public class Exercicio73 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int cont = 9;

        for (int i = 0; i <= 9; i++){
            numeros[i] = cont;
            cont = cont - 1;
            System.out.print("| " + numeros[i] + " |");
        }
    }
}
