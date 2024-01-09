package Exercicios.exercicio60;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro Pessoas");
        frame.setSize(350, 400);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JButton buttonS = new JButton("Salvar");
        JButton buttonF = new JButton("Finalizar");

        String[] sexo = {null, "Masculino", "Feminino"};
        JComboBox<String> comboboxGenero = new JComboBox<>(sexo);

        JLabel id = new JLabel("Digite sua idade: ");
        JLabel no = new JLabel("Digite seu nome: ");
        JLabel ge = new JLabel("Qual seu sexo: ");

        JTextField textoIdade = new JTextField(10);
        JTextField textoNome = new JTextField(10);

        panel.add(no);
        panel.add(textoNome);
        panel.add(id);
        panel.add(textoIdade);
        panel.add(ge);
        panel.add(comboboxGenero);
        panel.add(buttonS);
        panel.add(buttonF);

        List<Pessoa> pessoas = new ArrayList<>();

        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    pessoas.add(new Pessoa(textoNome.getText(), Integer.parseInt(textoIdade.getText()),
                            comboboxGenero.getSelectedItem().toString()));

                    textoNome.setText("");
                    textoIdade.setText("");
                    comboboxGenero.setSelectedIndex(0);

                    JOptionPane.showMessageDialog(frame, "Salvo com sucesso!");

                    for (Pessoa p : pessoas) {
                        System.out.println(p);
                    }
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!");
                }
            }
        });

        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //a) O nome da pessoa mais velha
                String nomePessoaMaisVelha = null;
                int idade = pessoas.get(0).getIdade();
                for (int j = 0; j < pessoas.size(); j++){
                    if (pessoas.get(j).getIdade() > idade){
                        idade = pessoas.get(j).getIdade();
                        nomePessoaMaisVelha = pessoas.get(j).getNome();
                    }
                }

                //b) O nome da mulher mais jovem
                String nomeMulherMaisJovem = null;
                List<String> nomesMulheres = new ArrayList<>();
                int idadeFeminina;
                List<Integer> idadesMulheres = new ArrayList<>();
                for (Pessoa p : pessoas){
                    if (p.getSexo().equalsIgnoreCase("Feminino")){
                         idadesMulheres.add(p.getIdade());
                         nomesMulheres.add(p.getNome());
                    }
                }
                idadeFeminina = idadesMulheres.get(0);
                nomeMulherMaisJovem = nomesMulheres.get(0);
                for (int i = 0; i < idadesMulheres.size(); i++){
                    if (idadesMulheres.get(i) < idadeFeminina){
                        nomeMulherMaisJovem = nomesMulheres.get(i);
                    }
                }

                //c) A média de idade do grupo
                float mediaIdadeGrupo;
                int idadesGrupo = 0;
                for (Pessoa p : pessoas) {
                    idadesGrupo += p.getIdade();
                }
                mediaIdadeGrupo = idadesGrupo / pessoas.size();

                //d) Quantos homens tem mais de 30 anos
                int contHomensMaior30 = 0;
                for (Pessoa p : pessoas) {
                    if (p.getSexo().equalsIgnoreCase("Masculino") && p.getIdade() > 30){
                        contHomensMaior30 ++;
                    }
                }

                //e) Quantas mulheres tem menos de 18 anos
                int contMulheresMenor18 = 0;
                for (Pessoa p : pessoas) {
                    if (p.getSexo().equalsIgnoreCase("Feminino") && p.getIdade() < 18){
                        contMulheresMenor18 ++;
                    }
                }

                JOptionPane.showMessageDialog(null, "a) O nome da pessoa mais velha " + nomePessoaMaisVelha + "\n" +
                        "b) O nome da mulher mais jovem " + nomeMulherMaisJovem + "\n" +
                        "c) A média de idade do grupo " + mediaIdadeGrupo + "\n" +
                        "d) Quantos homens tem mais de 30 anos " + contHomensMaior30 + "\n" +
                        "e) Quantas mulheres tem menos de 18 anos " + contMulheresMenor18);
            }
        });


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
