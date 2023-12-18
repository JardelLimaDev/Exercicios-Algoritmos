package Exercicios;

import javax.swing.*;

/*27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO*/
public class Exercicio27 {
    public static void main(String[] args) {
        String media1 = JOptionPane.showInputDialog("Digite a primeira nota");
        String media2 = JOptionPane.showInputDialog("Digite a segunda nota");

        double mediaFinal = (Double.valueOf(media1) + Double.valueOf(media2)) / 2;

        if (mediaFinal <= 4.9) {
            System.out.println("REPROVADO");
        }else if(mediaFinal >= 5 & mediaFinal <= 6.9) {
            System.out.println("RECUPERAÇÃO");
        }else {
            System.out.println("APROVADO");
        }


    }

}
