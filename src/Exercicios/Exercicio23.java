package Exercicios;

import javax.swing.*;

public class Exercicio23 {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite seu nome");

        Object[] escolhaSexo = {"Masculino", "Feminino", "Não declarar"};
        int escolha = JOptionPane.showOptionDialog(null, "Escolha seu gênero.", "teste",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, escolhaSexo, escolhaSexo[2]);

        String valorCompra = JOptionPane.showInputDialog("Digite o valor total da compra");

        if (escolha == JOptionPane.YES_OPTION) {
            String genero = "Masculino";
            double valorDesconto = Double.valueOf(valorCompra) * 0.05;
            double valorCompraDesconto = Double.valueOf(valorCompra) - valorDesconto;
            JOptionPane.showMessageDialog(null, "Obrigado pela compra, e volte sempre! \n" +
                    nome + "\n" + genero + "\n" + "Valor da compra com Desconto por sexo \n" +
                    "R$ " + valorCompraDesconto);
        }else if (escolha == JOptionPane.NO_OPTION) {
            String genero = "Feminino";
            double valorDesconto = Double.valueOf(valorCompra) * 0.13;
            double valorCompraDesconto = Double.valueOf(valorCompra) - valorDesconto;
            JOptionPane.showMessageDialog(null, "Obrigado pela compra, e volte sempre! \n" +
                    nome + "\n" + genero + "\n" + "Valor da compra com Desconto por sexo \n" +
                    "R$ " + valorCompraDesconto);
        }else if (escolha == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Não escolher o gênero, você não ganha desconto");
            JOptionPane.showMessageDialog(null, "Obrigado pela compra, e volte sempre! \n" +
                    nome + "\n" + "\n" + "R$ " + valorCompra);
        }
    }
}
