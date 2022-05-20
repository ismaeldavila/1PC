package uni.edu.pe.lab02.prob1;

import java.util.Scanner;

public class Ecuacion {
    private double a;
    private double b;
    private double c;
    private double r1;
    private double r2;
    public static void main(String[] args) {

        Ecuacion ecuacion = new Ecuacion();

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el coeficiente 1");
        ecuacion.setA(sc.nextDouble());
        System.out.println("Ingrese el coeficiente 2");
        ecuacion.setB(sc.nextDouble());
        System.out.println("Ingrese el coeficiente 3");
        ecuacion.setC(sc.nextDouble());

        ecuacion.calcularRaices();


    }

    private void calcularRaices(){
        double d = 0;
        //(-b+sqrt(b^2-4ac))/2a
        //x^2-4x+3
        //x^2-2x+1

        d = Math.pow(b,2)-4*a*c;

        r1 = (-b + Math.sqrt(d))/(2*a);
        r2 = (-b - Math.sqrt(d))/(2*a);

        System.out.println("raiz 1: "+r1);
        System.out.println("raiz 2: "+r2);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }
}
