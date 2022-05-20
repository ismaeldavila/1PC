package uni.edu.pe.laboratorio1;

import java.util.Arrays;

public class Venta {

    private String codigoVenta;
    private Producto[] productos;

    private float totalVenta;

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "codigoVenta='" + codigoVenta + '\'' +
                ", productos=" + Arrays.toString(productos) +
                ", totalVenta=" + totalVenta +
                '}';
    }

    public Venta() {
    }

    public Venta(String codigoVenta, Producto[] productos) {
        this.codigoVenta = codigoVenta;
        this.productos = productos;
    }
}
