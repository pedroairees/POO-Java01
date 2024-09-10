package model;

public class Model {
    private double largura;
    private double altura;

    // Constantes para o consumo de tinta e capacidade da lata
    private final double CONSUMO_TINTA_POR_METRO = 300.0; // ml por metro quadrado
    private final double CAPACIDADE_LATA = 2000.0; // ml (2 litros por lata)

    // Métodos getters e setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular a quantidade de latas de tinta necessárias
    public int calcularQuantidadeDeLatas() {
        double area = largura * altura; // Área da parede em metros quadrados
        double consumoTotal = area * CONSUMO_TINTA_POR_METRO; // ml necessários
        double quantidadeDeLatas = consumoTotal / CAPACIDADE_LATA; // Dividindo pela capacidade da lata
        return (int) Math.ceil(quantidadeDeLatas); // Arredonda para cima o número de latas
    }
}
