package uni.edu.pe.conceptos;

import java.util.Arrays;

public class OrdenarStrings {
    public static void main(String[] args) {
        String[] frutas = {"mandarina", "manzana", "pera", "durazano", "fresa"};
        System.out.println(frutas.length);

        /*

        for(int i=0; i< frutas.length-1; i++){
            for (int j=i+1;j< frutas.length; j++){
                if(frutas[i].compareTo(frutas[j])>0){
                    String aux = frutas[i];
                    frutas[i] = frutas[j];
                    frutas[j]= aux;
                }
            }
        }

         */
        Arrays.sort(frutas);

        for(String fruta: frutas){
            System.out.println(fruta);
        }
    }
}
