package Exercicios;

//54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
//no final:
//a) Qual foi a média de altura do grupo
//b) Quantas pessoas pesam mais de 90Kg
//c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
//d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.

import Exercicios.exrcicio53.Pessoa;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Exercicio54 {
    public static void main(String[] args) {
        class CadastroPessoa {
            private double peso;
            private float altura;

            public CadastroPessoa(double peso, float altura) {
                this.peso = peso;
                this.altura = altura;
            }

            public double getPeso() {
                return peso;
            }

            public void setPeso(double peso) {
                this.peso = peso;
            }

            public float getAltura() {
                return altura;
            }

            public void setAltura(float altura) {
                this.altura = altura;
            }

            @Override
            public String toString() {
                return "CadastroPessoa{" +
                        "peso=" + peso +
                        ", altura=" + altura +
                        '}';
            }
        }

        float mediaAltura = 0;
        float somaAltura = 0;
        int contMaior90 = 0;
        int contMenor50Menor160 = 0;
        int contMaior100Maiorr190 = 0;

        DecimalFormat floatFormatado = new DecimalFormat("#.00");

        CadastroPessoa pessoa1 = new CadastroPessoa(83d, 1.69f);
        CadastroPessoa pessoa2 = new CadastroPessoa(100d, 1.99f);
        CadastroPessoa pessoa3 = new CadastroPessoa(49d, 1.45f);
        CadastroPessoa pessoa4 = new CadastroPessoa(120d, 1.99f);
        CadastroPessoa pessoa5 = new CadastroPessoa(145d, 1.85f);
        CadastroPessoa pessoa6 = new CadastroPessoa(53d, 1.52f);
        CadastroPessoa pessoa7 = new CadastroPessoa(83d, 1.71f);

        List<CadastroPessoa> cadastradas = new ArrayList<>();
        cadastradas.add(pessoa1);
        cadastradas.add(pessoa2);
        cadastradas.add(pessoa3);
        cadastradas.add(pessoa4);
        cadastradas.add(pessoa5);
        cadastradas.add(pessoa6);
        cadastradas.add(pessoa7);

        //media altura
        for (CadastroPessoa p : cadastradas){
            somaAltura += p.getAltura();
        }
        mediaAltura = somaAltura / 7;

        //pessoas que pesam mais de 90kg
        for (CadastroPessoa p : cadastradas){
            if (p.getPeso() > 90d){
                contMaior90 ++;
            }
        }

        //pessoas que pesam menos de 50Kg tem menos de 1.60m
        for (CadastroPessoa p : cadastradas){
            if (p.getPeso() < 50d && p.getAltura() < 1.60f){
                contMenor50Menor160 ++;
            }
        }

        //pessoas que medem mais de 1.90m pesam mais de 100Kg
        for (CadastroPessoa p : cadastradas){
            if (p.getAltura() > 1.90f && p.getPeso() > 100d){
                contMaior100Maiorr190 ++;
            }
        }

        System.out.println("------ BANCO DE PESSOAS CADASTRADAS -------");
        for (CadastroPessoa p : cadastradas) {
            System.out.println(p);
        }
        System.out.println("------------------------------------------------");
        System.out.println("a) Qual foi a média de altura do grupo\r\n" + floatFormatado.format(mediaAltura)
                + "\n"	+ "b) Quantas pessoas pesam mais de 90Kg\r\n" + contMaior90
                + "\n"	+ "c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m\r\n" + contMenor50Menor160
                + "\n"	+ "d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.\r\n" + contMaior100Maiorr190);
    }
}


