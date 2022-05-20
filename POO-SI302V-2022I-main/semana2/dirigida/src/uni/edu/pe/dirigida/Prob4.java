package uni.edu.pe.dirigida;

public class Prob4 {
    public static void main(String[] args) {
        int n = 5, longitud = 0;
        String cadena = "123456789", car = "";
        System.out.println("Cadena Original:" + cadena);
        longitud = cadena.length();
        System.out.print("Cadena Invertida:");

        //Forma 1
        for (int i = longitud - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
        System.out.println();

        System.out.print("Cadena Invertida:");

        //Forma 2
        for (int i = 0; i < longitud; i++) {
            car = cadena.substring(longitud - i - 1, longitud - i);
            System.out.print(car);
        }
        System.out.println();

        //Forma 3
        StringBuilder input1 = new StringBuilder();
        // append a string into StringBuilder input1
        input1.append(cadena);
        // reverse StringBuilder input1
        input1.reverse();
        System.out.println("Cadena Invertida:"+input1);
    }
}
