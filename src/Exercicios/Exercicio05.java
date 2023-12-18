package Exercicios;

import javax.swing.*;

public class Exercicio05 {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Valor da nota 1");
        String nota2 = JOptionPane.showInputDialog("Valor da nota 2");

        double media = ((Double.valueOf(nota1)) + (Double.valueOf(nota2))) / 2;

        System.out.println("A media das notas "+ nota1 +" e "+ nota2 +" é "+ media);
    }
}
