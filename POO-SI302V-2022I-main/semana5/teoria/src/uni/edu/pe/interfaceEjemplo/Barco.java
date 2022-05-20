package uni.edu.pe.interfaceEjemplo;

public class Barco implements Desplazable, Consumible {
    @Override
    public void acelerar() {
        System.out.println("<==== Barco: Acelerar =====>");
    }

    @Override
    public void desacelerar() {
        System.out.println("<==== Barco: Acelerar =====>");
    }

    @Override
    public void frenar() {

    }

    @Override
    public void calcularRecorrido() {
        System.out.println("<==== Barco: calcularRecorrido =====>");
    }
}
