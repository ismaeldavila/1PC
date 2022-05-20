package uni.edu.pe.dirigida;

import java.util.Scanner;

/**
 * Solucion del algoritmo de euclides, tomada de algunas de las soluciones de los alumnos.
 */
public class Prob8 {
    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
        int a,b,r;

        System.out.println("Ingrese primer numero: ");
        a = teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        b = teclado.nextInt();

        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }

        int mcd = a;
        System.out.println("El MCD es: " + mcd);

    }
}
