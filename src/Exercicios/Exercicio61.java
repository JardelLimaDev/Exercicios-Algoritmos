package Exercicios;

public class Exercicio61 {
    public static void main(String[] args) {
        int num  = 30;
        do {
            for (int i = 0; i <= 30; i = i + 3){
                System.out.print(i + " ");
            }
        }while (num < 30);
        System.out.print("Acabou");
    }
}
