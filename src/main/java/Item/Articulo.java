package Item;

import Proveedor.Proveedor;

public class Articulo {
    private int codigoarticulo;
    private String descripcionArticulo;
    private int precioActual;
    private Proveedor proveedor;


    public Articulo(int codigoarticulo, String descripcionArticulo, int precioActual) {
        this.codigoarticulo = codigoarticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.precioActual = precioActual;
    }
}
