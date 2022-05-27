package controllers;

import model.entidades.Proveedor;

import java.util.ArrayList;

public class ConsultasGeneralesController {

    private ConsultasGeneralesController controller;

    private ArrayList<Proveedor> proveedores;

    private ConsultasGeneralesController() {
        proveedores = new ArrayList<>();
    }

    public ConsultasGeneralesController obtenerInstancia() {
        if(controller == null)
            controller = new ConsultasGeneralesController();

        return controller;
    }

}
