package uni.edu.pe.scannerEjm;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, direccion;
        int edad;
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine(); //leer el nombre
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt(); //leer la edad
        sc.nextLine(); //limpiar el buffer de entrada

        System.out.print("Introduce tu dirección: ");
        direccion = sc.nextLine(); //leer la dirección
        System.out.println("Datos introducidos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dirección: " + direccion);
    }
}

