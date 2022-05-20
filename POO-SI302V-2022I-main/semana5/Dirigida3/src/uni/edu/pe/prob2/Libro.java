package uni.edu.pe.prob2;

import java.util.Objects;

public class Libro {

    private String titulo;
    private String autor;
    private long isbn;
    private int nroPaginas;
    private int edicion;
    private String editorial;
    private String fechaEdicion;
    private String unidadesDisponibles;

    public Libro(String titulo, String autor, long isbn, int edicion, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.edicion = edicion;
        this.editorial = editorial;
    }

    public Libro() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public void setNroPaginas(int nroPaginas) {
        this.nroPaginas = nroPaginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }



    public String getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(String fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public boolean validaISBN(long numeroIsbn) {

        int sum = 0;
        int i, t, intNumber, dNumber;
        String strNumber;

        strNumber = ""+numeroIsbn;

        if (strNumber.length() != 10) {
            return false;
        }

        for (i = 0; i < strNumber.length(); i++) {
            intNumber = Integer.parseInt(strNumber.substring(i, i+1));
            dNumber = i + 1;
            t = dNumber * intNumber;
            sum = sum + t;
        }
        //System.out.println(sum);
        // check whether the sum is divisible by 11 or not
        if ((sum % 11) == 0) {
            return true;
        }

        return false;
    }

    public boolean validaISBN() {
        return validaISBN(this.getIsbn());
    }

    public void imprimirLibro(){
        String libro = "Libro{" +
            "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", Edicion=" + edicion +
                    ", editorial='" + editorial + '\'' +
                '}';
    }

    public void imprimirDetalleLibro(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                ", nroPaginas=" + nroPaginas +
                ", Edicion=" + edicion +
                ", editorial='" + editorial + '\'' +
                ", fechaEdicion='" + fechaEdicion + '\'' +
                ", unidadesDisponibles='" + unidadesDisponibles + '\'' +
                '}';
    }

    public String getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(String unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }
}
