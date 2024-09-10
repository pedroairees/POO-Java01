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
        // Solicita as 4 notas ao usuário por meio da View
        for (int i = 0; i < 4; i++) {
            double nota = view.pedirNota(i + 1); // Pede a nota (de 1 a 4)
            model.setNota(i, nota); // Armazena a nota no Model
        }

        // Calcula a média das notas por meio do Model
        double media = model.calcularMedia();

        // Exibe o resultado da média por meio da View
        view.exibirMedia(media);
    }
}
