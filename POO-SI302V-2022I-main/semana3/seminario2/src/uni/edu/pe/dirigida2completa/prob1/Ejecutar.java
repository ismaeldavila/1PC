package uni.edu.pe.dirigida2completa.prob1;

import java.util.ArrayList;
import java.util.List;

public class Ejecutar {
    public static void main(String[] args) {
        List<Empleado> lst = new ArrayList<>();

        //implementando la lectura por teclado, sin validaciones
        ingresarDataPorTeclado(lst);

        //llamando a un metodo que llene datos de forma predeterminada
        //ingresarDataPrefijada(lst);

        int nroEmp= lst.size();
        for(int i=0; i<nroEmp-1;i++){
            for(int j=i+1;j<nroEmp;j++){
                if(lst.get(i).equals(lst.get(j))){
                    System.out.println("empleados iguales encontradas");
                    // agregandole una excepción para validar, bastaba con el mensaje anterior
                    throw new RuntimeException("Empleados iguales");
                }
            }
        }

        for(Empleado e : lst){
            e.visualizaTodo();
        }
    }

    private static void ingresarDataPorTeclado(List<Empleado> lst) {
        //TODO: En caso no se quiera implementar la lectura por teclado
        Empleado e1 = new Empleado("Nestor", "Audante","44444444",1230.00d,20d,5,Empleado.TIPO_IR, "soltero", 0);
        Empleado e2 = new Empleado("Juan", "Rivadeneyra","44444411",2230.00d,20d,8,Empleado.TIPO_IR, "casado", 2);
        Empleado e3 = new Empleado("Jorge", "Lopez","44444422",1250.00d,20d,10,Empleado.TIPO_IR, "soltero", 0);
        Empleado e4 = new Empleado("Rainer", "Torres","44444433",3230.00d,20d,6,Empleado.TIPO_IR, "casado", 3);
        Empleado e5 = new Empleado("Juan", "Apolaya","44444444",3230.00d,20d,6,Empleado.TIPO_IR, "casado", 3);

        lst.add(e1);
        lst.add(e2);
        lst.add(e3);
        lst.add(e4);
        lst.add(e5);
    }
}
