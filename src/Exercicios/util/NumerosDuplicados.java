package Exercicios.util;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class NumerosDuplicados {
    public static void main(String[] args) {
        List<Numeros> numeros = new ArrayList<Numeros>();

        for (int qtdNum = 1; qtdNum <= 5; qtdNum ++) {
            Numeros numeroInp = new Numeros();
            //coletando dados do usuario
            String numero = JOptionPane.showInputDialog("Digite o numero de posição " + qtdNum);

            numeroInp.setNumero(Integer.valueOf(numero));

            numeros.add(numeroInp);
        }

        for (Numeros numero : numeros) {
            System.out.println(numero.getNumero());
        }

        for (int i = 0; i < numeros.size() - 1; i++) {
            for(int j = i + 1; j < numeros.size(); j++) {
                if(numeros.get(i).equals(numeros.get(j))) {
                    Numeros numero = numeros.get(i);
                    System.out.println("Elemento do index " + i + " é igual ao elemento do index " + j);
                    System.out.println(numero.getNumero());
                }
            }
        }
    }
}
