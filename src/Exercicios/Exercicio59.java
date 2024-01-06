package Exercicios;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Exercicio59 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro Funcionarios");
        frame.setSize(350,200);
        frame.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));

        JButton buttonS = new JButton("Salvar");
        JButton buttonF = new JButton("Finalizar");

        String[] sexo = {" ","Masculino", "Feminino"};
        JComboBox<String> comboboxGenero = new JComboBox<>(sexo);

        JLabel id = new JLabel("Digite sua idade: ");
        JLabel ge = new JLabel("Qual seu sexo: ");

        JTextField textoIdade = new JTextField(10);

        panel.add(id);
        panel.add(textoIdade);
        panel.add(ge);
        panel.add(comboboxGenero);
        panel.add(buttonS);
        panel.add(buttonF);

        List<Integer> idades = new ArrayList<>();
        List<String> generos = new ArrayList<>();

        buttonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idades.add(Integer.parseInt(textoIdade.getText()));
                generos.add(comboboxGenero.getSelectedItem().toString());

                textoIdade.setText("");
                comboboxGenero.setSelectedIndex(0);

                JOptionPane.showMessageDialog(frame, "Salvo com sucesso!");
            }
        });

        buttonF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int maiorIdade= 0;
                int contMasculino = 0;
                int menorIdadeFeminino = 0;
                float mediaIdadeHomens = 0f;

                //a) qual é a maior idade lida
                for (int i = 0; i < idades.size(); i++){
                    if (idades.get(i) > maiorIdade){
                        maiorIdade = idades.get(i);
                    }
                }

                //b) quantos homens foram cadastrados
                for (int j = 0; j < generos.size(); j++){
                    if (generos.get(j).equalsIgnoreCase("Masculino")){
                        contMasculino ++;
                    }
                }

                //c) qual é a idade da mulher mais jovem
                List<Integer> idadesFemininas = new ArrayList<>();
                for(int k = 0; k < idades.size(); k++){
                    if (generos.get(k).equalsIgnoreCase("Feminino")){
                        idadesFemininas.add(idades.get(k));
                    }
                }
                menorIdadeFeminino = idadesFemininas.get(0);
                for (int idade : idadesFemininas) {
                    if (idade < menorIdadeFeminino ){
                        menorIdadeFeminino = idade;
                    }
                }

                //d) qual é a média de idade entre os homens
                List<Integer> idadesMasculinas = new ArrayList<>();
                for (int n = 0; n < generos.size(); n++){
                    if (generos.get(n).equalsIgnoreCase("Masculino")){
                        idadesMasculinas.add(idades.get(n));
                    }
                }
                int somaIdade = 0;
                for (int x = 0; x < idadesMasculinas.size(); x++) {
                    somaIdade += idadesMasculinas.get(x);
                }
                mediaIdadeHomens = somaIdade / idadesMasculinas.size();

                JOptionPane.showMessageDialog(frame, "a) qual é a maior idade lida " + maiorIdade + "\n" +
                "b) quantos homens foram cadastrados " + contMasculino + "\n" +
                "c) qual é a idade da mulher mais jovem " + menorIdadeFeminino + "\n" +
                "d) qual é a média de idade entre os homens " + mediaIdadeHomens);

                for (String genero : generos) {
                    System.out.print(genero + " ");
                }
                System.out.println(" ");
                for (Integer idade : idades) {
                    System.out.print(idade + " ");
                }
            }
        });


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
 }
