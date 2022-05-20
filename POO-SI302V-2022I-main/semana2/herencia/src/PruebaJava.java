public class PruebaJava {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setDireccion("Su casa");
        alumno.setNombre("nestor");
        System.out.println(alumno.getNombre()+" "+alumno.getDireccion());
    }
}

class Alumno{
    private String nombre;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
