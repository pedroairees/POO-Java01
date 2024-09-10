package controller;

import model.Model;
import  view.View;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // Método que coordena o fluxo do programa
    public void executar() {
        // Solicita as medidas ao usuário por meio da View
        model.setLargura(view.pedirLargura());
        model.setAltura(view.pedirAltura());

        // Calcula a quantidade de latas de tinta por meio do Model
        int quantidadeDeLatas = model.calcularQuantidadeDeLatas();

        // Exibe o resultado por meio da View
        view.exibirQuantidadeDeLatas(quantidadeDeLatas);
    }
}
