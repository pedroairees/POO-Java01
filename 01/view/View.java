package view;

import javax.swing.JOptionPane;

public class View {

    // Método para solicitar o custo da mercadoria
    public double pedirCusto() {
        String input = JOptionPane.showInputDialog("Digite o custo da mercadoria:");
        return Double.parseDouble(input); // Converte a entrada para double
    }

    // Método para solicitar o valor do frete
    public double pedirFrete() {
        String input = JOptionPane.showInputDialog("Digite o valor do frete:");
        return Double.parseDouble(input);
    }

    // Método para solicitar despesas eventuais
    public double pedirDespesas() {
        String input = JOptionPane.showInputDialog("Digite o valor das despesas eventuais:");
        return Double.parseDouble(input);
    }

    // Método para solicitar o valor de venda
    public double pedirValorVenda() {
        String input = JOptionPane.showInputDialog("Digite o valor de venda:");
        return Double.parseDouble(input);
    }

    // Método para exibir o resultado do lucro percentual
    public void exibirLucroPercentual(double lucroPercentual) {
        JOptionPane.showMessageDialog(null,
                String.format("A percentagem de lucro é: %.2f%%", lucroPercentual));
    }
}