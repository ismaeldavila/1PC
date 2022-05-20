package uni.edu.pe.sobreescritura;

public class Ejecuta {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();
        cb.setBalance(10);
        System.out.println("cuenta bancaria: balance: "+cb.getBalance());

        CuentaInversiones ci = new CuentaInversiones();
        ci.setMontoEnEfectivo(2);
        ci.setMontoDeInversiones(4);
        System.out.println("monto inversiones: "+ci.getMontoDeInversiones());
        System.out.println("monto efectivo: "+ci.getMontoEnEfectivo());
        System.out.println("cuenta inversiones: balance: "+ci.getBalance());
    }
}
