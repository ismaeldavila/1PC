public class Auto {
    private int id;
    private String modelo;
    private String color;

    public Auto(int id, String modelo, String color) {
        this.id = id;
        this.modelo = modelo;
        this.color = color;
    }

    public Auto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo(){
        return "B"+this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
