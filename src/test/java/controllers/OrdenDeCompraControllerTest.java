package controllers;

import model.dtos.DatosIvaDTO;
import model.entidades.OrdenDeCompra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import views.OrdenesDeCompraDesktop;
import views.OrdenesDeCompraView;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

class OrdenDeCompraControllerTest {

    OrdenDeCompraController controller;
    OrdenesDeCompraView ordenesDeCompraView;
    ArrayList<OrdenDeCompra> ordenesDeCompra = new ArrayList<>();
    OrdenDeCompra ordenDeCompra;

    @BeforeEach
    public void setup() {

        ordenesDeCompraView = mock(OrdenesDeCompraDesktop.class);
        ordenDeCompra = mock(OrdenDeCompra.class);
        ordenesDeCompra.add(ordenDeCompra);

        controller = OrdenDeCompraController.obtenerInstancia();
        controller.setOrdenesDeCompra(ordenesDeCompra);
        controller.setOrdenesDeCompraView(ordenesDeCompraView);
    }

    @Test
    void obtieneDatosSobreIVA() {

        cuandoSeQuiereVerDatosDeIVA();

        verify(ordenDeCompra, atLeastOnce()).getDatosIVA();
    }

    @Test
    void obtieneDatosSobreIVAEnMasDeUnaOrdenDeCompra() {

        OrdenDeCompra ordenDeCompraMock = mock(OrdenDeCompra.class);
        ordenesDeCompra.add(ordenDeCompraMock);

        cuandoSeQuiereVerDatosDeIVA();

        verify(ordenDeCompra, atLeastOnce()).getDatosIVA();
        verify(ordenDeCompraMock, atLeastOnce()).getDatosIVA();
    }

    @Test
    void seMuestranEnPantallaLosDatosSobreIVA() {

        cuandoSeQuiereVerDatosDeIVA();

        verify(ordenesDeCompraView, atLeastOnce()).mostrarDatosIVA(anyListOf(DatosIvaDTO.class));
    }

    private void cuandoSeQuiereVerDatosDeIVA() {
        controller.verDatosIva();
    }
}