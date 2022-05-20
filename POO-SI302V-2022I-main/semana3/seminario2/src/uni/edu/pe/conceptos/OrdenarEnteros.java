package uni.edu.pe.conceptos;

import java.util.Arrays;
import java.util.Collections;

public class OrdenarEnteros {
    public static void main(String[] args) {
        Integer[] numeros = {8,15,3,7,0,4,6};
        Arrays.sort(numeros);
        for(int i:numeros){
            System.out.println(i);
        }

        System.out.println("<==== cambiando el orden ====>");

        Arrays.sort(numeros, Collections.reverseOrder());
        for(int i:numeros){
            System.out.println(i);
        }


    }
}
