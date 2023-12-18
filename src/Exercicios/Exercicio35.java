package Exercicios;

/*
 * 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Exercicio35 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0,000.##");
        JFrame frame =  new JFrame("Aluguel de carros");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Calcular");

        JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());

        String [] tipoCarro = {"Popular", "Luxo"};

        JComboBox<String> comboboxTipoCarros = new JComboBox<>(tipoCarro);

        JLabel carroTipo = new JLabel("Qual o tipo de carro alugado: ");
        JLabel dias = new JLabel("Quantos dias de aluguel: ");
        JLabel km = new JLabel("Quantos Quilometros foram percorridos: ");

        JTextField textoKmPercorridos = new JTextField(5);
        JTextField diasAlugados = new JTextField(5);

		/*
		 * JLabel tabelaAluguelCarros = new JLabel("- Carros populares (aluguel de R$90 por dia) \r\n"
				+ "- Até 100Km percorridos: R$0,20 por Km \r\n"
				+ "- Acima de 100Km percorridos: R$0,10 por Km \r\n"
				+ "- Carros de luxo (aluguel de R$150 por dia) \r\n"
				+ "- Até 200Km percorridos: R$0,30 por Km \r\n"
				+ "- Acima de 200Km percorridos: R$0,25 por Km");
		 */


        painel.add(carroTipo);
        painel.add(comboboxTipoCarros);
        painel.add(dias);
        painel.add(diasAlugados);
        painel.add(km);
        painel.add(textoKmPercorridos);
        //painel.add(tabelaAluguelCarros);
        painel.add(button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoCarro = comboboxTipoCarros.getSelectedItem().toString();
                String dias = diasAlugados.getText();
                String km = textoKmPercorridos.getText();
                double kmPercorridos = Double.valueOf(km);
                double diasALugados = Double.valueOf(dias);


                if (tipoCarro == "Popular" && kmPercorridos <= 100) {
                    double valorPago = (diasALugados * 90) + (kmPercorridos * 0.20);
                    JOptionPane.showMessageDialog(frame, "Total a Pagar R$ " + formato.format(valorPago));
                }else if (tipoCarro == "Popular" && kmPercorridos > 100) {
                    double valorPago = (diasALugados * 90) + (kmPercorridos * 0.10);
                    JOptionPane.showMessageDialog(frame, "Total a Pagar R$ " + formato.format(valorPago));
                }else if (tipoCarro == "Luxo" && kmPercorridos <= 200) {
                    double valorPago = (diasALugados * 150) + (kmPercorridos * 0.30);
                    JOptionPane.showMessageDialog(frame, "Total a Pagar R$ " + formato.format(valorPago));
                }else if (tipoCarro == "Luxo" && kmPercorridos > 200) {
                    double valorPago = (diasALugados * 150) + (kmPercorridos * 0.25);
                    JOptionPane.showMessageDialog(frame, "Total a Pagar R$ " + formato.format(valorPago));
                }
            }
        });

        frame.add(painel);
        frame.setVisible(true);
    }
}
