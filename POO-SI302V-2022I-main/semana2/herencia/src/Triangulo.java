public class Triangulo extends Figura {

    protected float base;
    protected float altura;

    public void calcularArea(){
        System.out.println("calculo del area del cuadrado");
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
