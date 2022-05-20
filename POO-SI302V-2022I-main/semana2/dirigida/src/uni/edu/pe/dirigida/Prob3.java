package uni.edu.pe.dirigida;

public class Prob3 {
    public static void main(String[] args) {
        long a;
        a = Math.round(Math.random() * 100);
        System.out.print("El nomero aleatorio: " + a + " es ");
        if (a % 2 == 0) {
            System.out.println("par.");
        } else {
            System.out.println("impar.");
        }
    }
}
