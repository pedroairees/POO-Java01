package controller;

import model.Model;
import view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Método que coordena o fluxo do programa
    public void executar() {
        // Solicita os 3 números ao usuário por meio da View
        for (int i = 0; i < 3; i++) {
            double numero = view.pedirNumero(i + 1); // Pede o número 1, 2 e 3
            model.setNumero(i, numero); // Armazena o número no Model
        }

        // Ordena os números por meio do Model
        double[] numerosOrdenados = model.ordenarNumeros();

        // Exibe os números em ordem crescente por meio da View
        view.exibirResultado(numerosOrdenados);
    }
}
