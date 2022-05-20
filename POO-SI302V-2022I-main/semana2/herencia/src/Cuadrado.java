public class Cuadrado extends Figura {
    private float lado;
    public void calcularArea(){
        System.out.println("calculo del area del cuadrado");
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
