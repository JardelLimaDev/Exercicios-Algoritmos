package Exercicios;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio16 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#");

        String qtdCigarros = JOptionPane.showInputDialog("Digite a quantidade de cigarros fumados por dia");
        String qtdAnos = JOptionPane.showInputDialog("A quantos anos é fumante?");

        double dias = Double.valueOf(qtdAnos) * 365;
        double diasPerdidos = (Double.valueOf(qtdCigarros) * 0.166) * dias;
        double anosPerdidos = (diasPerdidos / 365);

        JOptionPane.showMessageDialog(null, "Dias perdidos para o cigarro " + formato.format(diasPerdidos) + "\n"
                + "Anos perdidos para o cigarro " + formato.format(anosPerdidos));

        //teste
    }
}
