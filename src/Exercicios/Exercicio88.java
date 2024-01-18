package Exercicios;

public class Exercicio88 {
    public static void main(String[] args) {
        String meuTexto = "Aprendendo algoritmos";
        System.out.println("+-------=======------+");
        gerador(meuTexto, 4);
        System.out.println("+-------=======------+");
    }

    public static void gerador(String texto, int qtd){
        for (int i = 0; i < qtd; i++){
            System.out.println(texto);
        }
    }
}
