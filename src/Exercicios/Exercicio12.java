package Exercicios;

import javax.swing.*;

public class Exercicio12 {
    public static void main(String[] args) {

        String preco = JOptionPane.showInputDialog("Digite o preço do produto");

        double descontoCincoPorcento = Double.valueOf(preco) * 0.05;//promocao de 5% de desconto

        double precoPromocional = Double.valueOf(preco) - descontoCincoPorcento;

        System.out.println("Preço promociona é igual a " + precoPromocional);

    }
}
