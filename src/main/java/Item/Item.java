package Item;

import java.util.List;

public class Item {
    private Articulo articulo;
    private int precioUnitarioArticulo;
    private int articuloCantidad;

    public Item(Articulo articulo, int precioUnitarioArticulo, int articuloCantidad) {
        this.articulo = articulo;
        this.precioUnitarioArticulo = precioUnitarioArticulo;
        this.articuloCantidad = articuloCantidad;
    }

    public int precioTotalItem(){
        return this.precioUnitarioArticulo * this.articuloCantidad;
    }

}
