package uni.edu.pe.sintaxis;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner("Nestor 24 Julio 12")) {
            String nombre1 = sc.next();
            int edad1 = sc.nextInt();
            String nombre2 = sc.next();
            int edad2 = sc.nextInt();
            System.out.println(nombre1 + ": " + edad1);  //Nestor: 24
            System.out.println(nombre2 + ": " + edad2);  //Julio: 12
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error al extraer la edad");
        }

    }

}
