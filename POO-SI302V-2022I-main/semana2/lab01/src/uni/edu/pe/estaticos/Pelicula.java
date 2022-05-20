package uni.edu.pe.estaticos;

public class Pelicula {

    // inicializacion por defecto
    private static double precioMinimo;
    //inicializacion explicita
    private static int cantidadMinima=1;

    public static double getPrecioMinimo() {
        return precioMinimo;
    }

    public static void setPrecioMinimo(double precioMinimo) {
        Pelicula.precioMinimo = precioMinimo;
    }

    public static int getCantidadMinima() {
        return cantidadMinima;
    }

    public static void setCantidadMinima(int cantidadMinima) {
        Pelicula.cantidadMinima = cantidadMinima;
    }

    public Pelicula() {
        cantidadMinima ++;
    }
}
