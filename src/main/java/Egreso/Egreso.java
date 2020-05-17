package Egreso;

import Item.Item;
import Organizacion.Organizacion;
import Proveedor.Proveedor;

import java.time.LocalDate;
import java.util.List;

public class Egreso {
    private Organizacion organizacion;
    private Proveedor proveedor;
    private LocalDate egresoFecha = LocalDate.now();
    private DocumentoComercial egresoDocumento;
    private MetodoDePago metodoDePago;
    private List <Item> items;


    public int valorTotalEgreso() {
        return  items.stream().mapToInt(Item::precioTotalItem).sum();
    }

}