package uni.edu.pe.casos.caso2;

public class Pelicula {

    private int id;
    private String titulo;
    private String tipo;
    private float precio;

    //...
    private static int ultimoId = 9000;
    //...
    public static int getUltimoId() {
        return ultimoId;
    }

    public Pelicula(String titulo, String tipo, float precio) {
        this();
        this.titulo = titulo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Pelicula() {
        this.id = ultimoId;
        ultimoId++;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static void setUltimoId(int ultimoId) {
        Pelicula.ultimoId = ultimoId;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
