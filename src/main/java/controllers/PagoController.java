package controllers;

import model.entidades.Pago;

public class PagoController {

    private static PagoController controller;

    private PagoController() {

    }

    public static PagoController obtenerInstancia() {

        if(controller == null)
            controller = new PagoController();

        return controller;
    }
}
