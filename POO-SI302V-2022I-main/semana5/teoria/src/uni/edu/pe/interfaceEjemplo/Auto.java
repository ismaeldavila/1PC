package uni.edu.pe.interfaceEjemplo;

public abstract class Auto extends Vehiculo implements Desplazable, Consumible {
    @Override
    public void acelerar() {
        System.out.println("<==== Auto: Acelerar =====>");
    }

    @Override
    public void desacelerar() {
        System.out.println("<==== Auto: desacelerar =====>");
    }


    @Override
    public void calcularRecorrido() {
        System.out.println("<==== Auto: calcularRecorrido =====>");
    }
}
