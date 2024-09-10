package view;

import javax.swing.JOptionPane;

public class View {
    // Método para solicitar a entrada de um número
    public double pedirNumero(int numero) {
        String input = JOptionPane.showInputDialog("Digite o número " + numero + ":");
        return Double.parseDouble(input); // Converte a entrada para double
    }

    // Método para exibir o maior e menor número
    public void exibirResultado(double maior, double menor) {
        JOptionPane.showMessageDialog(null,
                String.format("O maior número é: %.2f\nO menor número é: %.2f", maior, menor));
    }
}
