package uni.edu.pe.sintaxis;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, direccion;
        int edad;
        System.out.print("Introduce tu nombre: ");
        nombre = sc.nextLine(); //leer el nombre
        System.out.print("Introduce tu edad: ");
        edad = sc.nextInt(); //leer la edad

        sc.nextLine(); //limpiar el buffer de entrada

        System.out.print("Introduce tu direccion: ");
        direccion = sc.nextLine(); //leer la direccion

        sc.close();


        System.out.println("Datos introducidos");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccion);
    }
}