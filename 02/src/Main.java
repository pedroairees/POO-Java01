import model.Model;
import view.View;
import controller.Controller;


public class Main {
    public static void main(String[] args) {
        // Instancia o Model, View e Controller
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Executa o programa
        controller.executar();
    }
}