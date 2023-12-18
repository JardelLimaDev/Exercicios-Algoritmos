package Exercicios;

import javax.swing.*;

public class Exercicio22 {
    public static void main(String[] args) {
        String anoNascimento = JOptionPane.showInputDialog("Digite o ano do seu nascimento");

        if(2023 - Double.valueOf(anoNascimento) >= 18) {
            double idade =2023 - Double.valueOf(anoNascimento);
            double anosMais = idade - 18;
            System.out.println("Já se passaram " + anosMais + " anos da epoca do alistamento");
        }
        if(2023 - Double.valueOf(anoNascimento) < 18) {
            double idade =2023 - Double.valueOf(anoNascimento);
            double anosMenos = 18 - idade;
            System.out.println("Faltam " + anosMenos + " anos para o alistamento");
        }
    }
}
