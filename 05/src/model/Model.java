package model;

import java.util.Arrays;

public class Model {
    private double[] numeros = new double[3]; // Array para armazenar os 3 números

    // Método para definir um número específico
    public void setNumero(int indice, double numero) {
        if (indice >= 0 && indice < 3) {
            this.numeros[indice] = numero;
        }
    }

    // Método para ordenar os números em ordem crescente
    public double[] ordenarNumeros() {
        Arrays.sort(numeros); // Ordena os números usando o método sort
        return numeros;
    }
}
