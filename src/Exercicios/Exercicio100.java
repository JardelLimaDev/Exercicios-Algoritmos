package Exercicios;

public class Exercicio100 {
    public static void main(String[] args) {
        double media = media(2, 4);
        System.out.println("Media das notas é " + media);
        System.out.println("Situação do aluno é " + situacao(media));

    }

    public static double media(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media;
    }

    public static String situacao(double resultado) {
        String situacao = null;
        if (resultado >= 7.0) {
             situacao = "APROVADO";
        } else if (resultado < 7.0 && resultado >= 5.0) {
             situacao = "RECUPERAÇÃO";
        } else if (resultado < 5.0){
             situacao = "REPROVADO";
        }
        return situacao;
    }
}