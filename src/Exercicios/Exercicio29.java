package Exercicios;



/*29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercicio29 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anos de trabalho Funcionarios");
        JPanel panelFuncioanrios = new JPanel();
        JButton buttonEnviar = new JButton("Enviar");

        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);
        panelFuncioanrios.setLayout(new GridLayout(4, 2));

        JLabel labelNome = new JLabel("Digite seu nome");
        JTextField textFieldNome = new JTextField(5);

        JLabel labelSalario = new JLabel("Digite seu salario");
        JTextField textFieldSalario = new JTextField(5);

        JLabel labelAnosContribuicao = new JLabel("Digite quantos anos de contribuição");
        JTextField textFieldAnosContribuicao = new JTextField(5);

        panelFuncioanrios.add(labelNome);
        panelFuncioanrios.add(textFieldNome);

        panelFuncioanrios.add(labelSalario);
        panelFuncioanrios.add(textFieldSalario);

        panelFuncioanrios.add(labelAnosContribuicao);
        panelFuncioanrios.add(textFieldAnosContribuicao);

        panelFuncioanrios.add(buttonEnviar);

        frame.add(panelFuncioanrios);

        buttonEnviar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textFieldNome.getText();
                String salario = textFieldSalario.getText();
                String anos = textFieldAnosContribuicao.getText();

                if (Double.valueOf(anos) <= 3) {
                    double aumentoSalario = Double.valueOf(salario) * 0.03;
                    double novoSalario = Double.valueOf(salario) + aumentoSalario;

                    JOptionPane.showMessageDialog(frame, nome +  "\nVocê ganhou um aumento de salario \n" +
                            "Seu novo salario é R$ " + novoSalario);
                }else if(Double.valueOf(anos) > 3 & Double.valueOf(anos) < 10) {
                    double aumentoSalario = Double.valueOf(salario) * 0.125;
                    double novoSalario = Double.valueOf(salario) + aumentoSalario;

                    JOptionPane.showMessageDialog(frame, nome +  "\nVocê ganhou um aumento de salario \n" +
                            "Seu novo salario é R$ " + novoSalario);
                }else {
                    double aumentoSalario = Double.valueOf(salario) * 0.2;
                    double novoSalario = Double.valueOf(salario) + aumentoSalario;

                    JOptionPane.showMessageDialog(frame, nome +  "\nVocê ganhou um aumento de salario \n" +
                            "Seu novo salario é R$ " + novoSalario);
                }

            }
        });

        frame.setVisible(true);
    }
}
