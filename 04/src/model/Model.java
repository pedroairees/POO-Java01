package model;

public class Model {
    private double[] numeros = new double[3]; // Array para armazenar os 3 números

    // Método para definir um número específico
    public void setNumero(int indice, double numero) {
        if (indice >= 0 && indice < 3) {
            this.numeros[indice] = numero;
        }
    }

    // Método para encontrar o maior número
    public double getMaior() {
        double maior = numeros[0];
        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }

    // Método para encontrar o menor número
    public double getMenor() {
        double menor = numeros[0];
        for (double numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
}
