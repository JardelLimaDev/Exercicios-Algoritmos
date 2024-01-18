package Exercicios;

public class Exercicio89 {
    public static void main(String[] args) {
        String meuTexto = "aprendendo algoritmos";
        gerador(meuTexto, 4, 3);
    }

    public static void gerador(String texto, int qtd, int borda){
        switch (borda){
            case 1:
                System.out.println("+-------=======------+");
                for (int i = 0; i < qtd; i++){
                    System.out.println(texto);
                }
                System.out.println("+-------=======------+");
                break;
            case 2:
                System.out.println("~~~~~~~~:::::::~~~~~~~");
                for (int i = 0; i < qtd; i++){
                    System.out.println(texto);
                }
                System.out.println("~~~~~~~~:::::::~~~~~~~");
                break;
            case 3:
                System.out.println("<<<<<<<<------->>>>>>>");
                for (int i = 0; i < qtd; i++){
                    System.out.println(texto);
                }
                System.out.println("<<<<<<<<------->>>>>>>");
                break;
        }
    }
}
