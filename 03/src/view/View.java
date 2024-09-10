package view;

import javax.swing.JOptionPane;

public class View {
    // Método para solicitar a entrada de uma nota
    public double pedirNota(int numeroDaNota) {
        String input = JOptionPane.showInputDialog("Digite a nota " + numeroDaNota + ":");
        return Double.parseDouble(input); // Converte a entrada para double
    }

    // Método para exibir a média calculada
    public void exibirMedia(double media) {
        JOptionPane.showMessageDialog(null, String.format("A média das notas é: %.2f", media));
    }
}
