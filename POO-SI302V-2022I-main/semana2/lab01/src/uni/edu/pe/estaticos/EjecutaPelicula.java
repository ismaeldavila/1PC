package uni.edu.pe.estaticos;

public class EjecutaPelicula {
    public static void main(String[] args) {
        Pelicula.setCantidadMinima(12);
        System.out.println(Pelicula.getCantidadMinima());

        Pelicula p1 = new Pelicula();
        Pelicula p2 = new Pelicula();
        System.out.println(Pelicula.getCantidadMinima());

    }
}
