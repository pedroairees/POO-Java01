package model;

public class Model {
    private double[] notas = new double[4]; // Array para armazenar as 4 notas

    // Método para definir uma nota específica
    public void setNota(int indice, double nota) {
        if (indice >= 0 && indice < 4) {
            this.notas[indice] = nota;
        }
    }

    // Método para calcular a média das notas
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / 4; // Calcula a média das 4 notas
    }
}
