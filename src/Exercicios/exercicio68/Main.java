package Exercicios.exercicio68;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int contMulher = 0;
        int contHomensMaior100 = 0;
        double mediaPesoMulheres = 0;
        double somaPesoMulheres = 0;
        double maiorPesoHomens = 0;


        for (int i = 1; i <= 8; i ++){
            System.out.println("Cadastrando a " + i + "° pessoa:");
            System.out.println("Qual o sexo, digite M para masculino e F para feminino:");
            String sexo = scanner.next();
            System.out.println("Qual o peso?");
            double peso = scanner.nextDouble();
            System.out.println("---------------------------------------------------------");
            Pessoa pessoa = new Pessoa(sexo, peso);
            pessoas.add(pessoa);
        }

        System.out.println("Pessoas cadastradas.");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println(" ");

        //a) Quantas mulheres foram cadastradas
        for (Pessoa p : pessoas) {
            if (p.getSexo().equalsIgnoreCase("f")){
                contMulher ++;
            }
        }
        System.out.println("Total de mulheres cadastradas " + contMulher);

        //b) Quantos homens pesam mais de 100Kg
        for (Pessoa p : pessoas) {
            if (p.getPeso() > 100){
                contHomensMaior100 ++;
            }
        }
        System.out.println("Total de homens com mais de 100kg " + contHomensMaior100);

        //c) A média de peso entre as mulheres
        for (Pessoa p : pessoas) {
            if (p.getSexo().equalsIgnoreCase("f")){
                somaPesoMulheres += p.getPeso();
            }
        }
        mediaPesoMulheres = somaPesoMulheres / contMulher;
        System.out.println("Media de peso Mulheres " + mediaPesoMulheres);

        //d) O maior peso entre os homens
        List<Double> pesosHomens = new ArrayList<>();
        for (Pessoa p : pessoas) {
            if (p.getSexo().equalsIgnoreCase("m")){
                pesosHomens.add(p.getPeso());
            }
        }
        maiorPesoHomens = pesosHomens.get(0);
        for (Pessoa p : pessoas) {
            if (p.getPeso() > maiorPesoHomens){
                maiorPesoHomens = p.getPeso();
            }
        }
        System.out.println("Maior peso entre os homens " + maiorPesoHomens);

    }
}
