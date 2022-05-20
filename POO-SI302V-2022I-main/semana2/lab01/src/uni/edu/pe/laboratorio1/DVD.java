package uni.edu.pe.laboratorio1;

public class DVD {

    public static void main(String[] args) {
        DVD dvd = new DVD();
        dvd.setPrecio();
        dvd.setPrecio(1.5f);
    }
    private float precio;
    public void setPrecio() {
        precio = 5.50f;
    }
    public void setPrecio(float nuevoPrecio) {
        precio = nuevoPrecio;
    }
}
