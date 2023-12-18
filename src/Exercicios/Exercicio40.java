package Exercicios;

/*
 * 40) Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
 */

public class Exercicio40 {
    public static void main(String[] args) {
        for(int cont = 0; cont < 19; cont = cont + 3) {
            System.out.println(cont);
        }
        System.out.println("Acabou!");
    }
}
