package uni.edu.pe.internas;

public class Principal {
    class Secundaria{
        int edad = 18;
        public int getEdad() {
            return edad;
        }
        public void setEdad(int edad) {
            this.edad = edad;
        }
    }


    public static void main(String[] args) {

        Principal p = new Principal();
        Principal.Secundaria sec = p.new Secundaria();
        System.out.println(sec.getEdad());

        Principal.Secundaria sec2 = new Principal().new Secundaria();
        System.out.println(sec2.getEdad());
    }
}
