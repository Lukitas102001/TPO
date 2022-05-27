package controllers;

import model.dtos.DatosIvaDTO;
import model.entidades.OrdenDeCompra;
import views.OrdenesDeCompraDesktop;
import views.OrdenesDeCompraView;

import java.util.ArrayList;

public class OrdenDeCompraController {

    private static OrdenDeCompraController controller;

    private ArrayList<OrdenDeCompra> ordenesDeCompra;
    private OrdenesDeCompraView ordenesDeCompraView;

    private OrdenDeCompraController() {
        ordenesDeCompra = new ArrayList<>();
        ordenesDeCompraView = new OrdenesDeCompraDesktop();
    }

    public static OrdenDeCompraController obtenerInstancia() {
        if(controller == null)
            controller = new OrdenDeCompraController();

        return controller;
    }

    public void verDatosIva() {

        ArrayList<DatosIvaDTO> datosIvaDTOS = new ArrayList<>();
        for(OrdenDeCompra orden: ordenesDeCompra) {
            datosIvaDTOS.add(orden.getDatosIVA());
        }

        ordenesDeCompraView.mostrarDatosIVA(datosIvaDTOS);
    }

    public void setOrdenesDeCompra(ArrayList<OrdenDeCompra> ordenesDeCompra) {
        this.ordenesDeCompra = ordenesDeCompra;
    }

    public void setOrdenesDeCompraView(OrdenesDeCompraView ordenesDeCompraView) {
        this.ordenesDeCompraView = ordenesDeCompraView;
    }
}
