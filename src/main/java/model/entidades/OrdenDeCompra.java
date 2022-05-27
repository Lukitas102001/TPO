package model.entidades;

import model.dtos.DatosIvaDTO;

public class OrdenDeCompra {

    private Proveedor proveedor;

    public OrdenDeCompra(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public DatosIvaDTO getDatosIVA() {
        return new DatosIvaDTO();
    }
}
