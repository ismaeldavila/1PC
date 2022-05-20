package uni.edu.pe.interfaceEjemplo;

public interface Consumible {
    void calcularRecorrido();
    default void recargarCombustible() {
        System.out.println("dentro de calcular recorrido");
    }
}
