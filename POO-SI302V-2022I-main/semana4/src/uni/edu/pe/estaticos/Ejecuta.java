package uni.edu.pe.estaticos;

public class Ejecuta {
    private String nombre;
    private static String apellido;

    public static void main(String[] args) {
        Ejecuta ejecuta = new Ejecuta();
        ejecuta.calcular();

        ejecuta.setNombre("Junal");

        setApellido("Bryan");

        System.out.println(getApellido());

        calcular2();

        Ejecuta.calcular2();

    }

    public void calcular(){
        System.out.println("Dentro de calcular");
        this.setNombre("nestor");
    }

    public static void calcular2(){
        System.out.println("Dentro de calcular2");

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static String getApellido() {
        return apellido;
    }

    public static void setApellido(String apellido) {
        Ejecuta.apellido = apellido;
    }
}
