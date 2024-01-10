package Exercicios.exercicio68;

public class Pessoa {
    private String sexo;
    private double peso;

    public Pessoa(String sexo, double peso) {
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "sexo='" + sexo + '\'' +
                ", peso=" + peso +
                '}';
    }
}
