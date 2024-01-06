package Exercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Exercicio57 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de colaboradores");
        frame.setSize(300,350);

        JPanel panel = new JPanel(new GridBagLayout());

        JButton buttonS = new JButton("Salvar");
        JButton buttonF = new JButton("Finalizar");

        String[] sexo = {" ","Masculino", "Feminino"};
        JComboBox<String> comboboxGenero = new JComboBox<>(sexo);

        JLabel sa = new JLabel("Digite seu Salario: ");
        JLabel ge = new JLabel("Qual seu sexo: ");

        final JTextField textoSalario = new JTextField(10);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(sa, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(textoSalario, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(ge, gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(comboboxGenero,gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonS,gbc);

        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.weightx = 0.5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(buttonF,gbc);

        List<Double> salarios = new ArrayList<>();
        List<String> generos = new ArrayList<>();

        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salarios.add(Double.valueOf(textoSalario.getText()));
                generos.add(comboboxGenero.getSelectedItem().toString());

                textoSalario.setText("");
                comboboxGenero.setSelectedIndex(0);

                JOptionPane.showMessageDialog(frame, "Salvo com sucesso!");
            }
        });

        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double valorTotalSalarioMas = 0;
                double valorTotalSalarioFem = 0;

                for (int i = 0; i < generos.size(); i++){
                    if (generos.get(i).equalsIgnoreCase("Masculino")){
                        double somaSalarioMasc = 0;
                        somaSalarioMasc = salarios.get(i);
                        valorTotalSalarioMas += somaSalarioMasc;
                    }else{
                        double somaSalarioFem = 0;
                        somaSalarioFem = salarios.get(i);
                        valorTotalSalarioFem += somaSalarioFem;
                    }
                }

                JOptionPane.showMessageDialog(frame,
                        "O valor total dos Salarios Masculinos são R$ " + valorTotalSalarioMas +"\n"
                        + "O valor total dos Salarios Femininos são R$ " + valorTotalSalarioFem);
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
