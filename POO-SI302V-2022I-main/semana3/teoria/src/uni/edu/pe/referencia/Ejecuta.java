package uni.edu.pe.referencia;

import java.util.Objects;

public class Ejecuta {

    public static void main(String[] args) {
        Book b = new Book("001","book 1");
        Book c = new Book("002","book 2");
        Book e = new Book("002","book 2");
        Book f = new Book("002","book 3");

        System.out.println("b: "+b);
        System.out.println("c: "+c);

        Book d = c;
        System.out.println("d: "+d);

        d.setCount(d.getCount()+1);

        System.out.println("c: "+c);
        System.out.println("d: "+d);

        System.out.println(c==e);
        System.out.println(c.equals(e));
        System.out.println(c.equals(f));
    }
}


class Book {
    private String code;
    private String descripcion;
    private int count =2;
    public Book(String code, String descripcion) {
        this.code = code;
        this.descripcion = descripcion;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(code, book.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, descripcion);
    }
}