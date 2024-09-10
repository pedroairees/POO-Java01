package view;

import javax.swing.JOptionPane;

public class View {
    // Método para solicitar a largura da parede
    public double pedirLargura() {
        String input = JOptionPane.showInputDialog("Digite a largura da parede em metros:");
        return Double.parseDouble(input); // Converte a entrada para double
    }

    // Método para solicitar a altura da parede
    public double pedirAltura() {
        String input = JOptionPane.showInputDialog("Digite a altura da parede em metros:");
        return Double.parseDouble(input);
    }

    // Método para exibir o resultado da quantidade de latas
    public void exibirQuantidadeDeLatas(int quantidadeDeLatas) {
        JOptionPane.showMessageDialog(null,
                "Você precisará de " + quantidadeDeLatas + " lata(s) de tinta.");
    }
}
