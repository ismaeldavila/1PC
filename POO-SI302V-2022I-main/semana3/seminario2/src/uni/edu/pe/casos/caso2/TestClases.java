package uni.edu.pe.casos.caso2;

public class TestClases {

    public static void main (String[] args) {
        BaseDeDatos bd = new BaseDeDatos();
        System.out.println(bd.cliente1);
        System.out.println(bd.cliente2);
        System.out.println(bd.cliente3);
        System.out.println(bd.cliente4);
//...
        System.out.println(bd.pelicula1);
        System.out.println(bd.pelicula2);
        System.out.println(bd.pelicula3);
        System.out.println(bd.pelicula4);
        System.out.println(bd.pelicula5);
        System.out.println(bd.pelicula6);
//...
        System.out.println(Cliente.getUltimoId());
        System.out.println(Pelicula.getUltimoId());
    }

}
