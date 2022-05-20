package uni.edu.pe.prob3;

import java.util.Scanner;

public class MultiplicacionRusa {
    public static void main(String[] args) {
        //String cadena = "51-22>37-12>21-7>48-13";
        System.out.println("Ingrese la cadena a procesar");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.next();
        String[] multiplicandos = cadena.split(">");
        for(String s: multiplicandos){
            String[] m = s.split("-");
            int resultado = multiplicacionRusa(Integer.valueOf(m[0]),Integer.valueOf(m[1]));
            System.out.println("Multiplicador: "+m[0]+" multiplicando: "+m[1]+" Resultado: "+resultado);
        }
        System.out.println();
    }

    public static int multiplicacionRusa(int a, int b){
        int c=0;
        while(a!=0){
            if(a % 2 != 0){
                c = c + b;
            }
            a = a / 2;
            b = b * 2;
        }
        return c;
    }
}

