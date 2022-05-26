public class ConsultasGeneralesController {

    private ConsultasGeneralesController controller;
    private ConsultasGeneralesController() {}

    public ConsultasGeneralesController obtenerInstancia() {
        if(controller == null)
            controller = new ConsultasGeneralesController();

        return controller;
    }

}
