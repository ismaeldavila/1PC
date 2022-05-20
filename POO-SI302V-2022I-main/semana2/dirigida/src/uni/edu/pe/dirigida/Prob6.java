package uni.edu.pe.dirigida;

public class Prob6 {
    public static void main(String[] args) {
        int n=234534123; //Numero "n"
        int cont = 0; //Cuenta numero de dígitos del numero
        int digito=0; //Digito a evaluar si es impar

        do {
            //Calculamos el digito a evaluar: Resto de dividir n entre 10.
            digito=n%10;

            //Si el digito es impar, aumenta en 1 el contador
            if (digito%2==1){
                cont=cont+1;
            }

            //Cambiamos n por la division n/10.
            n=n/10;
        } while(n>0);

        //Imprime el resultado
        System.out.println("La cantidad de digitos impares es: " + cont);
    }
}
