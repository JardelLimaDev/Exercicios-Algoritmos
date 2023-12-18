package Exercicios;

/*
 * 37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 até 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%
- Homens
- menos de 20 anos de empresa: +3%
- de 20 até 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio37 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Reajuste Salario");
        frame.setSize(750,300);
        frame.setLocationRelativeTo(null);
        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        JButton button = new JButton("Calcular");
        String[] sexo = {" ","Masculino", "Feminino"};
        JComboBox<String> comboboxGenero = new JComboBox<>(sexo);

        JLabel salario = new JLabel("Digite seu Salario: ");
        JLabel genero = new JLabel("Qual seu sexo: ");
        JLabel anos = new JLabel("Anos Trabalha na empresa: ");
        JLabel tabelaMulher = new JLabel("Mulheres: \n"
                + " Menos de 15 anos de empresa: +5% | \r\n"
                + " De 15 até 20 anos de empresa: +12% | \r\n"
                + " Mais de 20 anos de empresa: +23% ");
        JLabel tabelaHomem = new JLabel("Homens: \r\n"
                + " Menos de 20 anos de empresa: +3% | \r\n"
                + " De 20 até 30 anos de empresa: +13% | \r\n"
                + " Mais de 30 anos de empresa: +25% ");


        JTextField textoSalario = new JTextField(5);
        JTextField textoAno = new JTextField(5);

        painel.add(salario);
        painel.add(textoSalario);
        painel.add(genero);
        painel.add(comboboxGenero);
        painel.add(anos);
        painel.add(textoAno);
        painel.add(tabelaMulher);
        painel.add(tabelaHomem);


        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String salario = textoSalario.getText();
                String ano = textoAno.getText();
                String sexo = comboboxGenero.getSelectedItem().toString();

                while (sexo == "Feminino") {
                    if(Double.valueOf(ano) < 15) {
                        double aumento = Double.valueOf(salario) * 0.05;
                        double novoSalario = aumento + Double.valueOf(salario);
                        JOptionPane.showMessageDialog(frame, "Seu Novo Salario é R$" + novoSalario);
                    }else if(Double.valueOf(ano) >= 15 && Double.valueOf(ano) <= 20) {
                        double aumento = Double.valueOf(salario) * 0.12;
                        double novoSalario = aumento + Double.valueOf(salario);
                        JOptionPane.showMessageDialog(frame, "Seu Novo Salario é R$" + novoSalario);
                    }else {
                        double aumento = Double.valueOf(salario) * 0.23;
                        double novoSalario = aumento + Double.valueOf(salario);
                        JOptionPane.showMessageDialog(frame, "Seu Novo Salario é R$" + novoSalario);
                    }
                    break;
                }

                while (sexo == "Masculino") {
                    if(Double.valueOf(ano) < 20) {
                        double aumento = Double.valueOf(salario) * 0.03;
                        double novoSalario = aumento + Double.valueOf(salario);
                        JOptionPane.showMessageDialog(frame, "Seu Novo Salario é R$" + novoSalario);
                    }else if(Double.valueOf(ano) >= 20 && Double.valueOf(ano) <= 30) {
                        double aumento = Double.valueOf(salario) * 0.13;
                        double novoSalario = aumento + Double.valueOf(salario);
                        JOptionPane.showMessageDialog(frame, "Seu Novo Salario é R$" + novoSalario);
                    }else {
                        double aumento = Double.valueOf(salario) * 0.23;
                        double novoSalario = aumento + Double.valueOf(salario);
                        JOptionPane.showMessageDialog(frame, "Seu Novo Salario é R$" + novoSalario);
                    }
                    break;
                }
            }
        });

        painel.add(button);

        frame.add(painel);

        frame.setVisible(true);
    }
}
