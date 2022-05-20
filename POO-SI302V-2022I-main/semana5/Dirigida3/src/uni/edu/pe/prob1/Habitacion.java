package uni.edu.pe.prob1;

public class Habitacion {
    public static final String HABITACION_SENCILLA="Sencilla";
    public static final String HABITACION_DOBLE="doble";
    public static final String HABITACION_SUITE="Suite";

    private String tipo;
    private int cantidad;

    public Habitacion(String tipo, int cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMontoPorTipo(String tipo){
        int monto=0;
        switch (tipo){
            case Habitacion.HABITACION_SENCILLA:
                monto = 100;
                break;
            case Habitacion.HABITACION_DOBLE:
                monto = 180;
                break;
            case Habitacion.HABITACION_SUITE:
                monto = 500;
                break;
            default:
                monto = 0;
                break;

        }
        return monto;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
