package model;

public class Model {
    private double custo;
    private double frete;
    private double despesas;
    private double valorVenda;

    // Métodos getters e setters para os atributos
    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    public double getDespesas() {
        return despesas;
    }

    public void setDespesas(double despesas) {
        this.despesas = despesas;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    // Método para calcular o lucro percentual
    public double calcularLucroPercentual() {
        double custoTotal = custo + frete + despesas;
        double lucro = valorVenda - custoTotal;
        return (lucro / custoTotal) * 100;
    }
}
