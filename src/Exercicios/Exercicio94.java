package Exercicios;

public class Exercicio94 {
    public static void main(String[] args) {
        fibonacci(9);
    }

    public static void fibonacci(int termos){
        int qtdTermos = termos;
        int primeiroElemento = 0;
        int segundoElemento = 1;
        for (int i = 0; i < qtdTermos; i++) {
            System.out.print(primeiroElemento + " >> ");

            int proximoElemento = primeiroElemento + segundoElemento;
            primeiroElemento = segundoElemento;
            segundoElemento = proximoElemento;
        }
        System.out.print("FIM");
    }
}
