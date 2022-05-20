package uni.edu.pe.interfaceEjemplo;

public interface Desplazable {
    void acelerar();
    void desacelerar();

    void frenar();

    default void rotar(){
        System.out.println("Dentro de Rotar");
    }
}
