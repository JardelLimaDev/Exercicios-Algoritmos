package Exercicios;

import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio18 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#");
        String anoNascimento = JOptionPane.showInputDialog("Qual o ano do seu nascimento?");
        double idade = 2023 - Double.valueOf(anoNascimento);

        if(idade < 16) {
            System.out.println("Idade insuficiente para voto eleitoral, sua idade é " + formato.format(idade));
        }else {
            JOptionPane.showMessageDialog(null, "Você pode seguir para votação eleitoral, sua idade é " + formato.format(idade));
        }
    }
}
