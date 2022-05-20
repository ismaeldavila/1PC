package uni.edu.pe.dirigida;

public class Prob7 {
    public static void main(String[] args) {
        int n=31; //Numero a evaluar si es primo o no.
        int cont=1; //Contador que genera divisores.
        boolean primo=true; //Indica si el numero es primo o no.

        do {
            //Contador le agrega 1.  Empieza a evaluar en 2.
            cont=cont+1;

            //Si el n es divisible por cont y cont es diferente de n
            if ((n%cont==0) && (cont!=n)){
                //El numero n no es primo
                primo=false;
                //Ya no hay que seguir evaluando.  Termina el do while
                break;
            }
        } while (cont<n);

        //Si el numero es primo
        if (primo){
            System.out.println("El numero "+ n +" es primo.");
        } else  { //sino
            System.out.println("El numero "+ n +" no es primo.");
        }
    }
}
