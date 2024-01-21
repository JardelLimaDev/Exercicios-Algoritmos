package Exercicios;

public class Exercicio97 {
    public static void main(String[] args) {
        System.out.println("Maior valor entre os 3 numeros como parametro é " + maior(100,55,355));
    }
    public static int maior(int valor1, int valor2, int valor3){
        int maiorValor = 0;
        if (valor1 > valor2 && valor1 > valor3){
            maiorValor = valor1;
        }else if (valor2 > valor1 && valor2 > valor3){
            maiorValor = valor2;
        }else if(valor3 > valor1 && valor3 > valor2){
            maiorValor = valor3;
        }
        return maiorValor;
    }
}
