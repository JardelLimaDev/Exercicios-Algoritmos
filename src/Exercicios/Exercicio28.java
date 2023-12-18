package Exercicios;

import javax.swing.*;

/*28) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP*/
public class Exercicio28 {
    public static void main(String[] args) {
        String largura = JOptionPane.showInputDialog("Digite a largura do terreno.");
        String comprimento = JOptionPane.showInputDialog("Digite o comprimento do terreno");

        double areaTerreno = Double.valueOf(largura) * Double.valueOf(comprimento);

        if (areaTerreno < 100) {
            JOptionPane.showMessageDialog(null, "Area de " + areaTerreno +" m² TERRENO POPULAR");
        }else if (areaTerreno >= 100 & areaTerreno <= 500) {
            JOptionPane.showMessageDialog(null, "Area de " + areaTerreno +" m² TERRENO MASTER");
        }else {
            JOptionPane.showMessageDialog(null, "Area de " + areaTerreno +" m² TERRENO VIP");
        }

    }
}
