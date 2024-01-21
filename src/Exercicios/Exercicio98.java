package Exercicios;

public class Exercicio98 {
    public static void main(String[] args) {
        System.out.println("A soma do intervalo de numeros entre 1 e 6 é " + superSomador(1,6));
    }
    public static int superSomador(int valor1, int valor2){
        int somaIntervalo = 0;
        for (int i = valor1; i <= valor2; i++){
            somaIntervalo += i;
        }
        return somaIntervalo;
    }
}
