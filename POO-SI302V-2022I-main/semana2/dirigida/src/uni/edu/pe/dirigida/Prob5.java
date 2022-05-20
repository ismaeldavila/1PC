package uni.edu.pe.dirigida;

public class Prob5 {
    public static void main(String[] args) {
        float suma=0; //Suma total a calcular
        int n=4; //Cantidad de terminos de la serie a sumar
        float termino=0; //Termino a sumarse
        int impar=0; //Representa a un numero impar
        int cont=0; //Para generar impares y contar terminos sumados.
        int signo=1; //Representara el cambio de signo.

        do {
            //Calculamos el numero impar
            impar=2*cont+1;

            //Agregamos uno al contador
            cont=cont+1;

            //Calculamos el termino a sumar o restar.
            //Se convierte la variable impar a float para que no redondee la
            //operacion a enteros.
            termino=1/(float)impar;

            //Le colocamos el signo al termino
            termino=signo*termino;

            //Sumamos el termino a la suma total
            suma=suma+termino;

            //Cambiamos de signo
            signo=-signo;
        } while (cont<n);

        //Imprime el resultado de la suma
        System.out.println("La suma total es: " + suma);

    }
}
