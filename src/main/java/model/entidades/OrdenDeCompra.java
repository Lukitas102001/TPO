package model.entidades;

import model.dtos.DatosIvaDTO;

import java.util.Date;
import java.util.List;

public class OrdenDeCompra {

    private Proveedor proveedor;
    private List<ItemOrdenCompra> items;
    private Documento documento;
    private Integer cantidad;
    private Double precioAcordado;
    private Date fecha;

    public OrdenDeCompra(Proveedor proveedor) {

        this.proveedor = proveedor;
    }

    public DatosIvaDTO getDatosIVA() {
        return new DatosIvaDTO();
    }
}
