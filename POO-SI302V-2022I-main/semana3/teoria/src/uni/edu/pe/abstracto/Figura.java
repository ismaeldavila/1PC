package uni.edu.pe.abstracto;

public abstract class Figura {
    private String color;


    public String getColor() {
        return color;
    }

    abstract double area();
    abstract double perimetro();

    void trasladar(){
        System.out.println("dentro de trasladar");
    }

    public void setColor(String color) {
        this.color = color;
    }
}
