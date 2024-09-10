package view;

import javax.swing.JOptionPane;

public class View {
    // Método para solicitar a entrada de um número
    public double pedirNumero(int numero) {
        String input = JOptionPane.showInputDialog("Digite o número " + numero + ":");
        return Double.parseDouble(input); // Converte a entrada para double
    }

    // Método para exibir os números em ordem crescente
    public void exibirResultado(double[] numerosOrdenados) {
        String resultado = "Os números em ordem crescente são: ";
        for (double numero : numerosOrdenados) {
            resultado += String.format("%.2f ", numero); // Formata cada número para exibição
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
