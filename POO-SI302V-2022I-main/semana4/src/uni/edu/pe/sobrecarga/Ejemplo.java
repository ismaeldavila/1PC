package uni.edu.pe.sobrecarga;

public class Ejemplo {

    public static void main(String[] args) {
        Ejemplo ejemplo = new Ejemplo();
        System.out.println(ejemplo.add(1));

        System.out.println(ejemplo.add(1,2));
        System.out.println(ejemplo.add(1,2,3));
        System.out.println(ejemplo.add(1,2,3,4));
        System.out.println(ejemplo.add("Suma",1,2,3,4));
        System.out.println(ejemplo.add("1","2"));


    }

    public int add(int... numeros){
        int acumulador = 0;

        for(int x:numeros){
            acumulador += x;
        }
        return acumulador;
    }

    public int add(String mensaje, int... numeros){
        int acumulador = 0;

        for(int x:numeros){
            acumulador += x;
        }
        System.out.println(mensaje);
        return acumulador;
    }


    int add(int x){
        return x+7;
    }

    /*

    int add (int x, int y ){
        return x+y;

    }

    int add(int x, int y, int z){
        return x+y+z;
    }

    int add(int x, int y, int z, int w){
        return x+y+z+w;
    }
    */


    int add(String a, String b){
        return Integer.valueOf(a)+Integer.valueOf(b);
    }
}
