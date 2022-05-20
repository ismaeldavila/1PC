package uni.edu.pe.dirigida;

import java.util.Scanner;

/**
 * Solucion del algoritmo de euclides, tomada de algunas de las soluciones de los alumnos.
 */
public class Prob9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int a, b, resultado;

        System.out.println("Ingrese primer numero: ");
        a = teclado.nextInt();
        System.out.println("Ingrese segundo numero: ");
        b = teclado.nextInt();

        resultado = ackerman(a,b);

        System.out.println("La funcion de Ackermann es: " + resultado );

    }
    private static int ackerman(int m, int n){
        if(m == 0){
            return n+1;
        }else if(m > 0 && n == 0){
            return ackerman(m-1,1);
        }else{
            return ackerman(m-1,ackerman(m,n-1));
        }
    }
}