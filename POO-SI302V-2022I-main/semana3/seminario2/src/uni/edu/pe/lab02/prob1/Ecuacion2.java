package uni.edu.pe.lab02.prob1;

import java.util.Scanner;

public class Ecuacion2 {
    public static void main(String[] args) {

        double a = 1;
        double b=-4;
        double c= 3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente 1");
        a = sc.nextDouble();
        System.out.println("Ingrese el coeficiente 2");
        b=sc.nextDouble();
        System.out.println("Ingrese el coeficiente 3");
        c= sc.nextDouble();


        double d = 0;
        //(-b+sqrt(b^2-4ac))/2a
        //x^2-4x+3
        //x^2-2x+1
        double r1, r2;
        d = Math.pow(b,2)-4*a*c;

        r1 = (-b + Math.sqrt(d))/(2*a);
        r2 = (-b - Math.sqrt(d))/(2*a);

        System.out.println("raiz 1: "+r1);
        System.out.println("raiz 2: "+r2);
    }
}
