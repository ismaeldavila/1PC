package uni.edu.pe.dirigida2completa.prob3;

public class Vendedor {
    private String nombre;
    private int edad;
    private float ventas;
    private float sueldoFijo;
    private static int cantidadVendedores=0;

    public Vendedor() {
        cantidadVendedores++;
    }

    public Vendedor(String nombre, float ventas) {
        this();
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public static int getCantidad() {
        return cantidadVendedores;
    }

    public float getSueldo(){
        return 0.25f*ventas + this.sueldoFijo;
    }

    public static void setCantidadVendedores(int cantidadVendedores) {
        Vendedor.cantidadVendedores = cantidadVendedores;
    }

    public Vendedor(String nombre, int edad, float ventas, float sueldoFijo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.ventas = ventas;
        this.sueldoFijo = sueldoFijo;
    }


}
