package Exercicios;

import javax.swing.*;

public class Exercicio08 {
    public static void main(String[] args) {
        String metro = JOptionPane.showInputDialog("Valor em metros");

        double km = Double.valueOf(metro) / 1000;
        double cm = Double.valueOf(metro) * 100;
        double mm = Double.valueOf(metro) * 1000;

        System.out.println("O valor de " + metro + " metros em:");
        System.out.println("Quilometro é igual a " + km);
        System.out.println("Centimetro é igual a " + cm);
        System.out.println("Milimetro é igual a " + mm);

    }
}
