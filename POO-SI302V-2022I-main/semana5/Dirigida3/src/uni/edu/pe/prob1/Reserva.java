package uni.edu.pe.prob1;

import java.util.Arrays;

public class Reserva {

    private Usuario usuario;
    private Habitacion[] habitaciones;
    private int nroReserva;
    private int montoReserva;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Reserva(Usuario usuario, Habitacion[] habitaciones) {
        this.usuario = usuario;
        this.habitaciones = habitaciones;
        this.nroReserva = Integer.valueOf(obtenerNumeroReserva());
        this.montoReserva = obtenerMontoReserva();
    }

    private String obtenerNumeroReserva(){
        return this.usuario.getDni().substring(4);
    }

    private int obtenerMontoReserva(){
        int monto=0;
        for(Habitacion hab: this.habitaciones){
            monto += hab.getMontoPorTipo(hab.getTipo())* hab.getCantidad();
        }
        return monto;
    }

    public int getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(int nroReserva) {
        this.nroReserva = nroReserva;
    }

    public int getMontoReserva() {
        return montoReserva;
    }

    public void setMontoReserva(int montoReserva) {
        this.montoReserva = montoReserva;
    }


    @Override
    public String toString() {
        return "Reserva{" +
                "usuario=" + usuario +
                ", habitaciones=" + Arrays.toString(habitaciones) +
                ", nroReserva=" + nroReserva +
                ", montoReserva=" + montoReserva +
                '}';
    }
}
