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

    //Método que coordena o fluxo do programa
    public void executar() {
        // Solicita os dados ao usuário por meio da View
        model.setCusto(view.pedirCusto());
        model.setFrete(view.pedirFrete());
        model.setDespesas(view.pedirDespesas());
        model.setValorVenda(view.pedirValorVenda());

        // Calcula o lucro percentual por meio do Model
        double lucroPercentual = model.calcularLucroPercentual();

        // Exibe o resultado por meio da View
        view.exibirLucroPercentual(lucroPercentual);
    }
}
