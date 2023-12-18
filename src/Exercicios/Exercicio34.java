package Exercicios;

/*
 * 34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
da altura)
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Exercicio34 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("00.##");

        JFrame frame = new JFrame("Calculo IMC");
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(250,400);
        frame.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

        JButton button = new JButton("Calcular IMC");

        JLabel labelAltura = new JLabel("Qual sua Altura:");
        JLabel labelPeso = new JLabel("Qual sua Peso:");
        JLabel labelM = new JLabel("cm");
        JLabel labelKg = new JLabel("Kg");

        JTextField textoAltura = new JTextField(5);
        JTextField textoPeso = new JTextField(5);

        painel.add(labelAltura);
        painel.add(textoAltura);
        painel.add(labelM);
        painel.add(labelPeso);
        painel.add(textoPeso);
        painel.add(labelKg);

        JLabel abaixoPeso = new JLabel("Abaixo de 18.5: Abaixo do peso");
        JLabel pesoIdeal = new JLabel("Entre 18.5 e 25: Peso ideal");
        JLabel sobrepeso = new JLabel("Entre 25 e 30: Sobrepeso");
        JLabel obesidade = new JLabel("Entre 30 e 40: Obesidade");
        JLabel obesidadeMorbida = new JLabel("Acima de 40: Obsidade mórbida");

        painel.add(abaixoPeso);
        painel.add(pesoIdeal);
        painel.add(sobrepeso);
        painel.add(obesidade);
        painel.add(obesidadeMorbida);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String altura = textoAltura.getText();
                String peso = textoPeso.getText();

                double alturaMetro = Double.valueOf(altura) / 100;

                double imc = Double.valueOf(peso) / (alturaMetro *  alturaMetro);

                if(imc < 18.5) {
                    JOptionPane.showMessageDialog(frame, "Seu IMC " + formato.format(imc) + "\n" + "Abaixo de 18.5: Abaixo do peso");
                }else if(imc >= 18.5 && imc < 25) {
                    JOptionPane.showMessageDialog(frame, "Seu IMC " + formato.format(imc) + "\n" + "Entre 18.5 e 25: Peso ideal");
                }else if(imc >= 25 && imc < 30) {
                    JOptionPane.showMessageDialog(frame, "Seu IMC " + formato.format(imc) + "\n" + "Entre 25 e 30: Sobrepeso");
                }else if(imc >= 30 && imc < 40) {
                    JOptionPane.showMessageDialog(frame, "Seu IMC " + formato.format(imc) + "\n" + "Entre 30 e 40: Obesidade");
                }else if(imc > 40) {
                    JOptionPane.showMessageDialog(frame, "Seu IMC " + formato.format(imc) + "\n" + "Acima de 40: Obseidade mórbid");
                }

            }
        });

        painel.add(button);

        frame.add(painel);

        frame.setVisible(true);

    }
}
