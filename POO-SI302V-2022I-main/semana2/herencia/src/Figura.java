public class Figura {
    protected float coordX;
    protected float coordY;

    public void rotar(){
        System.out.println("Rotacion de la figura");
    }

    public void trasladar(){
        System.out.println("Traslacion de la figura");
    }

    public void calcularArea(){
        System.out.println("Calcular area de la figura");
    }

    public float getCoordX() {
        return coordX;
    }

    public void setCoordX(float coordX) {
        this.coordX = coordX;
    }

    public float getCoordY() {
        return coordY;
    }

    public void setCoordY(float coordY) {
        this.coordY = coordY;
    }
}
