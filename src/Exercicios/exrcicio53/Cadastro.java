package Exercicios.exrcicio53;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    public static void main(String[] args) {
        int contHomens = 0;
        int contMulheres = 0;
        int somaIdade = 0;
        float mediaIdade = 0;
        int somaIdadeHomens = 0;
        float mediaIdadeHomens = 0;
        int idadeMulheresMaiorQueVinte = 0;

        Pessoa pessoa = new Pessoa("Jardel", 30, "masculino");
        Pessoa pessoa2 = new Pessoa("Jamille", 27, "feminino");
        Pessoa pessoa3 = new Pessoa("Luiza", 57, "feminino");
        Pessoa pessoa4 = new Pessoa("Antonia", 18, "feminino");
        Pessoa pessoa5 = new Pessoa("Jose", 31, "masculino");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);

        for (int i = 0; i <= 4; i++) {
            if (pessoas.get(0 + i).getSexo() == "masculino") {
                contHomens++;
            } else if (pessoas.get(0 + i).getSexo() == "feminino") {
                contMulheres++;
            }
        }

        for (int i = 0; i <= 4; i++) {
            somaIdade += pessoas.get(0 + i).getIdade();
        }

        mediaIdade = somaIdade / 5;

        for (int i = 0; i <= 4; i++) {
            if (pessoas.get(0 + i).getSexo() == "masculino") {
                somaIdadeHomens += pessoas.get(0 + i).getIdade();
            }
        }

        mediaIdadeHomens = somaIdadeHomens / contHomens;

        for (int i = 0; i <= 4; i++) {
            if (pessoas.get(0 + i).getSexo() == "feminino" & pessoas.get(0 + i).getIdade() > 20) {
                idadeMulheresMaiorQueVinte++;
            }
        }

        System.out.println("------ BANCO DE PESSOAS CADASTRADAS -------");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
        System.out.println("a) Quantos homens foram cadastrados\r\n" + contHomens
                + "\n"	+ "b) Quantas mulheres foram cadastradas\r\n" + contMulheres
                + "\n"	+ "c) A média de idade do grupo\r\n" + mediaIdade
                + "\n"	+ "d) A média de idade dos homens\r\n" + mediaIdadeHomens
                + "\n"	+ "e) Quantas mulheres tem mais de 20 anos\r\n" + idadeMulheresMaiorQueVinte + "\n");

    }
}
