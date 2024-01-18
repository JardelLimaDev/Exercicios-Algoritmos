package Exercicios;

public class Exercicio93 {
    public static void main(String[] args) {
        contador(4, 20, 3);
    }

    public static void contador(int inicio, int fim, int incremento){
        for (int i = inicio; i <= fim; i = incremento + i){
            System.out.print(i + " >> ");
        }
        System.out.print("FIM");
    }
}
