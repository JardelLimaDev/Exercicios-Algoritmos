package Exercicios;

import javax.swing.*;

public class Exercicio24 {
    public static void main(String[] args) {

        double precoPassagem = 0;
        double valorKm = 0;
        String distancia = JOptionPane.showInputDialog("Informe a distancia percorrida (km)");

        if(Double.valueOf(distancia) <= 200) {
            valorKm = Double.valueOf(distancia) * 0.50;
        }else {
            valorKm = Double.valueOf(distancia) * 0.45;
        }

        precoPassagem = valorKm;

        System.out.println("Preço da passagem é igual a R$ " + precoPassagem);
    }
}
