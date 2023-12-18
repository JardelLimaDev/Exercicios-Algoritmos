package Exercicios;

import javax.swing.*;

public class Exercicio10 {
    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog("Altura da parede ");
        String largura = JOptionPane.showInputDialog("Largura da parede ");

        double m2 = Double.valueOf(altura) * Double.valueOf(largura);

        double tinta = m2 * 2;

        System.out.println("Quantidade de tinta para uma parede de " + m2 + " m² é igual a " + tinta);
    }
}
