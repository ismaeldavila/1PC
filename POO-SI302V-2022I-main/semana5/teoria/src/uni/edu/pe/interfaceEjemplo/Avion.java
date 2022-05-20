package uni.edu.pe.interfaceEjemplo;

public class Avion implements Desplazable, Consumible {
    @Override
    public void acelerar() {
        System.out.println("<==== Avion: Acelerar =====>");
    }

    @Override
    public void desacelerar() {
        System.out.println("<==== Avion: Acelerar =====>");
    }

    @Override
    public void frenar() {

    }

    @Override
    public void calcularRecorrido() {
        System.out.println("<==== Avion: calcularRecorrido =====>");
    }
}
