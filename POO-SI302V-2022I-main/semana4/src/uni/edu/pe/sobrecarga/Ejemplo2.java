package uni.edu.pe.sobrecarga;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ejemplo2 {
    public static void main(String[] args) {
        System.out.println(add(1));
        int[] numeros = {1,2};
        int[] numeros3 = {1,2,3};

        ArrayList<Integer> enteros = new ArrayList<>();

        //ArrayList<Integer> enteros4 = new LinkedList<>();

        List<Integer> enteros2 = new ArrayList<>();
        List<Integer> enteros3 = new LinkedList<>();

        Vector<Integer> vector = new Vector<>();

        System.out.println(add(numeros));
        System.out.println(add(numeros3));
        System.out.println(add(1,2,3,4,5));
        System.out.println(add(1,2,3,4));
        //System.out.println(add(enteros));
    }

    public static int add(int... numeros){
        int contador = 0;
        for(int x:numeros){
            contador += x;
        }
        return contador;
    }

    /*
    public static int add(int[] numeros){
        int contador = 0;

        for(int x:numeros){
            contador += x;
        }
        return contador;
    }

     */

}
