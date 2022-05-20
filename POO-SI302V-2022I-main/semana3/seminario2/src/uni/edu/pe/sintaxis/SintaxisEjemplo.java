package uni.edu.pe.sintaxis;

import java.util.ArrayList;
import java.util.List;

public class SintaxisEjemplo {

    public static void main(String[] args) {

        int x = 3, y = 5;
        int mayor = (x > y) ? x : y;  //Asigna el valor mayor de X e Y
        int menor = (x < y) ? x : y;  //Asigna el valor menor de X e Y

        System.out.println(mayor);
        System.out.println(menor);
        System.out.println("\n");

        int dia = 4;
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Tienes que ir a trabajar");
                break;
            case 6:
            case 7:
                System.out.println("Quedate en casa");
                break;
            default:

                System.out.println("En que planeta vives?");

        }
        System.out.println("\n");


        int num = 1;
        if (num % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");

        System.out.println("\n");


        int j = 1;                         //inicializacion
        while (j <= 10) {                 //condicion de repeticion
            System.out.println(j * 3.5);   //cuerpo
            j++;                         //iteracion
        }
        System.out.println("\n");

        int k = 1;                             //inicializacion
        do {
            System.out.println(k * 3.5);     //cuerpo
            k++;                             //iteracion
        } while (k <= 10);                 //condicion

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 3.5);
        }
        System.out.println("\n");


        String[] lista = new String[]{"hola", "que", "tal", "estas"};
        for (String cadena : lista) {
            System.out.println(cadena);
        }

        for(int i=0;i< lista.length;i++){
            System.out.println(lista[i]);
        }

        List<String> listaDin = new ArrayList<>();
        listaDin.add("hola");
        listaDin.add( "que");
        for (String cadena : listaDin) {
            System.out.println(cadena);
        }
    }
}