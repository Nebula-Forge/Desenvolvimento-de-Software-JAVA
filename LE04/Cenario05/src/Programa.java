import br.edu.up.model;
import br.edu.up.controller;
import br.edu.up.view;

public class Programa {
    public static void main(String[] args) {
        EmpresaDeEventosModel model = new EmpresaDeEventosModel();
        EmpresaDeEventosView view = new EmpresaDeEventosView();
        EmpresaDeEventosController controller = new EmpresaDeEventosController(model, view);
        controller.iniciar();
    }
}
